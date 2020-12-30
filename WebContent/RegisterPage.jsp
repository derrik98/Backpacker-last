<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="loginBean" scope="session" class="controller.LoginBean"/>

<!--  dichiarazione e istanziazione di un loginBean !-->
<jsp:useBean id="registerBean" scope="request" class="controller.RegisterController.RegisterBean"/>

<!--  mappare attributi di un oggetto sui campi della form  !-->
<jsp:setProperty name="registerBean" property="*" />





<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Register-Page</title>
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
				<jsp:getProperty name="loginBean" property="logged" />
					<%
						if(loginBean.getLogged()){
							System.out.println(loginBean.getLogged());
					%>
						<label form="log">&nbsp;<a href="LoginPage.jsp"><u> Logout </u></a>&nbsp;</label>
					<%
						}
					else{
						System.out.println(loginBean.getLogged());
					%>
					<label form="log">&nbsp;<a href="LoginPage.jsp"><u> Login </u></a>&nbsp;</label>
					<%
					}
					%>

				</div>
			</th>
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
					<label form="email">Email</label>
					<input type="email" id="email" name="email">
				</div>
			</div>
			<br>
			<div class="row">
				<div align="center">
					<input type="submit" name="Create profile" value="Create profile">
					
					<%
					if(request.getMethod().equalsIgnoreCase("POST")){

 					if(request.getParameter("Create profile")!=null){
 						if(registerBean.validate()) { 
 							String name = request.getParameter("name");
 							String surname = request.getParameter("surname");
 							String password = request.getParameter("password");
 							String email = request.getParameter("email");
 							System.out.println(name + surname + password + email);
					%>
						<jsp:forward page="HomePage.jsp"/>
					<%
 						}
 						else {
					%>
						<br>
						<p style="color: red">Utente già registrato con questa email</p>
					<%
 							}
 						}
					}
 					%>
					
					
				</div>
			</div>
		</form>
	</div>

</body>
</html>