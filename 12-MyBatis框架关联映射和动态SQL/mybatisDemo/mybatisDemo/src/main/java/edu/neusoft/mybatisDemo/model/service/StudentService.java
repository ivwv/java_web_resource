package edu.neusoft.mybatisDemo.model.service;

import edu.neusoft.mybatisDemo.model.dao.StudentMapper;
import edu.neusoft.mybatisDemo.model.vo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentService {
    private StudentMapper mapper;
    SqlSession session;
    {
        try {
            InputStream stream= Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(stream);
            session=factory.openSession();

            mapper=session.getMapper(StudentMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Student> showAll() {
        return mapper.selectAll();
    }

    public List<Student> selectByChoose(Student student) {
        return mapper.selectByChoose(student);
    }
}
