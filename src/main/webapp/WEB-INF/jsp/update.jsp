<%--
  Created by IntelliJ IDEA.
  User: YanYuHang
  Date: 2020/4/14
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/update" method="post">
    <table align="center">
        <tbody>
        <tr>
            <td>部门编号</td>
            <td>
                <input type="text" name="dept_id" value="${dept.dept_id}" readonly>
            </td>
        </tr>
        <tr>
            <td>部门名称</td>
            <td>
                <input type="text" name="dept_name" value="${dept.dept_name}">
            </td>
        </tr>
        <tr>
            <td>
                <button type="reset">重置</button>
            </td>
            <td>
                <button type="submit">修改</button>
            </td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
