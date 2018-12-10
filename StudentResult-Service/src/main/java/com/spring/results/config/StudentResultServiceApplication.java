package com.spring.results.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.results")
@EnableEurekaClient
public class StudentResultServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentResultServiceApplication.class, args);
    }

}