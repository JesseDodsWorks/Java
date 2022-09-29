<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/css/styles.css">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <h3> Send a Omikuji</h3>
        <form action="/formSub" method="post">
            <label for="counter">Pick a Random Number between 5 and 25</label><br>
                <input class="counter_input" id="counter" name="counter" type="number"><br>
                
            <label for="city"> Pick a Real City </label><br>
                <input id="city" name="city" type="text"><br>
                
            <label for="person">Enter the Name of Any Real Person</label><br>
                <input id="person" name=person type="text"><br>
                
            <label for="hobby">Enter a Professional Hobby</label><br>
                <input id="hobby" name="hobby" type="text"><br>
                
            <label for="thing">Enter Any of Living Thing</label><br>
                <input id="thing" name="thing" type="text"><br>
                
            <label for="message">Say Something Nice to Someone</label><br>
                <input id="message" name="message" type="textarea"><br>
                
            <p>Send and show a friend</p>
            <button type="submit">Send</button>
        </form>
    </div>
</body>
</html>