package edu.neusoft.springMVCRegisterDemo.controller;

import edu.neusoft.springMVCRegisterDemo.model.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PersonAction {
    @Autowired
    private PersonService service;
//    使用@RequestMapping进行uri匹配，
//    方法是用户自定义的，参合和返回值也是自定义
//    参数的数据类型可以是HttpServletRequest/HttpServletResponse、String/Integer等、用户自定义类、Model/Map/ModelMap等
//    返回值数据类型是ModelAndView或者String，事实上，即便写成String，也相当于ModelAndView(String)
    @RequestMapping(value = "/login.action")
    public String login(){
        return "login";
    }

//    方法功能：从前台jsp传递过来参数pname/pwd，调用service进行业务处理，查询数据库是否有该用户，如果有跳转到成功界面，否则返回到login界面
    @RequestMapping("loginSuccess.action")
    public String loginSuccess(HttpServletRequest request){
        String pname=request.getParameter("pname");
        String pwd=request.getParameter("pwd");
        boolean ret=service.login(pname,pwd);
        if(ret){
            return "success";
        }
        return "login";
    }

    @RequestMapping("register.action")
    public String register(){
        return "register";
    }

    @RequestMapping("registerSuccess.action")
    public String registerSuccess(HttpServletRequest request){
        String pname=request.getParameter("pname");
        String pwd=request.getParameter("pwd");
        service.regist(pname,pwd);
        return "login";
    }
}
