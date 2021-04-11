package com.ky.apps.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author ky2009666
 * @Description RestTemplate的配置类
 * @Date 2021/4/8
 **/
@Configuration
public class RestTemplateConfigV {
    /**
     * 将restTemplate句柄注入.
     * 通过@LoadBalanced开启负载均衡功能
     *
     * @return restTemplate.
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplateV() {
        return new RestTemplate();
    }
}
