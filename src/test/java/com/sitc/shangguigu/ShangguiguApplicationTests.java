package com.sitc.shangguigu;

import com.sitc.shangguigu.entity.User;
import com.sitc.shangguigu.mapping.UserMapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ShangguiguApplicationTests {


    @Autowired
    private  UserMapping userMapping;


  @Test
     public  void  findAll(){
        List<User> users = userMapping.selectList(null);
        System.out.println("直接来输入查询到的结果1： "+users);


    }



}
