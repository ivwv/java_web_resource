package edu.neusoft.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext4.xml");
        Person person= (Person) context.getBean("person");
        System.out.println(person);
    }
}
