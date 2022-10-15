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
<title>Insert title here</title>
</head>
<body>
	<div class="container resize">
        <div class="row">
            <div class="col">
                <h2> Add a book to the Shelf! </h2>
            </div>
            <div class="col">
                <a class="d-table d-flex justify-content-end" href="/homepage"> Back to the shelves </a>
            </div>
        </div>
        <div>
            <form:form  action="/books/create" method="post" modelAttribute="newReview">
			
                <label class="mt-3" for=""> Title </label>
                <form:errors path="title" style="color: red" />
                <form:input path="title" class="d-table w-75" type="text" />
                
                <label class="mt-3" for=""> Author </label>
                <form:errors path="author" style="color: red" />
                <form:input path="author" class="d-table w-75" type="text" />
                
                <label class="mt-3" for=""> My Thoughts </label>
                <form:errors path="review" style="color: red" />
                <form:textarea path="review" class="d-table" cols="60" rows="7"></form:textarea>
                
                <button class="mt-3" type="submit">submit</button>
            </form:form>
        </div>
    </div>
</body>
</html>