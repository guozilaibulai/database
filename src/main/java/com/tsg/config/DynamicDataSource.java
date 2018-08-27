package com.tsg.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
   * @auther: TanShuoGuo
   * @date: 2018/8/25/025 21:40
   * @Description: 动态数据源
   */
public class DynamicDataSource extends AbstractRoutingDataSource {
    /**
       * @param:
       * @return:
       * @date: 2018/8/25/025 21:41
       * @auther: TanShuoGuo
       * @Description: 每执行一次数据库，动态获取DataSource
       */
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}