package com.ky.apps.service.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka server 的启动类.
 *
 * @author Lenovo
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7001Application {
    /**
     * 命令行入口方法.
     *
     * @param args 命令行参数.
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001Application.class, args);
    }

}
