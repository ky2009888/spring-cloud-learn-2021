package com.ky.apps.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lenovo
 */
@SpringBootApplication
@MapperScan("com.ky.apps.service.mapper")
public class CloudJasyptSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudJasyptSpringBootApplication.class, args);
    }
}
