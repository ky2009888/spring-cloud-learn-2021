package com.ky.apps.service.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ky2009666
 * @description 通用结果封装处理.
 * @date 2021/4/5
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> implements Serializable {
    /**
     * 定义处理结果的状态码.
     */
    private Integer code;
    /**
     * 定义处理的消息.
     */
    private String message;
    /**
     * 定义结果数据.
     */
    private T data;

    /**
     * 定义两个参数构造方法.
     *
     * @param code    编码.
     * @param message 消息.
     */
    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
