package com.example.lab4verb;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.discovery.*;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4VerbApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab4VerbApplication.class, args);
    }

}
