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
<title>show review</title>
</head>
<body>
    <div class="container resize">
        <div class="row">
            <div class="col">
                <h2> ${calledReview.title} </h2>
            </div>
            <div class="col">
                <a class="d-table d-flex justify-content-end" href="/homepage"> Back to the shelves </a>
            </div>
        </div>
        <div>
            <c:set var="userId" value='<%=session.getAttribute("userId")%>'/>
            
            <!-- User DID create  -->
            <c:if test="${calledReview.user.id == userId}">
	            <h6> I read ${calledReview.title} by ${calledReview.author} </h6>
	            <h6> Here are my thoughts:</h6>
	
	            <hr>
	            <p> ${calledReview.review} </p>
	            <hr>
	
	            <!-- only visible it the creator's id matches the id of the current user -->
	            <div class="d-flex">
		            <a class="btn btn-info me-2" href="/edit/review/${id}"> edit </a>
		            
		            <form  action="/delete/${id}" method="post">
					    <input type="hidden" name="_method" value="delete">
					    <input class="btn btn-danger " type="submit" value="Delete">
					</form>
				</div>
            </c:if>
            
            <!-- User DID NOT create  -->
            <c:if test="${calledReview.user.id != userId}">
	           	<h6> ${calledReview.user.userName} read ${calledReview.title} by ${calledReview.author} </h6>
	            <h6> Here are ${calledReview.user.userName} thoughts:</h6>
	
	            <hr>
	            <p> ${calledReview.review} </p>
	            <hr>
	
            </c:if>
        </div>
    </div>
</body>
</html>