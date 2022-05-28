<%--
  Created by IntelliJ IDEA.
  User: 16683
  Date: 2022/5/28
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
@@ -7,9 +7,27 @@
out.println(request.getAttribute("message"));
}
%>
<%
    Cookie[] allCooikes = request.getCookies();
    String username="", passowrd="", rememberMe="";
    if(allCooikes!=null) {
        for (Cookie c : allCooikes) {
            if(c.getName().equals("cUsername")) {
                username = c.getValue();
            }
            if(c.getName().equals("cpassword")) {
                passowrd = c.getValue();
            }
            if(c.getName().equals("crememberMe")) {
                rememberMe = c.getValue();
            }
        }
    }
%>
<form method="post" action="login">
    ID : <input type="text" name="ID" /> <br/>
    Password: <input type="password" name="password"/><br/>
    ID : <input type="text" name="ID" value="<%=username%>"/> <br/>
    Password: <input type="password" name="password" value="<%=passowrd%>"/><br/>
    <input type="checkbox" name="rememberMe" value="1" <%= rememberMe.equals("1") ? "checked": "" %>checked/> RememberMe <br/>
    <input type="submit" value="Login"/>
</form>
</div>