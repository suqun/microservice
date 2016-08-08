package com.ow.wises;/*
 * Copyright 2016 Wicresoft, Inc. All rights reserved.
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Description of com.ow.wises.ServerApplication
 *
 * @author larry.quns
 *         Created on 16/8/8
 * @version $$Id:$$
 */
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }
}
