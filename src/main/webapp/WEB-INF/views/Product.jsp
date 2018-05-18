<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Product Details</title>
</head>
<body>
	<div>Enter Product Details</div>
	<form action="${pageContext.request.contextPath}/addProduct" method="post">
		<div>
			<label for="Product Name">Product Name</label> <input type="text"
				name="productName" id="Product Name" placeholder="Product Name"><br>
			<label for="Product Description">Product Description</label> <input
				type="text" name="productDescription" id="Product Description"
				placeholder="Product Description"><br> <label
				for="Price">Price</label> <input type="text" name="price" id="Price"
				placeholder="Price"><br>
				<input type="submit" value="Save">
		</div>
	</form>
</body>
</html>