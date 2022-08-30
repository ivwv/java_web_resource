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
    SqlSession session;
    {
        try {
            InputStream stream= Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(stream);
            session=factory.openSession();

            mapper=session.getMapper(PersonMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Person> showAll() {
        return mapper.selectAll();
    }

    public boolean login(String pname,String pwd) {
        Person person=new Person();
        person.setPname(pname);
        person.setPwd(pwd);
        Person pers=mapper.selectByPnameAndPwd(person);
        if(pers==null){
            return false;
        }
        return true;
    }

    public void regist(Person person) {
        mapper.insertPerson(person);
//        session.commit();
    }
}
