<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Order Details</title>
</head>
<body>
	<h1>Add Order Details</h1>
	<form:form action="${pageContext.request.contextPath}/saveorder" modelAttribute="orderdetails"
		method="post">
		<table>
			<tr>
				<td>Order Due:</td>
				<td><form:input path="order_due" /></td>
			</tr>
			<tr>
				<td>Product Name:</td>

				<td><form:input path="product_name" /></td>

			</tr>
			<tr>
				<td>Product Id:</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>User Id:</td>
				<td><form:input path="product_id" /></td>
			</tr>
			<tr>
				<td>Product Price:</td>
				<td><form:input path="user_id" /></td>
			<tr>
				<td>
					<button type="submit">Save</button>
				</td>
			</tr>
		</table>

	</form:form>
	<h3><a href="orderdetails">View Order Details</a></h3>
</body>
</html>