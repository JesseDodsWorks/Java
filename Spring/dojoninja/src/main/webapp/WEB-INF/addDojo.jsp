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
    <title>add Dojo</title>
</head>
<body>
    <div class="container" style="width: 600px">
        <h2>New Dojo</h2>

        <form:form action="/dojos/add" method="post" modelAttribute="dojo">

            <label class="mt-3" for="">Name: </label>
            <form:errors path="name" style="color: red" />	
            <form:input path="name" class="form-control" type="text" />

            <button class="mt-3" type="submit"> Create </button>
        </form:form>
    </div>
</body>
</html>