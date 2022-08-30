package edu.neusoft.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext5.xml");
        Dog dog= (Dog) context.getBean("dog");
        System.out.println(dog);
    }
}
