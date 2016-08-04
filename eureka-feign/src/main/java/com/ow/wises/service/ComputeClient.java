/*
 * Copyright 2016 Wicresoft, Inc. All rights reserved.
 */
package com.ow.wises.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用@FeignClient("compute-service")注解来绑定该接口对应compute-service服务
 * 通过Spring MVC的注解来配置compute-service服务下的具体实现。
 * 使用@FeignClient注解中的fallback属性指定回调类
 * @author larry.quns
 *         Created on 16/8/2
 * @version $$Id:$$
 */
@FeignClient(value = "compute-service",fallback = ComputeClientHystrix.class)
public interface ComputeClient {

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    Integer add (@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
