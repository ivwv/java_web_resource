package edu.neusoft.loginDemo.model.service;

import edu.neusoft.loginDemo.model.dao.LoginDaoImp;
import edu.neusoft.loginDemo.model.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginDaoImp dao;

    public boolean login(String pname, String pwd) {
//        根据传递的用户名和密码，调用dao层，查询在数据库中是否存在，如果存在，返回true，否则返回false
//        LoginDao dao= (LoginDao) context.getBean("loginDao");
        Person person=dao.selectByPnameAndPwd(pname,pwd);
        if (person==null){
            return false;
        }
        return true;
    }
}
