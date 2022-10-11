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
    <title>add Ninja</title>
</head>
<body>
    <div class="container" style="width: 600px">
        <h2>New Ninja</h2>

        <form:form action="/ninjas/add" method="post" modelAttribute="ninja">
        
            <form:select path="dojo" class="form-select mt-3">
            	<c:forEach var="dojos" items="${dojo}">
                	<form:option value="${dojos.id}">${dojos.name}</form:option>
                </c:forEach>
            </form:select>

            <label class="mt-3" for="">First Name: </label>
            <form:errors path="firstName" style="color: red" />
            <form:input path="firstName" class="form-control" type="text"/>
            
            <label class="mt-3" for="">Last Name: </label>
            <form:errors path="lastName" style="color: red" />
            <form:input path="lastName" class="form-control" type="text"/>
            
            <label class="mt-3" for="">Age </label>
            <form:errors path="age" style="color: red" />
            <form:input path="age" class="form-control " type="number"/>

            <button class="mt-3" type="submit"> Create </button>
        </form:form>
    </div>
</body>
</html>