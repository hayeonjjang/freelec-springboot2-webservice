package com.hayeon.book.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// @EnableJpaAuditing
@SpringBootApplication
// 스프링 부트의 자동 설정

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}