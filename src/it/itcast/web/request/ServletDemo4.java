package it.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 1. 获取请求头数据
 */
@WebServlet( "/ServletDemo4")
public class ServletDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

          //获取referre请求头数据

        String referer = request.getHeader("referer");
        System.out.println(referer);

      /*  if(referer!=null)
        {
            if (referer.contains("/"))
            {
                response.getWriter().write("播放电影............");
            }

            else
                {
                    response.getWriter().write("sorry............");
                }
        }*/

    }
}
