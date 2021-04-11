package com.ky.apps.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ky.apps.service.mapper.PaymentMapper;
import com.ky.apps.service.service.PaymentService;
import om.ky.apps.service.domain.Payment;
import org.springframework.stereotype.Service;

/**
 * 支付接口实现类.
 * @author Lenovo
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
implements PaymentService{

}




