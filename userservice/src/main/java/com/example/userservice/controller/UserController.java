package com.example.userservice.controller;

import com.example.feignclientutil.client.WebServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private WebServiceFeignClient webServiceFeignClient;
    @GetMapping("/get")
    String get(){
        String client = webServiceFeignClient.client();
        return client;
    }
}
