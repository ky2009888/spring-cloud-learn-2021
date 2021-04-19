package com.ky.apps.service.controller;

import com.alibaba.fastjson.JSON;
import com.ky.apps.service.service.OrderInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author ky2009666
 * @Description 订单服务模拟
 * @Date 2021/4/5
 **/
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    /**
     * 定义句柄.
     */
    @Resource
    private OrderInfoService orderInfoService;

    @GetMapping("/show")
    @ResponseBody
    public Object showInfo() {
        return JSON.toJSON(orderInfoService.getById(1));
    }
}
