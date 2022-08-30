package edu.neusoft.loginSpringMVC.model.dao;

import edu.neusoft.loginSpringMVC.model.vo.Person;

public interface PersonDao {
    Person selectByNameAndPwd(String username, String password);
}
