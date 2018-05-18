<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processRegistration" modelAttribute="customer">
		FirstName:	<form:input path="firstName" />
		<br>
		<br>
		LastName: <form:input path="lastName" />
		<br>
		<br>
		Email : <form:input path="email" />
		<br>
		<br>
		UserName: <form:input path="username" />
		<br>
		<br>
		Password: <form:password path="password" required = "required"/>
		<br>
		<br>
		Confirm password: <form:password path="password" required = "required" />
		<br>
		<br>
		<input type="submit" value = "Register">

	</form:form>



</body>
</html>