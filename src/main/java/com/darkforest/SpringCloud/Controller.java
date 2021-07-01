package com.darkforest.SpringCloud;/*
 * 一些声明信息
 * created by  畅通
 * Description:com.darkforest.SpringCloud  <br/>
 * date: 2021/6/29 上午11:24<br/>
 * @author darkforest<br/>
 * @version
 * @since JDK 1.8
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RefreshScope
@RestController
public class Controller {

    @Value("${user.name}")
    private String userName;

    @Value("${user.age}")
    private int age;
    @GetMapping("/person")
    public User getPerson(){
       User user = new User();
       user.setUserName(userName);
       user.setAge(age);
       return user;
    }
}
