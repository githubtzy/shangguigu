package com.sitc.shangguigu.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 熟尔
 * @createdate 2020/7/29 0029-7:30
 */
@Configuration
@MapperScan("com.sitc.shangguigu.mapping")
public class MpConfig {

    //需要一个 乐观锁的插件，来支持乐观锁
    //乐观锁插件，这个不用记忆，我们知道用就行
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

}
