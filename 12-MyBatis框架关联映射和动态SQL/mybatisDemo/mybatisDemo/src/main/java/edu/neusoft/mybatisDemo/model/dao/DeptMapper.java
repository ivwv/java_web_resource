package edu.neusoft.mybatisDemo.model.dao;

import edu.neusoft.mybatisDemo.model.vo.Dept;
import edu.neusoft.mybatisDemo.model.vo.Emp;

public interface DeptMapper {
    Dept selectDeptByEmp(Emp emp);
}
