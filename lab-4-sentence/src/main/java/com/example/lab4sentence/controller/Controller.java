package com.example.lab4sentence.controller;

import java.net.*;
import java.util.*;

import org.springframework.cloud.client.*;
import org.springframework.cloud.client.discovery.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.*;

@RestController
public class Controller {

    private DiscoveryClient discoveryClient;

    public Controller(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/sentence")
    public @ResponseBody String getSentence() {
        return this.getWord("LAB-4-SUBJECT") + " " + this.getWord("LAB-4-VERB") + " " + this.getWord("LAB-4-ARTICLE")
                + " " + this.getWord("LAB-4-ADJECTIVE") + " " + this.getWord("LAB-4-NOUN") + ".";
    }

    public String getWord(String service) {
        final List<ServiceInstance> list = this.discoveryClient.getInstances(service);
        if (list != null && list.size() > 0) {
            final URI uri = list.get(0).getUri();
            if (uri != null) {
                return (new RestTemplate()).getForObject(uri, String.class);
            }
        }
        return null;
    }

}
