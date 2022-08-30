package edu.neusoft.mybatisDemo.model.vo;

public class Student {
    private Integer sid;
    private String sname;
    private Integer sage;
    private String spassword;

    public Student() {
    }

    public Student(Integer sid, String sname, Integer sage, String spassword) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.spassword = spassword;
    }

    public Integer getSid() {
        return sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", spassword='" + spassword + '\'' +
                '}';
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }
}
