package com.sitc.shangguigu.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 熟尔
 * @createdate 2020/7/28 0028-7:34
 */

//@Component 该注解的作用，就是把该类注册到bean里面，然后以备调用
@Component
public class MyhandlerObject implements MetaObjectHandler {
//自动注入加载, version，createTime，updateTime的值都是自动的更新的

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);
        this.setFieldValByName("version",1,metaObject);
    }



    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}
