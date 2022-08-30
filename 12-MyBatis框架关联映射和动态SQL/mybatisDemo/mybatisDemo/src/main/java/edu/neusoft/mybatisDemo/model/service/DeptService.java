package edu.neusoft.mybatisDemo.model.service;

import edu.neusoft.mybatisDemo.model.dao.DeptMapper;
import edu.neusoft.mybatisDemo.model.vo.Dept;
import edu.neusoft.mybatisDemo.model.vo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DeptService {
    private DeptMapper mapper;
    SqlSession session;
    {
        try {
            InputStream stream= Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(stream);
            session=factory.openSession();

            mapper=session.getMapper(DeptMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Dept selectDeptByEmp(Emp emp) {
        return mapper.selectDeptByEmp(emp);
    }
}
