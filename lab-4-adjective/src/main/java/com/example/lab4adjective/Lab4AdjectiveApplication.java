package com.example.lab4adjective;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.discovery.*;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4AdjectiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab4AdjectiveApplication.class, args);
    }

}
