package com.ky.apps.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 订单服务的启动类.
 * @author Lenovo
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class CloudConsumerOrder82Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder82Application.class, args);
    }

}
