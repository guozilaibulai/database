package com.tsg.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tsg.config.TargetDataSource;
import com.tsg.entity.User;
import com.tsg.mapper.UserMapper;
import com.tsg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
   * @auther: TanShuoGuo
   * @date: 2018/8/25/025 23:15
   * @Description: User相关的业务实现类
   */
@Service
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserService {

    /**
       * @param:
       * @return:
       * @date: 2018/8/26/026 0:45
       * @auther: TanShuoGuo
       * @Description: 通过 默认数据库 查找所有用户
       */
    @Autowired
    private UserMapper userMapper;

    /**
       * @param:
       * @return:
       * @date: 2018/8/25/025 23:18
       * @auther: TanShuoGuo
       * @Description: 通过数据库 ds1 查找所有用户
       */
    @Override
    @TargetDataSource(name = "ds1")
    public List<User> selectAllDs1() {
        List<User> list = userMapper.selectList(new EntityWrapper<>());
        return list;
    }

    /**
       * @param:
       * @return:
       * @date: 2018/8/25/025 23:18
       * @auther: TanShuoGuo
       * @Description: 通过数据库 ds2 查找所有用户
       */
    @Override
    @TargetDataSource(name = "ds2")
    public List<User> selectAllDs2() {
        List<User> list = userMapper.selectList(new EntityWrapper<>());
        return list;
    }
}
