<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Registration-Page</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="js/jquerymin.js"></script>
	<link href="js/bootstrap.min.js"></script>
	<link href="css/style.css" rel="stylesheet">
</head>
<body>

<img src="oggetti.jpg" width=100% height=300px alt="Mia Immagine">
	
	<table width=100%>
			<td height="15"></td>
			<th>&nbsp; <a href="HomePage.jsp">Home</a> &nbsp; <a href="ResultPage.jsp">Result</a> &nbsp; <a href="ProfilePage.jsp">Profile</a>
			<div style="float: right; text-align: right;"><a href="LoginPage.jsp"><u>Login</u></a> &nbsp;</div></th>
	</table>
	
	<br>
	<div class="container">
		<form action="RegisterPage.jsp" name="myform" method="POST">
			<div class="row">
				<div align="center">
					<label form="name">Name</label>
					<input type="text" id="name" name="name" autocomplete="off">
				</div>
			</div>
			<br>
			<div class="row">
				<div align="center">
					<label form="surname">Surname</label>
					<input type="text" id="surname" name="surname" autocomplete="off">
				</div>
			</div>
			<br>
			<div class="row">
				<div align="center">
					<label form="password">Password</label>
					<input type="password" id="password" name="password">
				</div>
			</div>
			<br>
			<div class="row">
				<div align="center">
					<label form="email">E-mail</label>
					<input type="email" id="email" name="email">
				</div>
			</div>
			<br>
			<div class="row">
				<div align="center">
					<input type="submit" name="Create profile" value="Create profile">
				</div>
			</div>
		</form>
	</div>

</body>
</html>