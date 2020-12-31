<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="controller.JSONNotFound"%>
<%@page import="org.json.*"%>
<%@page import="java.io.*" %>
<jsp:useBean id="loginBean" scope="session" class="controller.LoginBean"/>


<jsp:useBean id="interfaceBean" scope="session" class="controller.InterfaceBean"/>
<%-- <jsp:getProperty property="interfaceBean" name="*"/> --%>


<html>
<head>
<meta charset="ISO-8859-1">
	<title>Home-Page</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="js/jquerymin.js"></script>
	<link href="js/bootstrap.min.js"></script>
	<link href="css/style.css" rel="stylesheet">
</head>
<body>

	<img src="oggetti.jpg" width=100% height=300px alt="Mia Immagine">
	
	<table width=100%>
			<td height="40"></td>
			<th><label form="home">&nbsp;<a href="HomePage.jsp"> Home </a></label>
				<label form="result">&nbsp;<a href="ResultPage.jsp"> Result </a></label>
				<label form="profile">&nbsp;<a href="ProfilePage.jsp"> Profile </a></label>
				<div style="float: right; text-align: right;">
 		
					<%
					
						if(loginBean.getLogged()){
					%>
						<label form="log">&nbsp;<a href="LogoutPage.jsp"><u> Logout </u></a>&nbsp;</label>
						
					<%
						}
					else{
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
			<td>Country</td>
			<td><input type="text" name="country" size="20" maxlength="35"></td>
	</tr>
	<td height="15"></td>
	<tr>
			<td>City</td>
			<td><input type="text" name="city" size="20" maxlength="35"></td>
	</tr>
	
	<td height="15"></td>
	<tr>
			
			<td>Address</td>
			<td><input type="text" name="address" size="20" maxlength="35"></td>
	</tr>
	
	<td height="15"></td>
	
	
	
	</table>
	</form>
		
	<tr>
	<div align="center">
			<td>
				<input name="Search" type="submit" value="Search">
				
				
				
				<% 
				try {
					interfaceBean.validate(); 
				} catch (IOException e) { 
					e.printStackTrace(); 
				} catch (JSONNotFound e1) { 
				    
				   
				} 
				%> 
			</td>
	</div>
	</tr>
			
</body>
</html>