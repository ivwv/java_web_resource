package edu.neusoft.loginSpringMVC.controller;

import edu.neusoft.loginSpringMVC.model.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller("/login.action")
public class PersonAction extends AbstractController {
    @Autowired
    private PersonService service;

//    把jsp传递过来的参数：用户名和密码，调用service查询数据库，是否存在该用户
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String username=httpServletRequest.getParameter("username");
        String password=httpServletRequest.getParameter("password");
        boolean ret=service.login(username,password);
        ModelAndView modelAndView=new ModelAndView();
        if(ret){
            modelAndView.setViewName("success");
            modelAndView.addObject("username",username);
        }else{
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }
}
