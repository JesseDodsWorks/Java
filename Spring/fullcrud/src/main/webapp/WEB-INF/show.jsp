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
<title> Show <c:out value="${expenses.expense}" /> </title>
</head>
<body>
	<div class="container">
        <div class="row">
            <h3 class="text-primary col-sm-4"> Expense Details </h3>
            <div class="col-sm-4"></div>
            <a href="/" class="col-sm-4"> Go back </a>
        </div>

        <div>
            <p>Expense Name: <c:out value="${expenses.expense}" /> </p>
            <p>Expense Description: <c:out value="${expenses.description}" /> </p>
            <p>Vendor: <c:out value="${expenses.vendor}" /> </p>
            <p>Amount Spent: <c:out value="${expenses.amount}" /> <p>

        </div>
    </div>
</body>
</html>