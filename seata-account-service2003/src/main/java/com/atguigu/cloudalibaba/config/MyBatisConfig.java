package com.atguigu.cloudalibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.atguigu.cloudalibaba.dao"})
public class MyBatisConfig {
}

