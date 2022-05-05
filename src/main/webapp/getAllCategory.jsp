<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Get all CATEGORY</h1>
<table>
    <tr>
        <th>CATEGORY Id</th>
        <th>CATEGORY NAME</th>
    </tr>
    <c:forEach items="${cat}" var="exp">
        <tr>
            <td>${exp.cid}</td>
            <td>${exp.cname}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>