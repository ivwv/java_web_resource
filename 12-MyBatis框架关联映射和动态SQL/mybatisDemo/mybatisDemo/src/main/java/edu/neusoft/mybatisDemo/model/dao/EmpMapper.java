package edu.neusoft.mybatisDemo.model.dao;

import edu.neusoft.mybatisDemo.model.vo.Dept;
import edu.neusoft.mybatisDemo.model.vo.Emp;

import java.util.List;

public interface EmpMapper {
    List<Emp> findByDept(Dept dept);
}
