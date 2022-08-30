package edu.neusoft.loginSpringMVC.model.service;

import edu.neusoft.loginSpringMVC.model.dao.PersonDao;
import edu.neusoft.loginSpringMVC.model.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonDao dao;

    public boolean login(String username, String password) {
        Person person=dao.selectByNameAndPwd(username,password);
        if(person!=null){
            return true;
        }
        return false;
    }
}
