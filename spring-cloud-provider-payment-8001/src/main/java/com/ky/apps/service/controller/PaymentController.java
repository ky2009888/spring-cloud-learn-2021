package com.ky.apps.service.controller;

import com.ky.apps.service.service.PaymentService;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import om.ky.apps.service.domain.CommonResult;
import om.ky.apps.service.domain.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
     * 查看有多少服务.
     */
    @Resource
    private EurekaDiscoveryClient discoveryClient;
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
        return new CommonResult<>(200, "查询成功", paymentService.getById(id));
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

    /**
     * 查看服务相关的信息
     *
     * @return
     */
    @GetMapping(value = "/discovery")
    @ResponseBody
    public Object discovery() {
        List<ServiceInstance> payment8001 = discoveryClient.getInstances("payment8001");
        for (ServiceInstance instanceInfo : payment8001
        ) {
            log.info("{}", instanceInfo.toString());
        }
        return this.discoveryClient;
    }
}
