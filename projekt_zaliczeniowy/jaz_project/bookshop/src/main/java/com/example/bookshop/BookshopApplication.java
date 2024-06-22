package com.example.bookshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@Configuration
@EntityScan(basePackages = "com.example.bookshop.model")
@EnableJpaRepositories(basePackages = "com.example.bookshop.repository")
@EnableFeignClients
public class BookshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookshopApplication.class, args);
    }

}