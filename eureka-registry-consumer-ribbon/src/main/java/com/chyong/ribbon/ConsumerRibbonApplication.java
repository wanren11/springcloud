package com.chyong.ribbon;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chyong
 * @date 2020-11-23 13:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerRibbonApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerRibbonApplication.class).run(args);
    }
}
