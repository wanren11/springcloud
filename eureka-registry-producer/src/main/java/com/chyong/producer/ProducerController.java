package com.chyong.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chyong
 * @date 2020-11-23 18:20
 */
@RestController
public class ProducerController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String port;

    @GetMapping("/fetchProducerInfo")
    public String fetchInfo() {
        String content = "从ProducerController上获取信息";
        String consumerInstances = "Available instances: " + discoveryClient.getServices();
        System.out.println(consumerInstances + "; port: " + port);
        return content + consumerInstances;
    }
}
