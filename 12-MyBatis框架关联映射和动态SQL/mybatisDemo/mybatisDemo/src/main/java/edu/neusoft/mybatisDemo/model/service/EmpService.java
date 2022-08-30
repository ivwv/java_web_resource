package edu.neusoft.mybatisDemo.model.service;

import edu.neusoft.mybatisDemo.model.dao.DeptMapper;
import edu.neusoft.mybatisDemo.model.dao.EmpMapper;
import edu.neusoft.mybatisDemo.model.vo.Dept;
import edu.neusoft.mybatisDemo.model.vo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class EmpService {
    private EmpMapper mapper;
    SqlSession session;
    {
        try {
            InputStream stream= Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(stream);
            session=factory.openSession();

            mapper=session.getMapper(EmpMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Emp> findByDept(Dept dept) {
        return mapper.findByDept(dept);
    }
}
