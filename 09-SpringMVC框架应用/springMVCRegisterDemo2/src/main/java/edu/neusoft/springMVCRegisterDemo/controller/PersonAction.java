package edu.neusoft.springMVCRegisterDemo.controller;

import edu.neusoft.springMVCRegisterDemo.model.service.PersonService;
import edu.neusoft.springMVCRegisterDemo.model.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/person/")
public class PersonAction {
    @Autowired
    private PersonService service;
//    使用@RequestMapping进行uri匹配，
//    方法是用户自定义的，参合和返回值也是自定义
//    参数的数据类型可以是HttpServletRequest/HttpServletResponse、String/Integer等、用户自定义类、Model/Map/ModelMap等
//    返回值数据类型是ModelAndView或者String，事实上，即便写成String，也相当于ModelAndView(String)
    @RequestMapping(value = "login.action")
    public String login(){
        return "login";
    }

//    方法功能：从前台jsp传递过来参数pname/pwd，调用service进行业务处理，查询数据库是否有该用户，如果有跳转到成功界面，否则返回到login界面
    @RequestMapping("loginSuccess.action")
//    public String loginSuccess(HttpServletRequest request){
//        System.out.println("---------loginSuccess.action");
//        String pname=request.getParameter("pname");
//        String pwd=request.getParameter("pwd");
//        boolean ret=service.login(pname,pwd);
//        if(ret){
//            return "success";
//        }
//        return "login";
//    }
//    public String loginSuccess(@RequestParam("pname") String username, String pwd){
//        System.out.println("---------loginSuccess.action, "+username+"--"+pwd);
//        boolean ret=service.login(username,pwd);
//        if(ret){
//            return "success";
//        }
//        return "login";
//    }
//    public String loginSuccess(Person person){
//        System.out.println("loginSucces----"+person);
//        boolean ret=service.login(person.getPname(),person.getPwd());
//        if(ret){
//            return "success";
//        }
//        return "login";
//    }
//    从后台到前台传递参数，两种方法：返回值使用ModelAndView，使用参数Model/Map/ModelMap
//    public ModelAndView loginSuccess(Person person){
//        System.out.println("loginSucces----"+person);
//        boolean ret=service.login(person.getPname(),person.getPwd());
//        ModelAndView modelAndView=new ModelAndView();
//        if(ret){
//            modelAndView.setViewName("success");
//            modelAndView.addObject("pname",person.getPname());
//        }else {
//            modelAndView.setViewName("login");
//        }
//        return modelAndView;
//    }
//    public String loginSuccess(Person person, Model model){
//        System.out.println("loginSucces----"+person);
//        boolean ret=service.login(person.getPname(),person.getPwd());
//        if(ret){
//            model.addAttribute("pname",person.getPname());
//            return "success";
//        }
//        return "login";
//    }
//    public String loginSuccess(Person person, Map model){
//        System.out.println("loginSucces----"+person);
//        boolean ret=service.login(person.getPname(),person.getPwd());
//        if(ret){
//            model.put("pname",person.getPname());
//            return "success";
//        }
//        return "login";
//    }
//    public String loginSuccess(Person person, ModelMap model){
//        System.out.println("loginSucces----"+person);
//        boolean ret=service.login(person.getPname(),person.getPwd());
//        if(ret){
//            model.put("pname",person.getPname());
//            return "success";
//        }
//        return "login";
//    }
    public String loginSuccess(String pname, String pwd){
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
