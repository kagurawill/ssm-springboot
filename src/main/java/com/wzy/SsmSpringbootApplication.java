package com.wzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//默认扫描这个类下的所有包，@ComponetScan一般是需要制定默认扫描不到的，例如引入的其他项目
//配置mapper接口的位置
@MapperScan("com.wzy.dao")
public class SsmSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmSpringbootApplication.class, args);
    }

}
