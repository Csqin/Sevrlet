package it.itcast.web.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * GenericServlet继承Servlet
 * 除service方法外，其它方法采用空实现方法实现
 */
@WebServlet("/demo4")
public class ServletDemo4 extends HttpServlet {

    //网页访问执行doGet方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doGet..........");
    }
    //表单提交指定提交方式为doPost方法，login表单
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost.........");
    }
}
