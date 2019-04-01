<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/16
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="${pageContext.request.contextPath}/qq.do" method="post">
        <table border="1" bgcolor="red" cellspacing="0" cellpadding="20">
            <tr>
                <td>昵称</td>
                <td>
                    <input type="text" name="name" required pattern=".{3,12}" placeholder="3-12位任意字符" value="${errorMap.name==null?qq.name:''}">
                    <span>${requestScope.errorMap.name}</span>
                </td>
            </tr>
            <tr>
                <td>密码</td>
                <td>
                    <input type="password" name="password" value="${errorMap.password==null?qq.password:''}">
                    <span>${requestScope.errorMap.password}</span>
                </td>
            </tr>
            <tr>
                <td>年龄</td>
                <td>
                    <input type="text" name="age" value="${errorMap.age==null?qq.age:''}">
                    <span>${requestScope.errorMap.age}</span>
                </td>
            </tr>
            <tr>
                <td>手机号</td>
                <td>
                    <input type="text" name="phone" value="${errorMap.phone==null?qq.phone:''}">
                    <span>${requestScope.errorMap.phone}</span>
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="注册"></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
