package edu.neusoft.mybatisDemo.model.vo;


import java.util.List;

public class Dept {
  private Integer deptno;
  private String dname;
  private String loc;
  private List<Emp> list;

  public List<Emp> getList() {
    return list;
  }

  public void setList(List<Emp> list) {
    this.list = list;
  }

  public Integer getDeptno() {
    return deptno;
  }

  public void setDeptno(Integer deptno) {
    this.deptno = deptno;
  }


  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }


  public String getLoc() {
    return loc;
  }

  public void setLoc(String loc) {
    this.loc = loc;
  }

  @Override
  public String toString() {
    return "Dept{" +
            "deptno=" + deptno +
            ", dname='" + dname + '\'' +
            ", loc='" + loc + '\'' +
            ", list=" + list +
            '}';
  }
}
