<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="updateDAO" modelAttribute="updatecustomer">
	FirstName:	<form:input path="firstName" />
		<br>
		<br>
		LastName: <form:input path="lastName" />
		<br>
		<br>
		Email : <form:input path="email" />
		<br>
		<br>
		UserName: <form:input path="username"/>
		<br>
		<br>
		<input type="submit" value = "Update">

	</form:form>


</body>
</html>