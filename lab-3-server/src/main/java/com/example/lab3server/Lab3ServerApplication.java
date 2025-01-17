package com.example.lab3server;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.config.server.*;

@SpringBootApplication
@EnableConfigServer
public class Lab3ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab3ServerApplication.class, args);
    }

}
