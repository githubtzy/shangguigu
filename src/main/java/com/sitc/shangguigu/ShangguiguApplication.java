package com.sitc.shangguigu;

import com.sitc.shangguigu.mapping.UserMapping;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ShangguiguApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShangguiguApplication.class, args);
    }

}
