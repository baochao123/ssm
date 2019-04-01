<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/15
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="${pageContext.request.contextPath}/upload.do" method="post" enctype="multipart/form-data">
        <table border="1">
            <tr>
                <td>文件上传：</td>
                <td><input type="file" name="file"></td>
            </tr>
            <tr>
                <td><input type="submit" value="上传"></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>
    <form action="${pageContext.request.contextPath}/uploads.do" method="post" enctype="multipart/form-data">
        <table border="1">
            <tr>
                <td>文件上传：</td>
                <td><input type="file" multiple name="files"></td>
            </tr>
            <tr>
                <td><input type="submit" value="上传"></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
