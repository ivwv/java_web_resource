package edu.neusoft.mybatisDemo.controller;

import edu.neusoft.mybatisDemo.model.service.StudentService;
import edu.neusoft.mybatisDemo.model.vo.Student;
import org.junit.Test;

import java.util.List;

public class TestSudent {
    @Test
    public void testStu(){
        StudentService service=new StudentService();
        List<Student> list=service.showAll();
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Test
    public void testSelec(){
        StudentService service=new StudentService();
        Student student=new Student();
//        student.setSpassword("123");
        List<Student> list=service.selectByChoose(student);
        for (Student stu : list) {
            System.out.println(stu);
        }
    }
}
