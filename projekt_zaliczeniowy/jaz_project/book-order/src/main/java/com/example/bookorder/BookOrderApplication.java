package com.example.bookorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.bookorder.repository")
@EntityScan("com.example.bookorder.model")
public class BookOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookOrderApplication.class, args);
    }
}