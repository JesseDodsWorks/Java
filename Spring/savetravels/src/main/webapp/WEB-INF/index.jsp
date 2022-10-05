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
    <link rel="stylesheet" href="../CSS/styles.css">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <h1 class="text-primary">Save Travels</h1>
        <table class="quickBorder table secondary table-striped ">
                <tr>
                    <th>Expense</th>
                    <th>Vendor</th>
                    <th>Amount</th>
                </tr>
                <c:forEach var="item" items="${expenses}">
	         	<tr>
	        		<td><c:out value="${item.expense}"></c:out></td>
	        		<td><c:out value="${item.vendor}"></c:out></td>
	        		<td><c:out value="${item.amount}"></c:out></td>
	       		</tr>
	   			</c:forEach>
        </table>

        <hr>

        <h3 class="text-primary"> Add an Expense </h3>

        <form:form class="quickBorder" action="/expense/new" method="post" modelAttribute="expense">
	    <p>
		    <form:label path="Expense" for="">Expense</form:label>
		    <form:errors path="expense" style="color: red" />
			<form:input path="Expense" class="form-control" type="text" />
		</p>
		<p>
			<form:label path="Vendor" for="">Vendor</form:label>
			<form:errors path="vendor" style="color: red" />
			<form:input path="Vendor" class="form-control" type="text" />
		</p>
		<p>
			<form:label path="Amount" for="">Amount</form:label>
			<form:errors path="amount" style="color: red" />
		   	<form:input path="Amount" class="form-control" type="text" />
	   	</p>
        <button class="mt-3" type="submit">Send</button>
        </form:form>
    </div>
</body>
</html>


			





























