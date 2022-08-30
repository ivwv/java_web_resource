package edu.neusoft.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDog {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog dog= (Dog) context.getBean("dog3");
        System.out.println(dog);

    }
}
