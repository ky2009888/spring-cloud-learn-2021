package com.ky.apps.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ky.apps.service.service.OrderInfoService;
import com.ky.apps.service.mapper.OrderInfoMapper;
import om.ky.apps.service.domain.OrderInfo;
import org.springframework.stereotype.Service;

/**
 * 订单接口实现类.
 *
 * @author Lenovo
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo>
        implements OrderInfoService {

}




