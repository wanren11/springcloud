package com.chyong.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chyong
 * @create 2020-11-24 20:25
 */
@FeignClient(value="eureka-registry-producer")
public interface IConsumerFeign {

    @GetMapping("/fetchProducerInfo")
    String fetchContent();
}
