<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Details</title>
</head>
<body>
	<h1>Welcome to Infy Mart</h1>
	<h1>
		<a href="showOrderForm">Add OrderDetails</a>
	</h1>
	<h2>List of Order Details</h2>
	<table border="1" style="border-collapse: collapse">
		<tr>
			<th>Order Id</th>
			<th>Order Due</th>
			<th>Product Name</th>
			<th>Price</th>
			<th>Product Id</th>
			<th>User Id</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${list}" var="li">
			<tr>
				<td>${li.order_id}</td>
				<td>${li.order_due}</td>
				<td>${li.product_name}</td>
				<td>${li.price}</td>
				<td>${li.product_id}</td>
				<td>${li.user_id}</td>
				<td><a href="${pageContext.request.contextPath}/order/${li.order_id}">Edit</a></td>
				<td><a href="${pageContext.request.contextPath}/delete/${li.order_id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>