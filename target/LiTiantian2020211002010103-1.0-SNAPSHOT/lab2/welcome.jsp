<%--
  Created by IntelliJ IDEA.
  User: 16683
  Date: 2022/5/25
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome-Li Tiantiaan</title>
</head>
<body>
<h2>Welcome,
    <%--todo 9 : use jsp:useBean to access the same instance of login bean from request scope--%>
    <jsp:useBean id="Login"  class="com.litiantian.lab2.demo.Login" scope="request" />
    <%--todo 10 : use jsp:getProperty to display username --%>
    <jsp:getProperty name="Login" property="username" />
    <%=Login.getUsername() %>
</h2>
</body>
</html>
