package edu.neusoft.springMVCRegisterDemo.controller;

import edu.neusoft.springMVCRegisterDemo.model.service.PersonService;
import edu.neusoft.springMVCRegisterDemo.model.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PersonShowAction {
    @Autowired
    private PersonService service;
    @RequestMapping("person.action")
    public String person(Model model){
        List<Person> list=service.showAll();
        model.addAttribute("list",list);
        return "person";
    }


}
