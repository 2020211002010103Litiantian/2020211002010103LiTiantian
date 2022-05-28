<%--
  Created by IntelliJ IDEA.
  User: 16683
  Date: 2022/3/9
  Time: 0:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>New User Registration!</title>
</head>
<body>
<tr>
    <td>Username</td>
    <td><input type="text" nsme="username"/></td>
</tr>
<tr>
    <td>password</td>
    <td><input type="password" name="password"/></td>
</tr>
<tr>
    <td>Email</td>
    <td><input type="email" name="email"/></td>
</tr>
<tr>
    <td>Gender</td>
    <td>
        <label>Male
            <input type="radio" name="sex" value="Male"/>

        </label>
        <label>Female
           <input type="radio" name="sex" value="Female"/>
        </label>
    </td>
</tr>
<tr>
    <td>Date of Birth(yyy-mm-dd)</td>
    <td><input type="datetime-local" name="datetime-local"></td>
</tr>
<tr>
    <td><input type="submit" name="register"/></td>
</tr>
</body>
</html>
