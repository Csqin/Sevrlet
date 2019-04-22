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
        User user=new User();
        user.setUsername("Csqin");
        user.setPassword("123");

        UserDao userDao=new UserDao();
        User user1 = userDao.login(user);
        System.out.println(user1);
    }
}
