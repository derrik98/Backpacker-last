<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="loginBean" scope="session" class="controller.LoginBean"/>

<html>
<head>
<meta charset="ISO-8859-1">
	<title></a>Result-Page</title>
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
					<%
						if(loginBean.getLogged()){
							System.out.println(loginBean.getLogged());
					%>
						<label form="log">&nbsp;<a href="LogoutPage.jsp"><u> Logout </u></a>&nbsp;</label>
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
	<br>
	
	<form>
	<table align="center">
	<tr>
			<td>seleziona continente &nbsp;</td>
			<td>
				<select name="Continente" size="1">
				<option>Africa</option>
				<option>America</option>
				<option>Asia</option>
				<option>Europa</option>
				<option>Oceania</option>
			</select></td>
	</tr>
</body>
</html>