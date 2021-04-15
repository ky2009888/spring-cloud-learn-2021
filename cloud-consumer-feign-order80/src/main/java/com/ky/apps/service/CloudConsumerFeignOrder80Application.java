package com.ky.apps.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 使用Feign.
 *
 * @author Lenovo
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableFeignClients
public class CloudConsumerFeignOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignOrder80Application.class, args);
    }

}
