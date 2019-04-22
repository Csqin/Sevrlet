package cn.itcast.dao;

import cn.itcast.domain.User;
import cn.itcast.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
      //提供login方法
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     *
     * @param loginUser
     * @return
     */
    public User login(User loginUser)  {
    try {
        String sql = "select  id,username,password   from user where username = ? and password = ?";

       /* Connection connection = JDBCUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);*/
        //查询结果封装成User对象

        User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),
                loginUser.getUsername(), loginUser.getPassword());
        return user;
    }
    catch ( DataAccessException e)
    {
        return  null;
    }
    }
}
