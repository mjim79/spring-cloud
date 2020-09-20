package com.example.lab4noun;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.discovery.*;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4NounApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab4NounApplication.class, args);
    }

}
