package edu.neusoft.mybatisDemo.controller;

import edu.neusoft.mybatisDemo.model.service.PersonService;
import edu.neusoft.mybatisDemo.model.vo.Person;
import org.junit.Test;

import java.util.List;

public class TestPerson {
    @Test
    public void testPe(){
        PersonService service=new PersonService();
        List<Person> list=service.showAll();
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
