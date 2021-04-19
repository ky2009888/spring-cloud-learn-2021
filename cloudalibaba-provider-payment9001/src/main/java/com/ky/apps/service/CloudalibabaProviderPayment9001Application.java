package com.ky.apps.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * nacos的服务启动类.
 *
 * @author Lenovo
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ky.apps.service.mapper")
public class CloudalibabaProviderPayment9001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9001Application.class, args);
    }

}
