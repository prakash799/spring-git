<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
	color:red;
}
</style>
</head>
<body>
	<table bordercolor="red" align="center">
		<form:form action="doReg" method="post" modelAttribute="user">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName"><form:errors path="firstName" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName"><form:errors path="lastName" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"><form:errors path="password" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"><form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address"><form:errors path="address" cssClass="error"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
				<td><input type="reset" value="Cancel"></td>
			</tr>
		</form:form>
	</table>
</body>
</html>