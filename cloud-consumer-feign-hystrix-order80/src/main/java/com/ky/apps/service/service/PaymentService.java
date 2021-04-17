package com.ky.apps.service.service;

import om.ky.apps.service.domain.CommonResult;
import om.ky.apps.service.domain.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author ky2009666
 * @Description 使用openfeign来调用接口
 * @Date 2021/4/15
 **/
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT8001")
public interface PaymentService {
    /**
     * 根据主键查询
     *
     * @param id 主键.
     * @return Payment。
     * @RequestParam 这个注解是在传递参数的必备的否则，参数无法传递过去.
     * GetMapping("/pay/byId") 这个里面的路径要全
     */
    @GetMapping("/pay/byId")
    public CommonResult<Payment> optById(@RequestParam Long id);
}
