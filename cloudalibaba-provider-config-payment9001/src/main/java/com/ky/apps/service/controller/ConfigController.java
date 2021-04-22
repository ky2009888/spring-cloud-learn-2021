package com.ky.apps.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author ky2009666
 * @Description 演示配置文件自动加载
 * @RefreshScope 负责配置文件的自动刷新.
 * @Date 2021/4/22
 **/
@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigController {
    @Value("${config.info}")
    private String info;

    /**
     * 显示配置文件内容.
     *
     * @return info 要显示的撇脂文件内容.
     */
    @GetMapping("show")
    public String info() {
        return info;
    }
}
