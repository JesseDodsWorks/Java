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
    <link rel="stylesheet" href="../CSS/styles.css">
<meta charset="ISO-8859-1">
<title> Edit Page </title>
</head>
<body>
	<div class="row">
            <h3 class="text-primary col-sm-4"> Edit Expense </h3>
            <div class="col-sm-4"></div>
            <a href="/" class="col-sm-4"> Go back </a>
    </div>
    
        <form:form action="/expense/${expense.id}" method="post" modelAttribute="expense">
        <input type="hidden" name="_method" value="put">
	    <p>
		    <form:label path="expense" for="">Expense</form:label>
		    <form:errors path="expense" style="color: red" />
			<form:input path="Expense" class="form-control" type="text" />
		</p>
		<p>
			<form:label path="vendor" for="">Vendor</form:label>
			<form:errors path="vendor" style="color: red" />
			<form:input path="Vendor" class="form-control" type="text" />
		</p>
		<p>
			<form:label path="amount" for="">Amount</form:label>
			<form:errors path="amount" style="color: red" />
		   	<form:input path="Amount" class="form-control" type="text" />
	   	</p>
	   	<p>
	   		<form:label path="description" for="">Description</form:label>
			<form:errors path="description" style="color: red" />
		   	<form:input path="Description" class="form-control" type="text" />
	   	</p>
        <button class="mt-3" type="submit">Submit</button>
        </form:form>
</body>
</html>