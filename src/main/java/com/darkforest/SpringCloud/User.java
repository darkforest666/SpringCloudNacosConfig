package com.darkforest.SpringCloud;/*
 * 一些声明信息
 * created by  畅通
 * Description:com.darkforest.SpringCloud  <br/>
 * date: 2021/6/30 上午9:54<br/>
 * @author darkforest<br/>
 * @version
 * @since JDK 1.8
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "user")

public class User {
    private String userName;
    private int age ;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
