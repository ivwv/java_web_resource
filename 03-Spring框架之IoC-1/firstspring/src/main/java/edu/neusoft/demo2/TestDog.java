package edu.neusoft.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDog {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog= (Dog) context.getBean("dog");
        dog.setDname("大黄");
        System.out.println(dog);

//        Dog dog1= (Dog) context.getBean("dog");
//        System.out.println(dog1);

    }
}
