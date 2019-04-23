package cn.itcast.text;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.junit.Test;

import java.sql.SQLException;

public class UserDaoText {
    /***
     * 测试UserDao
     * @throws SQLException
     */
    @Test
    public  void textLogin() throws SQLException {
       //新建User对象，设置其Username,password
        User user=new User();
        user.setUsername("Csqin");
        user.setPassword("123");

        //新建UserDao对象，使用其login方法进行测试
        UserDao userDao=new UserDao();
        User user1 = userDao.login(user);
        System.out.println(user1);
    }
}
