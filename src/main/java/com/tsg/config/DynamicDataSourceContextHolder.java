package com.tsg.config;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
   * @auther: TanShuoGuo
   * @date: 2018/8/25/025 21:43
   * @Description: 动态数据源上下文管理
   */
public class DynamicDataSourceContextHolder {

    private Logger logger = Logger.getLogger(DynamicDataSourceContextHolder.class);
    //存放当前线程使用的数据源类型信息
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    //存放数据源id
    public static List<String> dataSourceIds = new ArrayList<String>();
    /**
       * @param:
       * @return:
       * @date: 2018/8/25/025 21:43
       * @auther: TanShuoGuo
       * @Description: 设置数据源
       */
    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }
    /**
       * @param:
       * @return:
       * @date: 2018/8/25/025 21:43
       * @auther: TanShuoGuo
       * @Description: 获取数据源
       */
    public static String getDataSourceType() {
        return contextHolder.get();
    }
    /**
       * @param:
       * @return:
       * @date: 2018/8/25/025 21:43
       * @auther: TanShuoGuo
       * @Description: 清除数据源
       */
    public static void clearDataSourceType() {
        contextHolder.remove();
    }

    /**
       * @param:
       * @return:
       * @date: 2018/8/25/025 21:44
       * @auther: TanShuoGuo
       * @Description: 判断当前数据源是否存在
       */
    public static boolean isContainsDataSource(String dataSourceId) {
        return dataSourceIds.contains(dataSourceId);
    }
}