package cn.itcast.dao;

import cn.itcast.domain.User;
import cn.itcast.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *   提供login方法
 */
public class UserDao {

    // Template 是 Spring框架对JDBC的简单封装
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     *登录界面
     * @param loginUser  传入登录的User对象进行查询
     * @return         返回查询结果：如果存在返回对应的User对象，不存在返回null
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

    /**
     *注册界面
     * @param registerUser
     * @return 返回注册结果
     */
    public  int register( User registerUser)
    {

        try {
            String username = registerUser.getUsername();
            String password = registerUser.getPassword();
            String sql = "INSERT  INTO  USER  USER(username,password) VALUES(?,?) ";
            int i = template.update(sql, username, password);
            return i;
        }catch (DataAccessException e)
        {
            return 0;
        }
    }

    /**
     * 删除页面
     * @param deleteUser
     * @return  返回删除结果
     */
    public int delete(User deleteUser)
    {
        try {

            String username = deleteUser.getUsername();
            String password = deleteUser.getPassword();
            String sql="delete from user where username=? and password=?";
            int i = template.update(sql, username, password);
            return  i;
        }catch (DataAccessException e)
        {
            return  0;
        }
    }

}
