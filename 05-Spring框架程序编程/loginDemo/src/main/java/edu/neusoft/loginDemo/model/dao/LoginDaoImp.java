package edu.neusoft.loginDemo.model.dao;

import edu.neusoft.loginDemo.model.vo.Person;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImp implements LoginDao{

    @Override
    public Person selectByPnameAndPwd(String pname, String pwd) {
//    模拟数据库，根据用户名和密码查询，是否存在改用户，并返回该用户
        if (("xl").equals(pname)&&("123").equals(pwd)){
            return new Person(10,"xl","123");
        }
        return null;
    }
}
