package com.sitc.shangguigu;

import com.sitc.shangguigu.entity.Student;
import com.sitc.shangguigu.entity.User;
import com.sitc.shangguigu.mapping.UserMapping;

import com.sitc.shangguigu.mapping.studentMapping;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ShangguiguApplicationTests {


    @Autowired
    private  UserMapping userMapping;


    @Autowired
    private studentMapping  studentmapping;


  @Test
     public  void  findAll(){
        List<User> users = userMapping.selectList(null);
        System.out.println("直接来输入查询到的结果1： "+users);


    }

    @Test
    public  void findAllS(){

        List<Student> students = studentmapping.selectList(null);
        System.out.println(students);


    }

    @Test
    public  void update(){

      User user = new User();
      user.setId(2L);
      user.setAge(120);
      int updateById = userMapping.updateById(user);

      //根据输出的结果
        System.out.println(updateById);


    }



}
