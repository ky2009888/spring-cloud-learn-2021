package com.ky.apps.service.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Lenovo
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7003Application.class, args);
    }

}
