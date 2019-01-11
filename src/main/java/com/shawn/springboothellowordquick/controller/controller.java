package com.shawn.springboothellowordquick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody 注解写在类前面，意思为 这个类中所有方法的返回的数据可以直接写给浏览器
//如果是对象可以转为json数据

/*@ResponseBody
@Controller*/
//RestController 是上面两个注解的合体，有两个所有的功能
@RestController
public class controller {


    @RequestMapping("/hello")
    public String hello(){

        return "helloword";
    }



}
