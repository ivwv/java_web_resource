package edu.neusoft.springMVCRegisterDemo.model.vo;

public class Person {
    private Integer pid;
    private String pname;
    private String pwd;

    public Person() {
    }

    public Person(Integer pid, String pname, String pwd) {
        this.pid = pid;
        this.pname = pname;
        this.pwd = pwd;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
