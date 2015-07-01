<%-- 
    Document   : newpost
    Created on : Jun 24, 2015, 10:49:42 AM
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post</title>
    </head>
    <body>
        <h1>Discussion Thread</h1>
        <p>Enter a new post:</p><br />
        <a href="createpost">View Posts</a>
        <form action="createpost" method="POST">
            <textarea rows="4" cols="50" name="newentry" placeholder="Enter text here..."></textarea>
            <input type="submit" value="Submit">
        </form>
        
    </body>
</html>
