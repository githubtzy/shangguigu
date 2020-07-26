package com.sitc.shangguigu.entity;

import lombok.Data;

/**
 * @author 熟尔
 * @createdate 2020/7/26 0026-21:14
 *
 * 实体类主要是用来跟数据库中表的结构相关联
 */

@Data
public class User {

    private Long id;

    private String name;
    private Integer age;
    private String email;

}
