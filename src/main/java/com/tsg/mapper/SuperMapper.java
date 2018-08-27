package com.tsg.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
   * @auther: TanShuoGuo
   * @date: 2018/8/25/025 21:30
   * @Description: 这里可以放一些公共的方法
   */
@Component
public interface SuperMapper<T> extends BaseMapper<T> {
}
