package com.greenfox.csaba.reddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PseudoRedditApplication {

    public static void main(String[] args) {
        SpringApplication.run(PseudoRedditApplication.class, args);
    }
}
