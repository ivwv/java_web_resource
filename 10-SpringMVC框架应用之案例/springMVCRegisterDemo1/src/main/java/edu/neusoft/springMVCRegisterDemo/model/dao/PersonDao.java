package edu.neusoft.springMVCRegisterDemo.model.dao;

import edu.neusoft.springMVCRegisterDemo.model.vo.Person;

public interface PersonDao {
    Person selectByPnameAndPwd(String pname, String pwd);

    void insertPerson(String pname, String pwd);
}
