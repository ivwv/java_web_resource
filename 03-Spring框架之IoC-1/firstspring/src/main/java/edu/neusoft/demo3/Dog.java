package edu.neusoft.demo3;

public class Dog {
    private Integer did;
    private String dname;

    public Dog() {
        System.out.println("Dog无参构造方法");
    }

    public Dog(Integer did) {
        this.did = did;
    }

    public Dog(Integer did, String dname) {
        System.out.println("Dog有参构造方法");
        this.did = did;
        this.dname = dname;
    }

    public Integer getDid() {
        System.out.println("get did");
        return did;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }

    public void setDid(Integer did) {
        System.out.println("set did");
        this.did = did;
    }

    public String getDname() {
        System.out.println("get dname");
        return dname;
    }

    public void setDname(String dname) {
        System.out.println("set dname");
        this.dname = dname;
    }
}
