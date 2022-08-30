package edu.neusoft.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDog {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        Dog dog=new Dog();
        Dog dog= (Dog) context.getBean("dog");
        System.out.println(dog);

//        DogFactory factory=new DogFactory();
//        Dog dog1=factory.getDog();
        Dog dog1= (Dog) context.getBean("dog1");
        System.out.println(dog1);

//        Dog dog2=DogFactory.getStaticDog();
        Dog dog2= (Dog) context.getBean("dog2");
        System.out.println(dog2);

    }
}
