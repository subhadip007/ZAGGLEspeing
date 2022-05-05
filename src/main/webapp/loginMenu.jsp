<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>This is login menu page</h1>
<a href="http://localhost:8081/createexpense">Create Expense</a><br><br>
<a href="http://localhost:8081/createcategory">Create Category</a>
<table style="border: 2px solid black">

    <tr >
        <th style="border: 2px solid orange">Expense Id</th>
        <th style="border: 2px solid orange">Expense Description</th>
        <th style="border: 2px solid orange">Expense Location</th>
        <th style="border: 2px solid orange">Expense Date</th>
        <th style="border: 2px solid orange">Expense Category</th>
    </tr>
<c:forEach items="${expenses}" var="exp">
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