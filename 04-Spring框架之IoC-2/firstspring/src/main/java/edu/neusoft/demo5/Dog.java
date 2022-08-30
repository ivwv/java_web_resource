package edu.neusoft.demo5;

import org.springframework.stereotype.Component;
//Dog dog=new Dog()
//<bean id="dog" class="edu.neusoft.demo5.Dog">
@Component
public class Dog {
    private Integer did;
    private String dname;

    public Dog() {
    }

    public Dog(Integer did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}
