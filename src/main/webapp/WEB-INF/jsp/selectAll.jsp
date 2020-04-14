<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YanYuHang
  Date: 2020/4/14
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align="center" width="30%">
    <tbody>
    <tr align="center">
        <th colspan="3">部门信息详情</th>
    </tr>
    <tr align="center">
        <td>部门编号</td>
        <td>部门名称</td>
        <td>部门操作</td>
    </tr>
    <c:forEach items="${depts}" var="dept">
    <tr align="center">
        <td>${dept.dept_id}</td>
        <td>${dept.dept_name}</td>
        <td>
            <a href="/delete?dept_id=${dept.dept_id}">删除</a>
            <a href="/selectById?dept_id=${dept.dept_id}">修改</a>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/toInsert">添加部门信息</a>
</body>
</html>
