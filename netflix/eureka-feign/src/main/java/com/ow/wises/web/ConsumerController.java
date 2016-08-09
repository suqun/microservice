/*
 * Copyright 2016 Wicresoft, Inc. All rights reserved.
 */
package com.ow.wises.web;

import com.ow.wises.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * web层中调用接口ComputeClient
 *
 * @author larry.quns
 *         Created on 16/8/2
 * @version $$Id:$$
 */
@RestController
public class ConsumerController {
    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(){
        return computeClient.add(10,20);
    }
}
