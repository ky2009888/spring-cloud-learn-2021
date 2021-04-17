package com.ky.apps.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ky.apps.service.mapper.PaymentMapper;
import com.ky.apps.service.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import om.ky.apps.service.domain.CommonResult;
import om.ky.apps.service.domain.Payment;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * 支付接口实现类.
 *
 * @author Lenovo
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
        implements PaymentService {

    /**
     * 根据ID查询.
     *
     * @param id 主键.
     * @return CommonResult<Payment>。
     */
    @Override
    @HystrixCommand(
            fallbackMethod = "getByIdFallbackMethod",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")}
    )
    public CommonResult<Payment> getByIdV1(Serializable id) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new CommonResult<>(200, "查询成功", this.getById(id));
    }

    /**
     * 根据ID查询的超时返回的方法.
     *
     * @param id 主键.
     * @return CommonResult<Payment>。
     */
    @Override
    public CommonResult<Payment> getByIdFallbackMethod(Serializable id) {
        return new CommonResult<>(404, "查询超时", null);
    }
}




