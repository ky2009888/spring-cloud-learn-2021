package com.ky.apps.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类
 *
 * @author Lenovo
 */
@SpringBootApplication
@MapperScan("com.ky.apps.service.mapper")
@EnableDiscoveryClient
public class SpringCloudProviderPayment8004Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderPayment8004Application.class, args);
    }

}
