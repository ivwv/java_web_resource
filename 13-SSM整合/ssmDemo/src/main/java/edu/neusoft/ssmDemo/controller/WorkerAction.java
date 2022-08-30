package edu.neusoft.ssmDemo.controller;

import edu.neusoft.ssmDemo.model.service.WorkerService;
import edu.neusoft.ssmDemo.model.vo.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class WorkerAction {
    @Autowired
    private WorkerService service;

    @RequestMapping("login.action")
    public String login(){
        return "login";
    }

    @RequestMapping("loginSuccess.action")
    public String loginSuccess(Worker worker){
        boolean ret=service.login(worker);
        if(ret){
            return "success";
        }
        return "login";
    }

    @RequestMapping("regist.action")
    public String regist(){
        return "regist";
    }

    @RequestMapping("registSuccess.action")
    public String registSuccess(Worker worker){
        service.regist(worker);
        return "login";
    }

    @RequestMapping("worker.action")
    public String worker(Model model){
        List<Worker> list=service.showAll();
        model.addAttribute("list",list);
        return "worker";
    }

    @ResponseBody
    @RequestMapping("updateWorker.action")
    public void updateWorker(Worker worker){
        System.out.println("--updateWorker-");
        service.updateWorker(worker);
    }

    @ResponseBody
    @RequestMapping("deleteWorker.action")
    public void deleteWorker(Integer wid){
        service.deleteWorker(wid);
    }
}
