package com.ky.apps.service.controller;

import com.ky.apps.service.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import om.ky.apps.service.domain.CommonResult;
import om.ky.apps.service.domain.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ky2009666
 * @description 支付
 * @date 2021/4/5
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
     * 获取服务器的端口号.
     */
    @Value("${server.port}")
    private String port;

    /**
     * 根据主键查询
     *
     * @param id 主键.
     * @return Payment。
     */
    @GetMapping("/byId")
    public CommonResult<Payment> optById(Long id) {
        log.info("打印相关支付日志:{},{}", id, port);
        return paymentService.getByIdV1(id);
    }

    /**
     * 根据主键查询
     *
     * @return Payment。
     */
    @PostMapping("/pay")
    public CommonResult<Boolean> pay(@RequestBody Payment payment) {
        log.info("支付接口调用的端口号:{}", port);
        return new CommonResult<>(200, "支付成功", paymentService.save(payment));
    }

}
