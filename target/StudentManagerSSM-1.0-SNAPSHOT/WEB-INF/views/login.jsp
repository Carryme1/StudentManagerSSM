<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/26
  Time: 0:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<form method="get" action="login" role="form">
    <table class="editTable" border="center">
        <tr>
            <td>姓名：</td>
            <td><input id="name" name="name" value="${Student.name}" placeholder="请键入姓名"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input id="password" name="password"></td>
        </tr>
        <tr>
            <td>
                <button type="submit" class="button">提交</button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
