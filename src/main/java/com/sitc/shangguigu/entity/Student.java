package com.sitc.shangguigu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author 熟尔
 * @createdate 2020/7/27 0027-21:17
 */

@Data
public class Student {

    @TableId(type = IdType.ID_WORKER)
    private  long id;
    private  String name;
    private  String position;


}
