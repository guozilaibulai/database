package com.tsg.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tsg.entity.User;
import org.springframework.stereotype.Component;


/**
   * @auther: TanShuoGuo
   * @date: 2018/8/25/025 21:34
   * @Description: 用户的持久层
   */
@Component
public interface UserMapper  extends BaseMapper<User> {

}
