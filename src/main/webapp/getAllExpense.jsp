<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Get all expense</h1>
<table>
    <tr>
        <th>Expense Id</th>
        <th>Expense Description</th>
        <th>Expense Location</th>
        <th>Expense Date</th>
        <th>Expense Category</th>
    </tr>
    <c:forEach items="${ex}" var="exp">
        <tr>
            <td>${exp.eid}</td>
            <td>${exp.edesc}</td>
            <td>${exp.elocation}</td>
            <td>${exp.timestamp}</td>
            <td>${exp.category_id.cname}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>