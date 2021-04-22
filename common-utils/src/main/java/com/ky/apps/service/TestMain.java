package com.ky.apps.service;

import cn.hutool.core.date.DateUtil;

import java.util.concurrent.TimeUnit;

/**
 * @Author ky2009666
 * @Description test
 * @Date 2021/4/19
 **/
public class TestMain {
    /**
     *
     */
    public static final String dateStr = DateUtil.now();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            TestMain main = new TestMain();
            System.out.println(main.optDate());
            TimeUnit.SECONDS.sleep(1);
        }
    }


    private String optDate() {
        return DateUtil.now();
    }
}
