package edu.neusoft.springMVCRegisterDemo.model.dao;

import edu.neusoft.springMVCRegisterDemo.model.vo.Person;
import org.springframework.stereotype.Repository;



@Repository
public class PersonDaoImp implements PersonDao {
//    private ArrayList list;
    @Override
    public Person selectByPnameAndPwd(String pname, String pwd) {
        if("xl".equals(pname)&&"123".equals(pwd)){
            return new Person(100,"xl","123");
        }
        return null;
    }

    @Override
    public void insertPerson(String pname, String pwd) {
        System.out.println("插入到数据库");
    }
}
