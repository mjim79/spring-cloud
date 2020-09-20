package com.example.lab4eurekaserver;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.server.*;

@SpringBootApplication
@EnableEurekaServer
public class Lab4EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab4EurekaServerApplication.class, args);
    }

}
