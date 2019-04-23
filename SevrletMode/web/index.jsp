<%--
  Created by IntelliJ IDEA.
  User: ShmilyCSQ
  Date: 2019/4/22
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  <form action="/LoginServlet" method="post">
    用户名:<input type="text" name="username"> <br>
    密码&nbsp;&nbsp;&nbsp;:<input type="password" name="password"><br>
    <input type="submit" value="登录">
  </form>
  </body>
</html>
