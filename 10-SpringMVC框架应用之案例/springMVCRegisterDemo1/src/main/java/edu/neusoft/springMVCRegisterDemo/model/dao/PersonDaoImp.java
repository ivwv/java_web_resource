package edu.neusoft.springMVCRegisterDemo.model.dao;

import edu.neusoft.springMVCRegisterDemo.model.vo.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public class PersonDaoImp implements PersonDao {
    private ArrayList<Person> list=new ArrayList<>();
    private Integer num=100;
    @Override
    public Person selectByPnameAndPwd(String pname, String pwd) {
        for (Person person : list) {
            if(pname.equals(person.getPname())&&pwd.equals(person.getPwd())){
                return person;
            }
        }
        return null;
    }

    @Override
    public void insertPerson(String pname, String pwd) {
//        System.out.println("插入到数据库");
        list.add(new Person(this.num++,pname,pwd));
    }
}
