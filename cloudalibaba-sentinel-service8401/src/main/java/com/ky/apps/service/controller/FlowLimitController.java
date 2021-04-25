package com.ky.apps.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ky2009666
 * @Description 流量控制的测试类
 * @Date 2021/4/25
 **/
@RestController
@Slf4j
public class FlowLimitController {
    /**
     * 访问A链接.
     *
     * @return
     */
    @GetMapping("/testA")
    public String testA() {
        String name = "hello world";
        if (name.length() > 5) {
            name = name.substring(0, 5);
            log.info("name:{}", name);
        }
        return "------testA";
    }

    /**
     * 访问B链接.
     *
     * @return
     */
    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }

}
