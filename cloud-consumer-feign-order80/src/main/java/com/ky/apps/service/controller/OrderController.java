package com.ky.apps.service.controller;

import com.ky.apps.service.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import om.ky.apps.service.domain.CommonResult;
import om.ky.apps.service.domain.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author ky2009666
 * @Description 订单服务
 * @Date 2021/4/15
 **/
@RestController
@RequestMapping("order")
@Slf4j
public class OrderController {
    /**
     * 自动注入RestTemplate.
     */
    @Resource
    private PaymentService paymentService;

    /**
     * 显示订单信息
     *
     * @return
     */
    @GetMapping("show")
    @ResponseBody
    public CommonResult<Payment> showOrder(long id) {
        return paymentService.optById(id);
    }

}
