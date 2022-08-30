package edu.neusoft.loginSpringMVC.model.dao;

import edu.neusoft.loginSpringMVC.model.vo.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImp implements PersonDao {

    @Override
    public Person selectByNameAndPwd(String username, String password) {
        if("xl".equals(username)&&"123".equals(password)){
            return new Person(100,username,password);
        }
        return null;
    }
}
