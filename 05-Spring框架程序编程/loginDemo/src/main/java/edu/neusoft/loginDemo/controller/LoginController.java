package edu.neusoft.loginDemo.controller;

import edu.neusoft.loginDemo.model.service.LoginService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginController {
//    真实项目中，是把service定义成controller的属性
//    此时，因为controller层是入口，模拟jsp调用，在项目开始处是@Test，没有做当前类的初始化LoginController controller=new LoginController(),该类的属性不能被识别
//    @Autowired
//    private LoginService service;
    @Test
    public void login(){
//        登录，是从jsp页面跳转到controller，传递过来参数用户名和密码
//        调用service，查询用户名和密码是否存在与数据库，如果存在，在返回true，否则返回false
        String pname="xl";
        String pwd="123";
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginService service= (LoginService) context.getBean("loginService");
        boolean ret=service.login(pname,pwd);
        if (ret){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

    }
}
