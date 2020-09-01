<%--
  Created by IntelliJ IDEA.
  User: Root
  Date: 07.08.2020
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>list Users</title>
</head>
<body>
<h2>Users</h2>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>sex</th>
    </tr>
    <c:forEach var="userCurrent" items="${userList}">
        <tr>
            <td>${userCurrent.id}</td>
            <td>${userCurrent.name}</td>
            <td>${userCurrent.age}</td>
            <td>${userCurrent.sex}</td>
            <td>
                <a href="/edit/${userCurrent.id}">edit</a>
                <a href="/delete/${userCurrent.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h3>Add</h3>
<c:url value="/add" var="add"/>
<a href="${add}">Add new user</a>

</body>
</html>
