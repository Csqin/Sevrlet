package it.itcast.web.servlet;

import javax.jws.WebService;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * GenericServlet继承Servlet
 * 除service方法外，其它方法采用空实现方法实现
 */
@WebServlet("/demo3")
public class ServletDemo3  extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("GenericServlet..............");
    }
}
