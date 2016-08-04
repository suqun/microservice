/*
 * Copyright 2016 Wicresoft, Inc. All rights reserved.
 */
package com.ow.wises.web;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import com.netflix.loadbalancer.ZoneAwareLoadBalancer;
import com.ow.wises.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 消费COMPUTE-SERVICE的add服务
 * 通过RestTemplate来直接调用服务
 *
 * @author larry.quns
 *         Created on 16/8/1
 * @version $$Id:$$
 */
@RestController
public class ConsumerController {
//    @Autowired
//    RestTemplate template;

    @Autowired
    ComputeService computeService;

    @Autowired
    private SpringClientFactory clientFactory;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
//        return template.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }

    @RequestMapping("/")
    public String getServerList() throws Exception {
        ZoneAwareLoadBalancer<Server> lb = (ZoneAwareLoadBalancer<Server>) clientFactory.getLoadBalancer("compute-service");
        ServerList<Server> serverList = lb.getServerListImpl();

        StringBuffer buffer = new StringBuffer();
        List<Server> serverDetailList = serverList.getInitialListOfServers();
        if (!CollectionUtils.isEmpty(serverDetailList)) {
            for (Server s : serverDetailList) {
                buffer.append(s.getHost() + ":" + s.getPort());
            }
            return buffer.toString();
        } else {
            return "no service";
        }
    }
}
