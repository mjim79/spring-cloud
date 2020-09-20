package com.example.lab4article;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.discovery.*;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4ArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab4ArticleApplication.class, args);
    }

}
