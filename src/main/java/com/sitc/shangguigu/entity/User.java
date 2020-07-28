package com.sitc.shangguigu.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

/**
 * @author 熟尔
 * @createdate 2020/7/26 0026-21:14
 *
 * 实体类主要是用来跟数据库中表的结构相关联
 */

@Data
public class User {

    @TableId(type = IdType.ID_WORKER)
    private Long id; // 设置id主键策略， 随机生成19位随机数

    private String name;
    private Integer age;
    private String email;


    @Version
    @TableField(fill = FieldFill.INSERT)
    // 每一次插入更新的时候就自动的更新值
    private Integer version; // 乐观锁的版本号


    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private  Date updateTime;


}
