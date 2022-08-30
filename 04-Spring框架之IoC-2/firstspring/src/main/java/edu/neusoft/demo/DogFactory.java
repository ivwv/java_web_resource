package edu.neusoft.demo;

public class DogFactory {
    public Dog getDog(){
        Dog dog=new Dog();
        return dog;
    }

    public static Dog getStaticDog(){
        Dog dog=new Dog();
        return dog;
    }
}
