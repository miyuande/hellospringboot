package com.baidu.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by lenovo on 2018/1/16.
 */
public class Student {
    private int id;
    //@JSONField(serialize = false)//不实现序列化,既不返回该字段.
    private String name;
    private Date creatDate;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
