package com.example.feignclientutil.client;

import com.example.feignclientutil.config.FeignLogConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "webservice",  configuration = FeignLogConfiguration.class)
public interface WebServiceFeignClient {
    @GetMapping("/web/get")
    String client();
}
