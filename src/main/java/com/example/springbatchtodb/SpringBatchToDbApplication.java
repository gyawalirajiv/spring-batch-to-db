package com.example.springbatchtodb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchToDbApplication implements CommandLineRunner {
    @Value("${spring.datasource.username}")
    private String user;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.url}")
    private String url;

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchToDbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("THE USER IS " + user);
        System.out.println("THE PASSWORD IS " + password);
        System.out.println("THE USER IS " + url);
    }
}
