package com.chyong.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chyong
 * @date 2020-11-23 19:12
 */
@RestController
public class ConsumerRibbonController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 需要添加@LoadBalanced
     * 需要配置RestTemplate
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("fetch")
    public String fetchFromCenter() {
        System.out.println("日志：Ribbon");
        return restTemplate.getForObject("http://eureka-registry-producer/fetchProducerInfo", String.class);
    }
}
