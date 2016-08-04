/*
 * Copyright 2016 Wicresoft, Inc. All rights reserved.
 */
package com.ow.wises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 通过@EnableDiscoveryClient注解来添加发现服务能力。
 * 通过@EnableFeignClients注解开启Feign功能
 *
 * @author larry.quns
 *         Created on 16/8/1
 * @version $$Id:$$
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
