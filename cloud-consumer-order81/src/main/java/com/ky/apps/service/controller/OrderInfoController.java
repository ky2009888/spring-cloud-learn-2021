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
@RequestMapping("orderInfo")
@Slf4j
public class OrderInfoController {
    /**
     * 备注:SPRING-CLOUD-PROVIDER-PAYMENT-8001这个是EUREKA注册中心的地址，
     * 通过eureka的注册服务页面http://localhost:7001/可以看到
     */
    public static final String HTTP_PAYMENT_URL_SERVICE = "http://SPRING-CLOUD-PROVIDER-PAYMENT";
    /**
     * 自动注入RestTemplate.
     */
    @Resource
    private RestTemplate restTemplateV;

    /**
     * 显示订单信息
     *
     * @return
     */
    @GetMapping("show")
    @ResponseBody
    public String showOrder(long id) {
        String queryPaymentByIdUrl = HTTP_PAYMENT_URL_SERVICE + "/pay/byId?id={1}";
        log.info("{}", queryPaymentByIdUrl);
        CommonResult commonResult = restTemplateV.getForEntity(queryPaymentByIdUrl, CommonResult.class, id).getBody();
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
        String queryPaymentCreateUrl = HTTP_PAYMENT_URL_SERVICE + "/pay/pay";
        log.info("{}", queryPaymentCreateUrl);
        Payment payment = new Payment(ObjectId.next());
        CommonResult<Payment> commonResult = restTemplateV.postForObject(queryPaymentCreateUrl, payment, CommonResult.class);
        String resultStr = "";
        if (commonResult != null && commonResult.getData() != null) {
            resultStr = commonResult.getData().toString();
            log.info("{}", resultStr);
        }
        return commonResult;
    }
}
