package com.chyong.original;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chyong
 * @date 2020-11-23 13:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOriginalApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerOriginalApplication.class).run(args);
    }
}
