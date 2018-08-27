package com.tsg.config;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
   * @auther: TanShuoGuo
   * @date: 2018/8/25/025 22:02
   * @Description: 动态数据源通知
   */
@Aspect
@Order(-1)//保证在@Transactional之前执行
@Component
public class DynamicDattaSourceAspect {

    private Logger logger = Logger.getLogger(DynamicDattaSourceAspect.class);

    /**
       * @param:
       * @return:
       * @date: 2018/8/25/025 22:05
       * @auther: TanShuoGuo
       * @Description: 改变数据源
       */
    @Before("@annotation(targetDataSource)")
    public void changeDataSource(JoinPoint joinPoint, TargetDataSource targetDataSource) {
        String dbid = targetDataSource.name();

        if (!DynamicDataSourceContextHolder.isContainsDataSource(dbid)) {
            logger.error("数据源 " + dbid + " 不存在使用默认的数据源 -> " + joinPoint.getSignature());
        } else {
            logger.debug("使用数据源：" + dbid);
            DynamicDataSourceContextHolder.setDataSourceType(dbid);
        }
    }

    /**
       * @param:
       * @return:
       * @date: 2018/8/25/025 22:10
       * @auther: TanShuoGuo
       * @Description: 清除数据源
       */
    @After("@annotation(targetDataSource)")
    public void clearDataSource(JoinPoint joinPoint, TargetDataSource targetDataSource) {
        logger.debug("清除数据源 " + targetDataSource.name() + " !");
        DynamicDataSourceContextHolder.clearDataSourceType();
    }
}