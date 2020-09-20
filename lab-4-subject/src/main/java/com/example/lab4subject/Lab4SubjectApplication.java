package com.example.lab4subject;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.discovery.*;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4SubjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab4SubjectApplication.class, args);
    }

}
