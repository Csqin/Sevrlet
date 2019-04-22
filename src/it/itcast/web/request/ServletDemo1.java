package it.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 1. 获取请求消息数据
 */
@WebServlet( "/ServletDemo1")
public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * http://localhost:8080/ServletDemo1?name=zhangsan
         *1. 获取请求方式 ：GET
                 * String getMethod()
         2. (*)获取虚拟目录：
                 * String getContextPath()
         3. 获取Servlet路径:
             * String getServletPath()
         4. 获取get方式请求参数：name=zhangsan
             * String getQueryString()
         5. (*)获取请求URI&URL：
             * String getRequestURI()
             * StringBuffer getRequestURL()

             * URL:统一资源定位符 ： http://localhost/day14/demo1	中华人民共和国
             * URI：统一资源标识符 : /day14/demo1					            共和国

         6. 获取协议及版本：
             * String getProtocol()

         7. 获取客户机的IP地址：
             * String getRemoteAddr()
         **/

        // 1. 获取请求方式
        String requestMethod = request.getMethod();
        System.out.println("请求方式："+requestMethod);

        System.out.println("--------");

        //2. (*)获取虚拟目录
        String contextPath = request.getContextPath();

        System.out.println("虚拟目录："+contextPath);

        System.out.println("--------");

        //3. 获取Servlet路径
        String servletPath = request.getServletPath();
        System.out.println("Servlet路径："+servletPath);

        System.out.println("--------");

        //4. 获取get方式请求参数
        String queryString = request.getQueryString();
        System.out.println("请求参数："+queryString);

        System.out.println("--------");

        //5.1 (*)获取请求URI
        String requestURI = request.getRequestURI();
        System.out.println("请求URI："+requestURI);

        System.out.println("--------");

        //5.2 (*)获取请求URL
        StringBuffer requestURL= request.getRequestURL();
        System.out.println("请求URI："+requestURL);

        System.out.println("--------");

        //6. 获取协议及版本
        String requestProtocol = request.getProtocol();

        System.out.println("协议及版本："+requestProtocol);

        System.out.println("--------");

        //7. 获取客户机的IP地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println("客户机的IP地址："+remoteAddr);

        System.out.println("--------");
    }
}
