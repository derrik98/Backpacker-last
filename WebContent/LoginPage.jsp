<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!--  dichiarazione e istanziazione di un loginBean !-->
<jsp:useBean id="loginBean" scope="request" class="control.LoginBean"/>

<!--  mappare attributi di un oggetto sui campi della form  !-->
<jsp:setProperty name="loginBean" property="*" />



<%
	if(request.getMethod().equalsIgnoreCase("POST")){
		//String name = request.getParameter("username");
		//String password = request.getParameter("password");
		//System.out.println(name);

 	if(request.getParameter("login")!=null){
 		if(loginBean.validate()) { 
%>
		<jsp:forward page="HomePage.jsp"/>
<%
 		}
 		else {
%>
		<p style="color: red">Dati errati</p>
<%
 		}
 	}
	}
 %>


<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login-Page</title>
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
		<form action="LoginPage.jsp" name="myform" method="POST">
			<div class="row">
				<div align="center">
					<label form="username">Username</label>
					<input type="text" id="username" name="username" autocomplete="off">
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
					<input type="submit" name="login" value="login">
				</div>
			</div>
			<br>
			<div class="row">
				<div align="center">
					<p>Or</p>
				</div>
			</div>
			<br>
			<div class="row">
				<div align="center">
					<input type="submit" name="Create your account" value="Create your account">
				</div>
			</div>
		</form>
	</div>
</body>
</html>