<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YanYuHang
  Date: 2020/4/16
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/emp/update" method="post">
    <table align="center">
        <tbody>
        <tr>
            <th colspan="2">修改員工信息</th>
        </tr>
        <tr>
            <td>员工编号</td>
            <td>
                <input type="text" value="${emp.emp_id}" name="emp_id" readonly>
            </td>
        </tr>
        <tr>
            <td>员工姓名</td>
            <td>
                <input type="text" value="${emp.emp_name}" name="emp_name">
            </td>
        </tr>
        <tr>
            <td>员工年龄</td>
            <td>
                <input type="text" value="${emp.emp_age}" name="emp_age">
            </td>
        </tr>
        <tr>
            <td>员工部门</td>
            <td>
                <select name="dept.dept_id">
                    <c:forEach items="${depts}" var="dept">
                        <option value="${dept.dept_id}"
                                <c:if test="${emp.dept.dept_id eq dept.dept_id}">selected</c:if>
                        >${dept.dept_name}</option>
                    </c:forEach>
                </select>
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
