<%--
  Created by IntelliJ IDEA.
  User: 16683
  Date: 2022/5/28
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Online Shop</title>
</head>
<body>

@@ -32,10 +33,26 @@
</td>
</tr>
<tr height="25"><td align="right"><font size="18" color="blue">
    Welcome,<font size="18" color="red"> Guest</font>
    Welcome,
    <%
        // 获得session
        User user = (User) session.getAttribute("user");
        if(user != null) {
            out.println(user.getName());
        } else {
    %>
    <font size="18" color="red"> Guest</font>
    <%} %>

</font></td> </tr>
<tr height="20"><td align="right">
    <br> <a href="#">Logout</a>

    <%
        if(session.getAttribute("user") != null) {
    %>
    <br> <a href="logout">Logout</a>
    <%}%>
    <br><a href="#">My Cart</a><br/>
    <a href="register.jsp">Register Here</a>
</td></tr>
</body>
</html>
