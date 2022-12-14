package com.example.part2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Part2Application {

    public static void main(String[] args) {
        SpringApplication.run(Part2Application.class, args);
    }

}
