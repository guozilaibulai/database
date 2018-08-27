package com.tsg.controller;

import com.tsg.entity.User;
import com.tsg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
   * @auther: TanShuoGuo
   * @date: 2018/8/25/025 23:20
   * @Description: 数据源切换测试接口
   */
@RestController
@RequestMapping("/test")
public class DataSourceController {

    @Autowired
    private UserService userService;

    /**
       * @param:
       * @return:
       * @date: 2018/8/25/025 23:06
       * @auther: TanShuoGuo
       * @Description: 使用默认数据源
       */
    @GetMapping("/default")
    public User useDefaultDataSource(String id) {
        User  user = userService.selectById(id);
        return user;
    }
    /**
     * @param:
     * @return:
     * @date: 2018/8/25/025 23:06
     * @auther: TanShuoGuo
     * @Description: 使用ds1数据源
     */
    @GetMapping("/ds1")
    public List<User> useDS1DataSource() {
        List<User> list = userService.selectAllDs1();
        return list;
    }
    /**
     * @param:
     * @return:
     * @date: 2018/8/25/025 23:06
     * @auther: TanShuoGuo
     * @Description: 使用ds2数据源
     */
    @GetMapping("/ds2")
    public List<User> useDS2DataSource() {
        List<User> list = userService.selectAllDs2();
        return list;
    }
}
