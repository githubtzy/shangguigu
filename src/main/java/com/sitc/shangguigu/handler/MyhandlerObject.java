package com.sitc.shangguigu.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @author 熟尔
 * @createdate 2020/7/28 0028-7:34
 */

//@Component 该注解的作用，就是把该类注册到bean里面，然后以备调用
@Component
public class MyhandlerObject implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {

    }



    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
