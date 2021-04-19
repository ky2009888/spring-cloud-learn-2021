package com.ky.apps.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

@SpringBootTest
@Slf4j
class CloudGatewayGateway9527ApplicationTests {

    @Test
    void contextLoads() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        log.info("{}",zonedDateTime);
    }

}
