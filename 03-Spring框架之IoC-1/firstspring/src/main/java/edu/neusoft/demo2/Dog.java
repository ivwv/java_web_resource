package edu.neusoft.demo2;

public class Dog {
    private Integer did;
    private String dname;

    public Dog() {
        System.out.println("Dog无参构造方法");
    }

    public Dog(Integer did, String dname) {
        System.out.println("Dog有参构造方法");
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

    public void test1(){
        System.out.println("----test1");
    }

    public void test2(){
        System.out.println("-----test2");
    }
}
