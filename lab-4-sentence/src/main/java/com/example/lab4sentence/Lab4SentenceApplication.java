package com.example.lab4sentence;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.discovery.*;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4SentenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab4SentenceApplication.class, args);
    }

}
