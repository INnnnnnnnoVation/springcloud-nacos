package com.example.springcloudnacos;

import org.apache.commons.logging.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringcloudNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudNacosApplication.class, args);
        System.out.println("start=============");
    }
}
