package cn.itcast.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

    public static DataSource dataSource;

    /**
     * JDBC工具类 使用Druid连接池
           1.加载配置文件
                使用ClassLoader加载配置文件，获取字节输入流
            2.初始化连接池对象
     */

                static {
        try {
                    //加载配置文件
                    Properties properties=new Properties();

                    //使用ClassLoader加载配置文件，获取字节输入流
                    InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
                    properties.load(is);
                    // 使用Druid连接池初始化连接池对象
                   dataSource= DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接池对象
     */
    public static  DataSource getDataSource()

    {
        return  dataSource;
    }
    /**
     * 获取连接Connection对象
     */
    public  static Connection getConnection() throws SQLException
    {
        return  dataSource.getConnection();
    }
}
