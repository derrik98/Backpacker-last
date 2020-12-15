<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--  dichiarazione e istanziazione di un loginBean !-->
<jsp:useBean id="loginBea" scope="request" class="jspexample.LoginBea"/>

<!--  mappare attributi di un oggetto sui campi della form  !-->
<jsp:setProperty name="loginBea" property="*" />

<%
	if(request.getParameter("login")!=null){
		if(loginBea.validate()) { 
%>
		<jsp:forward page="RiassuntoLogin.jsp"/>
<%
		}
		else {
%>
		<p style="color: red">Dati errati</p>
<%
		}
	}
%>

<html>
<head>
	
</head>
<body>

	<br>
	<div class="container">
		<form action="index.jsp" name="myform" method="POST">
			<div class="row">
				<div class="col-lg-4 form-group">
					<label form="username">Username</label>
					<input type="text" id="username" name="username" autocomplete="off">
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4 form-group">
					<label form="password">Password</label>
					<input type="password" id="password" name="password">
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4 form-group">
					<input type="submit" name="login" value="login">
				</div>
			</div>
		</form>
	</div>
	</br>
</body>
</html>