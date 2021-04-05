package com.ky.apps.service.controller;

import com.ky.apps.service.common.domain.CommonResult;
import com.ky.apps.service.domain.Payment;
import com.ky.apps.service.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author ky2009666
 * @Description 支付
 * @Date 2021/4/5
 **/
@RequestMapping("/pay")
@RestController
@Slf4j
public class PaymentController {
    /**
     * 定义支付相关的句柄.
     */
    @Resource
    private PaymentService paymentService;

    /**
     * 根据主键查询
     *
     * @param id 主键.
     * @return Payment。
     */
    @GetMapping("/byId")
    public CommonResult<Payment> optById(Long id) {
        return new CommonResult(200, "查询成功", paymentService.getById(id));
    }
}
