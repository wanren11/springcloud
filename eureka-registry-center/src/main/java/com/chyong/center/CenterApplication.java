package com.chyong.center;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chyong
 * @date 2020-11-23 13:13
 */
@SpringBootApplication
@EnableEurekaServer
public class CenterApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CenterApplication.class).run(args);
    }
}
