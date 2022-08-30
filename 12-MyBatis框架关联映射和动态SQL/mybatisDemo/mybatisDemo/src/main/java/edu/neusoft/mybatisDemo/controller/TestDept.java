package edu.neusoft.mybatisDemo.controller;

import edu.neusoft.mybatisDemo.model.service.DeptService;
import edu.neusoft.mybatisDemo.model.vo.Dept;
import edu.neusoft.mybatisDemo.model.vo.Emp;
import org.junit.Test;

public class TestDept {
    @Test
    public void testdt(){
        DeptService service=new DeptService();
        Emp emp=new Emp();
        emp.setEname("SMITH");
        Dept dept=service.selectDeptByEmp(emp);
        System.out.println(dept);
    }
}
