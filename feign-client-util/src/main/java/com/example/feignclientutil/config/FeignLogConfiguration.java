package com.example.feignclientutil.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FeignLogConfiguration {
    @Bean
    public Logger.Level level(){
        return Logger.Level.BASIC;
    }
}
