<%-- 
    Document   : index
    Created on : Apr 3, 2024, 11:47:36 a.m.
    Author     : xiaol
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login - FWRP</title>
</head>
<body>
    <h2>Login</h2>
    <form action="http://localhost:8080/FoodWasteReductionSystem/LoginServlet-URL" method="post">
        <label for="userName">UserName:</label><br>
        <input type="text" id="userName" name="userName" required><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br>
        <input type="submit" value="Login">
    </form>
    <p>Don't have an account? <a href="registration.jsp">Register</a></p>
    <p>${errorMessage}</p>
</body>
</html>
