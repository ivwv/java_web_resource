package edu.neusoft.mybatisDemo.model.vo;

public class Person {
    private Integer pid;
    private String pname;
    private Integer page;
    private String pwd;

    public Person() {
    }

    public Person(Integer pid, String pname, Integer page, String pwd) {
        this.pid = pid;
        this.pname = pname;
        this.page = page;
        this.pwd = pwd;
    }

    public Integer getPid() {
        return pid;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", page=" + page +
                ", pwd='" + pwd + '\'' +
                '}';
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

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
