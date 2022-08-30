package edu.neusoft.mybatisDemo.model.service;

import edu.neusoft.mybatisDemo.model.dao.PersonMapper;
import edu.neusoft.mybatisDemo.model.vo.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PersonService {
    private PersonMapper mapper;

    {
        try {
            InputStream stream= Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(stream);
            SqlSession session=factory.openSession();

            mapper=session.getMapper(PersonMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Person> showAll() {
        return mapper.selectAll();
    }
}
