package com.baidu.controller;

import com.baidu.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by lenovo on 2018/1/16.
 */
@RestController //相当于requestmapping+responseBody
public class HelloSpringBoot {

    @RequestMapping("/hello")
    public String getHello(){
        return "Hello Spring BOOt World!";
    }
    @RequestMapping(value = "/getStudent" ,produces ="text/plain;charset=UTF-8") //乱码问题
    public Student getStudent(){
        Student s  = new Student();
        s.setId(1);
        s.setName("小明sssaaadsdfds");
        s.setCreatDate(new Date());
        return s;
    }
}
