package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class SpringbootWithMongo {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootWithMongo.class, args);
    }
}