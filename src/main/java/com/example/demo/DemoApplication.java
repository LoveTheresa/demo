package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //test
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("hello");
        System.out.println("bye");
        System.out.println("third");
        System.out.println("hot-fix");
        System.out.println("git-push");
        System.out.println("git-pull");
    }

}
