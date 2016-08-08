/*
 * Copyright 2016 Wicresoft, Inc. All rights reserved.
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Description of ServerApplication
 *
 * @author larry.quns
 *         Created on 16/8/8
 * @version $$Id:$$
 */
@EnableConfigServer
@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerApplication.class).web(true).run(args);
    }
}
