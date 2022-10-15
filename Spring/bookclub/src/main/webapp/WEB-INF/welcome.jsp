<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="../css/styles.css">
<meta charset="ISO-8859-1">
<title> Books </title>
</head>
<body>
    <div class="container resize">
        <div class="row">
            <div class="col">
                <h2> Welcome, ${user.userName} </h2>
                <p> Books from everyone's shelves: </p>
            </div>
            <div class="col">
                <a class=" d-table d-flex justify-content-end" href="/logout"> logout </a>
                <a class=" d-table d-flex justify-content-end" href="/books/new"> + Add to the shelf! </a>
            </div>
        </div>
        <div>
            <table class="table table-striped table-bordered table-secondary">
            	<tr>
                    <th> ID </th>
                    <th> Title </th>
                    <th> Author Name </th>
                    <th> Post By </th>
                </tr>
            
            	<c:forEach var="review" items="${reviews}">
                <tr>
                    <td> ${review.id} </td>
                    <td> <a href="/book/${review.id}"> ${review.title} </a> </td>
                    <td> ${review.author} </td>	
                    <td> ${review.user.userName} </td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>