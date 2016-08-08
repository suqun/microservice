/*
 * Copyright 2016 Wicresoft, Inc. All rights reserved.
 */
package com.ow.wises.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description of TestController
 *
 * @author larry.quns
 *         Created on 16/8/8
 * @version $$Id:$$
 */
@RefreshScope
@RestController
class TestController {

    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {

        return this.from;
    }

}
