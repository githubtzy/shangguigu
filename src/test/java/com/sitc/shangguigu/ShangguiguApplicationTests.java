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
    public  void  addUser(){
      User user =new User();

      user.setAge(22);
      user.setName("乐观锁");
      user.setEmail("1063221895@qq.com");
      int insert = userMapping.insert(user);
        System.out.println("insert的结果是"+insert);

    }
    @Test
    public  void findAllS(){

        List<Student> students = studentmapping.selectList(null);
        System.out.println(students);


    }

    @Test
    public  void update(){

      User user = new User();
      user.setId(1288125359211937793L);
      user.setAge(120);
      int updateById = userMapping.updateById(user);

      //根据输出的结果
        System.out.println(updateById);


    }


    @Test
    public  void testOpticalLock(){

      //显示查询数据
        User user = userMapping.selectById(1288259390796828673L);

        user.setAge(200);

        int i = userMapping.updateById(user);
        System.out.println("i的值为："+i);



    }



}
