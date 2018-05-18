<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Product Details</title>
</head>
<body>
	<div>
		<h4>Enter Customer Details</h4>
	</div>
	<form action="${pageContext.request.contextPath}/addOrder" method="get">
	<div>
		<label for="Product Name">Product Name</label>
		<input type="text" name="productName" placeholder="Product Name"><br>
		<label for="Customer Name">Customer Name</label>
		<input type="text" name="customerName" placeholder="Customer Name"><br>
		<label for="Quantity">Quantity</label>
		<input type="text" name="quantity" placeholder="Quantity"><br>
		
		<input type="submit" value="Save">
	</div>
	</form>
</body>
</html>