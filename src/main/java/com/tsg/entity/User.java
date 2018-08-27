package com.tsg.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
   * @auther: TanShuoGuo
   * @date: 2018/8/25/025 21:32
   * @Description: 用户表
   */
@TableName(value = "t_user")
public class User implements Serializable{
    private static final long serialVersionUID = 5363408429449381072L;
    @TableId(type = IdType.UUID)
    private String id;    //id

    private String name;    //用户名

    private String pwd;     //密码

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
