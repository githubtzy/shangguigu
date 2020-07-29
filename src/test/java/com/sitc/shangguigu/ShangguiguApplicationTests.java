package com.sitc.shangguigu;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
      user.setName("令狐冲");
      user.setEmail("1063221895@qq.com");
      int insert = userMapping.insert(user);
        System.out.println("insert的结果是"+insert);

    }
    @Test
    public  void findAllS(){

        List<User> students = userMapping.selectList(null);
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

    @Test
    public  void testPageSearch(){

      //这个可以在页面上添加一个按钮，然后调用这个方法，就是
        //页面下面的1页，2页

      //分页查询,注意引入的page是属于哪一个包
        Page<User> page = new Page<>(2,3);

        //分页查询到的数据都保存到page里面
        userMapping.selectPage(page,null);

        System.out.println("当前页信息："+page.getCurrent()); //
    }


    @Test
    public  void testLogicSqlDelete(){

        int delete = userMapping.deleteById(1288259390796828673L);
        System.out.println("删除的是："+delete);
    }


    //实现复杂查询
    @Test
    public  void testFuzasearch(){

      //创建queryWrapper对象，然后调用里面的方法
        QueryWrapper<User> wrapper = new QueryWrapper<>();


//调用对象的方法， 来进行查询方法的构建，
// 然后将该查询方法，放置到查询语句中，我们来进行设置
//ge 大于等于 gt大于  le大于等于  lt 大于
        wrapper.ge("age", 30);

        List<User> list = userMapping.selectList(wrapper);
    }

}
