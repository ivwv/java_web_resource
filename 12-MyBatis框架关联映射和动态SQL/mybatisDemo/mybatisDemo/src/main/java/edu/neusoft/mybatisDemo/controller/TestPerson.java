package edu.neusoft.mybatisDemo.controller;

import edu.neusoft.mybatisDemo.model.service.PersonService;
import edu.neusoft.mybatisDemo.model.vo.Person;
import org.junit.Test;

import java.util.List;

public class TestPerson {
//    @Test
    public void testPe(){
        PersonService service=new PersonService();
        List<Person> list=service.showAll();
        for (Person person : list) {
            System.out.println(person);
        }
    }

//    增删改查
//    查询所有、条件查询（登录）
//    注册、删除、修改
    @Test
    public void testLogin(){
        Person person=new Person();
        person.setPname("xl");
        person.setPwd("123");
        PersonService service=new PersonService();
        boolean ret=service.login(person.getPname(),person.getPwd());
        if(ret){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }

    }

//插入
    @Test
    public void testInsert(){
        Person person=new Person();
        person.setPname("jack");
        person.setPwd("123");
        PersonService service=new PersonService();
        service.regist(person);
    }

}
