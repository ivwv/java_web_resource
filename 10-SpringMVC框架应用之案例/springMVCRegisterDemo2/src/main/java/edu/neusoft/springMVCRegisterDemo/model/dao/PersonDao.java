package edu.neusoft.springMVCRegisterDemo.model.dao;

import edu.neusoft.springMVCRegisterDemo.model.vo.Person;

import java.util.List;

public interface PersonDao {
    Person selectByPnameAndPwd(String pname, String pwd);

    void insertPerson(String pname, String pwd);

    List<Person> selectAll();
}
