package com.ky.apps.service.controller;

import cn.hutool.core.lang.ObjectId;
import com.ky.apps.service.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import om.ky.apps.service.domain.CommonResult;
import om.ky.apps.service.domain.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author ky2009666
 * @Description 订单服务
 * @Date 2021/4/19
 **/
@RestController
@RequestMapping("order")
@Slf4j
public class OrderController {
    /**
     * 定义支付的服务.
     */
    @Resource
    private PaymentService paymentService;

    /**
     * 显示订单信息
     *
     * @return
     */
    @GetMapping("optById")
    @ResponseBody
    public CommonResult<Payment> optById(long id) {
        CommonResult<Payment> paymentCommonResult = paymentService.optById(id);
        return paymentCommonResult;
    }

}
