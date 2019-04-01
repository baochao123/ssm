<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/15
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login.do" method="post">
    <center>
        <table border="1" cellspacing="0" cellpadding="20" bgcolor="aqua">
            <tr>
                <td>用户名</td>
                <td><input type="text" name="uname" placeholder="3-12位" pattern=".{3,12}" required></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="psw"></td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="text" name="gender"></td>
            </tr>
            <tr>
                <td>体重</td>
                <td><input type="text" name="weight"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </center>
</form>
</body>
</html>
