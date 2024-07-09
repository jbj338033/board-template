package com.jmo.boardtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BoardTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardTemplateApplication.class, args);
    }

}
