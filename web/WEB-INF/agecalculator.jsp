<%-- 
    Document   : agecalculator
    Created on : 25-Sep-2022, 5:23:47 PM
    Author     : Roxan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter Age: <input type="number" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
            
        </form>
    </body>
</html>
