<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/processForm" method="post">

			<div>
				<table>
					<thead>
						<tr>
							<td>Login to your account</td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input name="Username" type="email"
								placeholder="johndoe@doe.net"></td>
						</tr>

						<tr>
							<td><input name="Password" type="password"
								placeholder="password"></td>
						</tr>
						<tr>
							<td><input type="submit" value="Login"></td>
						</tr>
					</tbody>
				</table>
			</div>
		</form>

</body>
</html>