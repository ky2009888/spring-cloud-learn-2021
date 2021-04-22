package com.ky.apps.service;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class CloudJasyptSpringBootApplicationTests {
    /**
     * 定义加密的内容.
     */
    @Resource
    private StringEncryptor stringEncryptor;

    @Test
    void contextLoads() {
        log.info("---------------------------------------------------------");
        log.info("{}",stringEncryptor.encrypt("123456"));
        log.info("---------------------------------------------------------");
    }

}
