package com.ky.apps.service.service;


import com.baomidou.mybatisplus.extension.service.IService;
import om.ky.apps.service.domain.CommonResult;
import om.ky.apps.service.domain.Payment;

import java.io.Serializable;

/**
 * 支付实现类.
 *
 * @author Lenovo
 */
public interface PaymentService extends IService<Payment> {
    /**
     * 根据ID查询.
     *
     * @param id 主键.
     * @return CommonResult<Payment>。
     */
    CommonResult<Payment> getByIdV1(Serializable id);

    /**
     * 根据ID查询的超时返回的方法.
     *
     * @param id 主键.
     * @return CommonResult<Payment>。
     */
    CommonResult<Payment> getByIdFallbackMethod(Serializable id);
}
