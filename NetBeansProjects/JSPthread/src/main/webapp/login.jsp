<%-- 
    Document   : login
    Created on : Jun 24, 2015, 10:32:24 AM
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="POST">
            <label>Username</label>
            <input type="text" name="username" autofocus><br>
            <label>Password</label>
            <input type="password" name="password"><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
