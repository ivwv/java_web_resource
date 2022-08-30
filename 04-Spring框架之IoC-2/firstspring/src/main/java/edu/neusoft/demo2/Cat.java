package edu.neusoft.demo2;

public class Cat {
    private Integer cid;
    private String cname;

    public Cat() {
        System.out.println("Cat无参构造方法");
    }

    public Cat(Integer cid, String cname) {
        System.out.println("Cat有参构造方法");
        this.cid = cid;
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
