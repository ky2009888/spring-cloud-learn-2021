package com.ky.apps.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCloudProviderOrder81ApplicationTests {
    @Test
    void testStr(){
        String name = "name";
        Assert.assertEquals("name",name);
    }
}
