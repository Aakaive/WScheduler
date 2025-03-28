package com.aaka.wscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WSchedulerApplication.class, args);
    }

}
