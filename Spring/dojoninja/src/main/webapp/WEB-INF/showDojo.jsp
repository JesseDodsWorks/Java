<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>show Dojo</title>
</head>
<body>
    <div class="container" style="width: 600px">
        <h2> ${dojo.name} </h2>

        <table class="table">
            <tr>
                <th>First</th>
                <th>Last</th>
                <th>Age</th>
            </tr>

            <c:forEach var="ninja" items="${dojo.ninjas}">
            <tr>
           		<td> ${ninja.firstName} </td>
           		<td> ${ninja.lastName} </td>
           		<td> ${ninja.age} </td>
       		</tr>
           	</c:forEach>
        </table>
    </div>
</body>
</html>