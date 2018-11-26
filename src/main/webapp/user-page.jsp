<%@ page import="com.scatum.user.UserManagement" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Our first web-application</title>
</head>
<body>
    <h1 style="color: blue">Welcome to our application !</h1>
    <h1 style="color: red">You are logged in !</h1>
    <div style="padding-top: 50px"></div>

    <label>Username:</label> <% out.println(UserManagement.currentUser.getUsername()); %>
    <label>Password:</label> <% out.println(UserManagement.currentUser.getPassword()); %>
</body>
</html>
