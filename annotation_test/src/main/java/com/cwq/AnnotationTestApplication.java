package com.cwq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenwq  2022/11/24 20:05
 **/
@SpringBootApplication
public class AnnotationTestApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(AnnotationTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("启动");
    }
}
