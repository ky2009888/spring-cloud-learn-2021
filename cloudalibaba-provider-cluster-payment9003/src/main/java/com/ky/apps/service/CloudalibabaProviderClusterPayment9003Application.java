package com.ky.apps.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Lenovo
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ky.apps.service.mapper")
public class CloudalibabaProviderClusterPayment9003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderClusterPayment9003Application.class, args);
    }

}
