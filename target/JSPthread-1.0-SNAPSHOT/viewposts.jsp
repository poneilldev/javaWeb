<%-- 
    Document   : viewposts
    Created on : Jun 24, 2015, 1:27:41 PM
    Author     : paul
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Discussion Posts</title>
    </head>
    <body>
        <h1>Discussion Post!</h1>
        <a href="newpost.jsp">Enter New Post</a><br />
                 
    <c:forEach var="user" items="${users}">
        <c:out value="User: ${user.username}"/><br />
        <c:forEach var="post" items="${user.posts}">
            <c:out value="Post: ${post}"/><br />
        </c:forEach>
            <hr>
    </c:forEach>
    
        
        
        <hr>
    </body>
</html>
