package com.ky.apps.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 默认启动类
 *
 * @author Lenovo
 */
@SpringBootApplication
@MapperScan("com.ky.apps.service.mapper")
@EnableEurekaClient
public class SpringCloudProviderPayment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderPayment8001Application.class, args);
    }

}
