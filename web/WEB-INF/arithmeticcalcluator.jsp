<%-- 
    Document   : arithmeticcalcluator
    Created on : 25-Sep-2022, 6:12:07 PM
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
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            Enter Number 1: <input type="number" name="numberOne" value="${numberOne}"><br>
            Enter Number 2: <input type="number" name="numberTwo" value="${numberTwo}"><br>
            
            <input type="submit" value="+" name="add">
            <input type="submit" value="-" name="subtract">
            <input type="submit" value="*" name="multiply">
            <input type="submit" value="/" name="divide">
            
        </form>
            <br>
            <span id="result">Result: ${message}</span>
        <a href="/WEB-INF/agecalculator.jsp"> Age Calculator </a>
    </body>
</html>
