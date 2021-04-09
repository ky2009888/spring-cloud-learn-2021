package com.ky.apps.service.controller;

import cn.hutool.core.lang.ObjectId;
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
    @ResponseBody
    public String showOrder(long id) {
        CommonResult<Payment> commonResult = restTemplate.getForEntity("http://127.0.0.1:8001/pay/byId?id={1}", CommonResult.class, id).getBody();
        String resultStr = "";
        if (commonResult != null && commonResult.getData() != null) {
            resultStr = commonResult.getData().toString();
            log.info("{}", resultStr);
        }
        return resultStr;
    }

    /**
     * 支付订单.
     *
     * @return resultStr。
     */
    @GetMapping("pay")
    @ResponseBody
    public CommonResult<Payment> payOrder() {
        Payment payment = new Payment(ObjectId.next());
        CommonResult<Payment> commonResult = restTemplate.postForObject("http://127.0.0.1:8001/pay/pay", payment, CommonResult.class);
        String resultStr = "";
        if (commonResult != null && commonResult.getData() != null) {
            resultStr = commonResult.getData().toString();
            log.info("{}", resultStr);
        }
        return commonResult;
    }
}
