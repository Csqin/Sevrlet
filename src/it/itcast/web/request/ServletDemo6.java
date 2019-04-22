package it.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * 演示request其他功能
 */
@WebServlet( "/ServletDemo6")
public class ServletDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/**
 * * 中文乱码问题：
             get方式：tomcat 8 已经将get方式乱码问题解决了
            post方式：会乱码
 * 解决：在获取参数前，设置request的编码request.setCharacterEncoding("utf-8");
 */
        request.setCharacterEncoding("utf-8");

   /*
                //request.getParameter获取表单提交的用户名和密码

                String name = request.getParameter("username");
                String password = request.getParameter("password");
                System.out.println("用户名:"+name);
                System.out.println("密码："+password);
    */


   /*             //String[] getParameterValues(String name):根据参数名称获取参数值的数组

                String[] values = request.getParameterValues("hobby");
                for (String value : values) {
                    System.out.println(value);
                }
    */

  /*              //Enumeration<String> getParameterNames():获取所有请求的参数名称(bu)
                Enumeration<String> names = request.getParameterNames();
                while (names.hasMoreElements())
                {
                    //获取请求参数名称
                    String name = names.nextElement();
                    System.out.println(name);
                    //获取请求参数对应的值
                    String value = request.getParameter(name);
                    System.out.println(value);
                    System.out.println("--------------------------");
                }
 */


            //Map<String,String[]> getParameterMap():获取所有参数的map集合
            Map<String, String[]> parameterMap = request.getParameterMap();
            Set<String> keySet = parameterMap.keySet();
            for (String key : keySet) {
                //输出获取的参数的名称
                System.out.println("参数的名称："+key);

                //获取参数名称指定的值
                String[] value = parameterMap.get(key);
                for (String values:value)
                {
                    //遍历数组
                    System.out.println("值："+values);
                }

                System.out.println("--------------------");
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);
    }
}
