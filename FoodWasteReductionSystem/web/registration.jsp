<%-- 
    Document   : registration
    Created on : Apr 2, 2024, 11:54:45 a.m.
    Author     : xiaol
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration</h2>
    <form action="http://localhost:8080/FoodWasteReductionSystem/UserServlet-URL" method="post">
        <label for="userName">UserName:</label><br>
        <input type="text" id="userName" name="userName" required><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br>
        <label for="firstname">first Name:</label><br>
        <input type="text" id="firstName" name="firstName" required><br> 
        <label for="lasttname">last Name:</label><br>
        <input type="text" id="lastName" name="lastName" required><br>          
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br>
        <label for="userType">User Type:</label><br>
        <select id="userType" name="userType">
            <option value="1">Retailer</option>
            <option value="2">Consumer</option>
            <option value="3">Charitable Organization</option>
        </select><br><br>
        <input type="submit" value="Register">
    </form>
    <p>${errorMessage}</p>
</body>
</html>
