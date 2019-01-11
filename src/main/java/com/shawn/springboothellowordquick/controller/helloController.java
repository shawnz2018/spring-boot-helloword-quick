package com.shawn.springboothellowordquick.controller;


import com.shawn.springboothellowordquick.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    //下面的value注解表名value注解适合 部分业务逻辑需要某个值 时的取值
    @Value("${person.name}")
    private String name;


    @RequestMapping("/sayHello")
    public String Hello(){
           return "Hello "+name;
    }
}
