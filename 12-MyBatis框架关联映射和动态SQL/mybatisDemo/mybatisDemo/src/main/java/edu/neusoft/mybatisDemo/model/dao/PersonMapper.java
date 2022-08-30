package edu.neusoft.mybatisDemo.model.dao;

import edu.neusoft.mybatisDemo.model.vo.Person;

import java.util.List;

public interface PersonMapper {
    List<Person> selectAll();

    Person selectByPnameAndPwd(Person person);

    void insertPerson(Person person);
}
