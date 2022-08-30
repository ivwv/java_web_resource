package edu.neusoft.demo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Person {
//    属性注入，真实工作中，基本数据类型的值，通常使用从jsp中传递过来的，不需要手动定义
//    引用类型，通常在一个项目里面，一个数据类型只定义一次，所以，大都使用@Autowired根据数据类型自动加载
//    集合，在真实工作中很少被作为属性使用
    @Value(value = "18")
    private Integer pid;
    @Value(value = "岳云鹏")
    private String pname;
//    @Resource(name = "dog")
    @Autowired
    private Dog dog;

    public Person() {
    }

    public Person(Integer pid, String pname, Dog dog) {
        this.pid = pid;
        this.pname = pname;
        this.dog = dog;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", dog=" + dog +
                '}';
    }
}
