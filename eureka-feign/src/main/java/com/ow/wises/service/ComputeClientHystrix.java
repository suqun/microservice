/*
 * Copyright 2016 Wicresoft, Inc. All rights reserved.
 */
package com.ow.wises.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 实现@FeignClient的接口，此时实现的方法就是对应@FeignClient接口中映射的fallback函数
 *
 * @author larry.quns
 *         Created on 16/8/4
 * @version $$Id:$$
 */
@Component
public class ComputeClientHystrix implements ComputeClient{
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
