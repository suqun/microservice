/*
 * Copyright 2016 Wicresoft, Inc. All rights reserved.
 */
package com.ow.wises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 通过@EnableDiscoveryClient注解来添加发现服务能力
 * 使用@EnableCircuitBreaker注解开启断路器功能
 * 创建RestTemplate实例，并通过@LoadBalanced注解开启均衡负载能力
 *
 * @author larry.quns
 *         Created on 16/8/1
 * @version $$Id:$$
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class RibbonApplication {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
    }
}
