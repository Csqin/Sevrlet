package it.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * 1. 获取请求头数据
 */
@WebServlet( "/ServletDemo3")
public class ServletDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

          //获取user-agent请求头数据

        String user_agent = request.getHeader("user-agent");
        System.out.println(user_agent);
        if (user_agent.contains("Chrome"))
        {
            System.out.println("谷歌浏览器....................");
        }

    }
}
