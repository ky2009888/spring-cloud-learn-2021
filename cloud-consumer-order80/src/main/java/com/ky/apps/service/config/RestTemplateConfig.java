package com.ky.apps.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author ky2009666
 * @Description RestTemplate的配置类
 * @Date 2021/4/8
 **/
@Configuration
public class RestTemplateConfig {
    /**
     * 将restTemplate句柄注入.
     *
     * @return restTemplate.
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
