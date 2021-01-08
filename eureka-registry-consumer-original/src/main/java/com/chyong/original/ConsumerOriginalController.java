package com.chyong.original;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chyong
 * @date 2020-11-23 18:29
 */
@RestController
public class ConsumerOriginalController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/fetch")
    public String fetchContent() {
        ServiceInstance instance = loadBalancerClient.choose("eureka-registry-producer");
        String instanceHttpAddr = "http://" + instance.getHost() + ":" + instance.getPort();
        String requestUrl = instanceHttpAddr + "/fetchProducerInfo";
        System.out.println("日志：" + requestUrl);
        String fetchContent = restTemplate.getForObject(requestUrl, String.class);
        return fetchContent;
    }
}
