package com.zian.testresult;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@MapperScan("com.zian.testresult.mapper")
public class TestResultApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestResultApplication.class, args);
    }

}
