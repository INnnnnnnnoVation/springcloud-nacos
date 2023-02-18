package com.example.webservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
//nacos配置热更新
public class ProfileConfig {
    @Value("${spring.cloud.nacos.discovery.cluster-name}")
    String clusterName;
}
