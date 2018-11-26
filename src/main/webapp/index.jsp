<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Our first web-application</title>
</head>
<body>
<h1 style="color: blue">Welcome to our application !</h1>
<div style="padding-top: 50px"></div>
<form action="/login" method="post">

        <span style="color: red">
            <% if (request.getAttribute("errorMessage") != null)
                out.print(request.getAttribute("errorMessage"));
            %>
        </span><br>

    <label>Username:</label> <input type="text" name="username"/><br><br>

    <label>Password:</label> <input type="password" name="password"/>

    <input type="hidden" name="myhidden" value="traktor">

    <input type="submit" value="Sign In">
</form>
</body>
</html>
