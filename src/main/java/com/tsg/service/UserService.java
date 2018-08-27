package com.tsg.service;


import com.baomidou.mybatisplus.service.IService;
import com.tsg.entity.User;

import java.util.List;
/**
   * @auther: TanShuoGuo
   * @date: 2018/8/25/025 23:14
   * @Description: User 相关的业务接口
 * fsdf
   */
public interface UserService  extends IService<User> {

    List<User> selectAllDs1();

    List<User> selectAllDs2();
}
