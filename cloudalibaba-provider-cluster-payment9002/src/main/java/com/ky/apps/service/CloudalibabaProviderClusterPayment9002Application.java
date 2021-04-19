package com.ky.apps.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Lenovo
 */
@SpringBootApplication
@MapperScan("com.ky.apps.service.mapper")
@EnableDiscoveryClient
public class CloudalibabaProviderClusterPayment9002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderClusterPayment9002Application.class, args);
    }

}
