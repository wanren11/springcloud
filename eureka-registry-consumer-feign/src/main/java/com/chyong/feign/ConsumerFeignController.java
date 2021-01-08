package com.chyong.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chyong
 * @date 2020-11-24 20:24
 */
@RestController
public class ConsumerFeignController {

    @Autowired
    private IConsumerFeign consumerFeign;

    @GetMapping("/fetch")
    public String fetch() {
        String content = consumerFeign.fetchContent();
        System.out.println("日志：" + content);
        return content;
    }
}
