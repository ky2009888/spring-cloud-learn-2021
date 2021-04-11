package com.ky.apps.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author ky2009666
 * @Description 配置restemplate
 * @Date 2021/4/11
 **/
@Configuration
public class RestTemlateConfigs {
    /**
     * 自动注入RestTemplate.
     *
     * @return RestTemplate.
     * @LoadBalanced
     * 需要添加这个注解，负责无法通过注册中心找到对应的服务器ID给客户端连接.
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplateZ() {
        return new RestTemplate();
    }
}
