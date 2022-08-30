package edu.neusoft.loginDemo.model.dao;

import edu.neusoft.loginDemo.model.vo.Person;

public interface LoginDao {
    Person selectByPnameAndPwd(String pname, String pwd);
}
