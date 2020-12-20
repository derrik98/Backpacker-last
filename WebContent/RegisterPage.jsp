<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!--  dichiarazione e istanziazione di un loginBean !-->
<jsp:useBean id="registerBean" scope="request" class="controller.RegisterBean"/>

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
						//String name = request.getParameter("username");
						//String password = request.getParameter("password");
						//System.out.println(name);

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
						<p style="color: green">Profilo errato</p>
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