package com.ky.apps.service.controller;

import cn.hutool.core.lang.ObjectId;
import lombok.extern.slf4j.Slf4j;
import om.ky.apps.service.domain.CommonResult;
import om.ky.apps.service.domain.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author ky2009666
 * @Description 订单服务
 * @Date 2021/4/6
 **/
@RestController
@RequestMapping("order")
@Slf4j
public class OrderController {
    /**
     * 自动注入RestTemplate.
     */
    @Resource
    private RestTemplate restTemplate;

    /**
     * 显示订单信息
     *
     * @return
     */
    @GetMapping("show")
    public String showOrder(long id) {
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity("http://127.0.0.1:8001/pay/byId?id={1}", CommonResult.class, id);
        CommonResult commonResult = forEntity.getBody();
        String resultStr = commonResult.getData().toString();
        log.info("{}",resultStr);
        return resultStr;
    }
    /**
     * 支付订单.
     *
     * @return resultStr。
     */
    @GetMapping("pay")
    public CommonResult payOrder() {
        Payment payment = new Payment(ObjectId.next());
        CommonResult commonResult = restTemplate.postForObject("http://127.0.0.1:8001/pay/pay",payment,CommonResult.class);
        String resultStr = commonResult.getData().toString();
        log.info("{}",resultStr);
        return commonResult;
    }
}
