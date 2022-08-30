package edu.neusoft.springMVCRegisterDemo.model.service;

import edu.neusoft.springMVCRegisterDemo.model.dao.PersonDao;
import edu.neusoft.springMVCRegisterDemo.model.dao.PersonDaoImp;
import edu.neusoft.springMVCRegisterDemo.model.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDao dao;
//    PersonDao dao=new PersonDaoImp();

//    login方法功能：根据传入的参数pname/pwd查询数据库（dao操作），如果存在则返回该用户，否则返回null
    public boolean login(String pname, String pwd) {
        Person person=dao.selectByPnameAndPwd(pname,pwd);
        if(person==null){
            return false;
        }
        return true;
    }

    public void regist(String pname, String pwd) {
        dao.insertPerson(pname,pwd);
    }

    public List<Person> showAll() {
        return dao.selectAll();
    }
}
