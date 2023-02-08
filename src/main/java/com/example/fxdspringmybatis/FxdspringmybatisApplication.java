package com.example.fxdspringmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan("com.example.fxdspringmybatis.mapper")
public class FxdspringmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(FxdspringmybatisApplication.class, args);
    }

}
