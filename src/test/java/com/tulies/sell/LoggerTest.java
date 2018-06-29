package com.tulies.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 王嘉炀
 * @date 2018/6/30 上午12:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    // 使用lombok的@Slf4j注解可以不用写这个
//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        log.debug("debug...");
        log.info("info...");
        log.error("error...");

        String name = "tulies";
        String password = "110110";
        log.info("name：{},password：{}",name,password);



    }
}
