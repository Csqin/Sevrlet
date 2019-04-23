package cn.itcast.web.servlet;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置字符格式
        request.setCharacterEncoding("utf-8");
     /*   //获取表单提交的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //创建User对象，将表单username，password传入
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
    */


     //BeanUtils工具类，用来封装目标对象
        //1.获取map集合
        Map<String, String[]> map = request.getParameterMap();
        //2.获取目标对象
        User user=new User();

        try {
            //使用BeanUtils方法封装目标对象
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //创建UserDao对象调用login方法，获得一个User返回值或null
        UserDao userDao=new UserDao();
        User loginstate= userDao.login(user);

        //判断返回值跳转Servlet
        if(loginstate!=null)
        {
            //传递用户名
            request.setAttribute("user",loginstate);
            request.getRequestDispatcher("/SuccessServlet").forward(request,response);
        }

        else
        {
                request.getRequestDispatcher("/FailServlet").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
    }
}
