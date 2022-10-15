<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="../css/styles.css">

<meta charset="ISO-8859-1"> 
<title>Login And Register</title>
</head>
<body>
	<div class="container resize">
        <div>
            <h1 style="color: #D419E6"> Book Club </h1>
            <p> A place for friends to share thoughts on books </p>
        </div>
        <div class="row">
            <div class="col">
                <h4>Register</h4>
                <form:form action="/register" class="form-control" modelAttribute="newUser">
                    <label class="display d-table" for=""> Name: </label>
                    <form:errors path="userName" style="color: red" />
                    <form:input path="userName" class="display d-table"  type="text" />
                    
                    <label class="display d-table"  for=""> Email: </label>
                    <form:errors path="email" style="color: red" />
                    <form:input path="email" class="display d-table"  type="email" />
                    
                    <label class="display d-table"  for="">Password: </label>
                    <form:errors path="password" style="color: red" />
                    <form:input path="password" class="display d-table"  type="password" />
                    
                    <label class="display d-table"  for=""> Confirm Password: </label>
                    <form:errors path="confirm" style="color: red" />
                    <form:input path="confirm" class="display d-table"  type="password" />
                    <button class="mt-3 mb-2" type="submit">submit</button>
                </form:form>
            </div>
            <div class="col">
                <h4>Login</h4>
                <form:form action="/login" class="form-control" modelAttribute="newLogin">
                    <label class="display d-table" for="">Email</label>
                    <form:errors path="email" style="color: red" />
                    <form:input path="email" class="display d-table" type="email" />
                    
                    <label class="display d-table" for="">Password</label>
                    <form:errors path="password" style="color: red" />
                    <form:input path="password" class="display d-table" type="password" />
                    
                    <button class="mt-3 mb-2" type="submit">submit</button>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>