
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="/css/styles.css">


</head>
<body>
	<div class="container">

        <div class="pink">Fruit Store</div>
        <div class="center">
            <table class="table-dec">
                <tr>
                    <th>Name</th>
                    <th>Price</th>
                </tr>
                <!-- For Loop Start -->
                <c:forEach var="eachItem" items="${FruityLoopsControllers}">
                <tr>
                    <td><c:out value="${eachItem.name}"></c:out></td>
                    <td><c:out value="${eachItem.price}"></c:out></td>
                </tr>
                </c:forEach>
                <!-- For Loop End -->
            </table>
        </div>
    </div>
</body>
</html>