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
@WebServlet( "/ServletDemo2")
public class ServletDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

          //获取所有请求头数据

        Enumeration<String> headerNames = request.getHeaderNames();

        while(headerNames.hasMoreElements())
        {
            String header = headerNames.nextElement();
            String value = request.getHeader(header);

            System.out.println(header+"-----"+value);
        }

    }
}
