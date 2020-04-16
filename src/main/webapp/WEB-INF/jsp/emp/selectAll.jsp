<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YanYuHang
  Date: 2020/4/16
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align="center" width="30%">
    <tbody>
    <tr align="center">
        <th colspan="5">员工详情列表</th>
    </tr>
    <tr align="center">
        <td>员工编号</td>
        <td>员工姓名</td>
        <td>员工年龄</td>
        <td>员工部门</td>
        <td>员工操作</td>
    </tr>
    <c:forEach items="${emps}" var="emp">
    <tr align="center">
        <td>${emp.emp_id}</td>
        <td>${emp.emp_name}</td>
        <td>${emp.emp_age}</td>
        <td>${emp.dept.dept_name}</td>
        <td>
            <a href="/emp/delete?emp_id=${emp.emp_id}">删除</a>
            <a href="/emp/selectById?emp_id=${emp.emp_id}">修改</a>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/emp/toInsert">添加员工信息</a>
</body>
</html>
