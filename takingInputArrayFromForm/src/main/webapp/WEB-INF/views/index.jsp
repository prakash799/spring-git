<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type='text/javascript'>
	function addinputFields() {
		var number = document.getElementById("member").value;

		for (i = 0; i < number; i++) {

			var input = document.createElement("input");
			input.type = "text";
			container.appendChild(input);
			container.appendChild(document.createElement("br"));
		}
	}
</script>
</head>
<body>
	<form enctype="multipart/form-data" action="" method="post">
		Number of members:<input type="text" id="member" name="member" value=""><br />
		<button id="btn" onclick="addinputFields()">Button</button>
	</form>
	<a href="goToRegistrationPage">Go to Registration Page</a>
</body>
</html>