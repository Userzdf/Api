package com.ywj.api;

import com.ywj.api.controller.TestController;
import com.ywj.api.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class AppApplicationTests {
    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    TestController controller;
    @Test
    void contextLoads() {
         log.info("token info:{}",jwtUtils.jwt());
         jwtUtils.parse();
    }

    @Test
    void test(){
        controller.type();
    }
}
