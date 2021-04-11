package com.ky.apps.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Lenovo
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.ky.apps.service.mapper")
public class SpringCloudProviderPayment8002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderPayment8002Application.class, args);
    }

}
