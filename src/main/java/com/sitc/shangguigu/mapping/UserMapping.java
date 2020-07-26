package com.sitc.shangguigu.mapping;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sitc.shangguigu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * @author 熟尔
 * @createdate 2020/7/26 0026-21:32
 *
 * 这就是相当于dao层， 就是我们队数据库进行操作的层，
 * 这里注意需要给接口定义说明手动加上，接口扫描的路径，
 * 所有的这些都需要加上
 */
@Repository
public interface UserMapping extends BaseMapper<User> {
}
