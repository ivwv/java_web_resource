package edu.neusoft.mybatisDemo.controller;

import edu.neusoft.mybatisDemo.model.service.EmpService;
import edu.neusoft.mybatisDemo.model.vo.Dept;
import edu.neusoft.mybatisDemo.model.vo.Emp;
import org.junit.Test;

import java.util.List;

public class TestEmp {
    @Test
    public void testem(){
        EmpService service=new EmpService();
        Dept dept=new Dept();
        dept.setLoc("NEW YORK");
        List<Emp> list=service.findByDept(dept);
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
}
