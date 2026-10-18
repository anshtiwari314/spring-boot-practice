package com.example.firstproject.Todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MainClass {
    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
        System.out.println("hello world");
    }
}
