package com.tsg.config;

import java.lang.annotation.*;

/**
   * @auther: TanShuoGuo
   * @date: 2018/8/25/025 22:10
   * @Description: 作用于类、接口或者方法上
   */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {

    String name();
}