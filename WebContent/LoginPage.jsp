<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!--  dichiarazione e istanziazione di un loginBean !-->
<jsp:useBean id="loginBean" scope="session" class="controller.LoginBean"/>

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
		<jsp:setProperty name="loginBean" property="logged" value="true" />
		<jsp:forward page="HomePage.jsp"/>
<%
 		}
 		else {
%>
		<jsp:setProperty name="loginBean" property="logged" value="false" />
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
			<td height="40"></td>
			<th>
				<label form="home">&nbsp;<a href="HomePage.jsp"> Home </a></label>
				<label form="result">&nbsp;<a href="ResultPage.jsp"> Result </a></label>
				<label form="profile">&nbsp;<a href="ProfilePage.jsp"> Profile </a></label>
				<div style="float: right; text-align: right;">
					<label form="log">&nbsp;<a href="LoginPage.jsp"><u> Login </u></a>&nbsp;</label>
				</div>
			</th>
	</table>
	
	<br>
	<div class="container">
		<form action="LoginPage.jsp" name="myform" method="POST">
			<div class="row">
				<div align="center">
					<label form="email">E-mail</label>
					<input type="text" id="email" name="email" autocomplete="off">
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
					<input type="button" value="Create your account" onclick="location.href='RegisterPage.jsp';" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>