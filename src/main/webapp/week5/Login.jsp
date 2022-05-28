<%--
  Created by IntelliJ IDEA.
  User: 16683
  Date: 2022/5/28
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>

<%@include file="header.jsp"%>
<div style="text-align: center;">
    <b>Login</b>
    <form method="post" action="login">
        ID : <input type="text" name="ID" /> <br/>
        Password: <input type="password" name="password"/><br/>
        <input type="submit" value="Login"/>
    </form>
</div>
<%@include file="footer.jsp"%>
9
src/main/webapp/WEB-INF/web.xml