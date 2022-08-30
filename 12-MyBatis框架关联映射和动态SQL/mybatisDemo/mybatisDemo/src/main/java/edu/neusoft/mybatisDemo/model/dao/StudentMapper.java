package edu.neusoft.mybatisDemo.model.dao;

import edu.neusoft.mybatisDemo.model.vo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectAll();

    List<Student> selectByChoose(Student student);
}
