<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="controller.JSONNotFound"%>
<%@page import="org.json.*"%>
<%@page import="org.apache.jasper.*"%>
<%@page import="java.io.*" %>
<jsp:useBean id="loginBean" scope="session" class="controller.LoginBean"/>


<jsp:useBean id="interfaceBean" scope="session" class="controller.InterfaceBean"/>
<jsp:setProperty property="*" name="interfaceBean"/>


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
	
	<div class="container">
	<form action="index.jsp" name="myform" method="POST">
	
	<div class="row">
				<div align="center">
					<label form="country">Country</label>
					<input type="text" id="country" name="country">
				</div>
			</div>
	<br>
	<div class="row">
				<div align="center">
					<label form="city">City</label>
					<input type="text" id="city" name="city">
				</div>
			</div>
	
	<br>
	<div class="row">
				<div align="center">
					<label form="address">Address</label>
					<input type="text" id="address" name="address">
				</div>
			</div>
	
	<br>
	
	<tr>
	<div align="center">
			<td>
				<input name="search" type="submit" value="search">
				
				<%
	if(request.getMethod().equalsIgnoreCase("POST")){
 		if(request.getParameter("search")!=null){
 			String country = request.getParameter("country");
 			String city = request.getParameter("city");
 			String address = request.getParameter("address");
 			System.out.println(country + city + address);
 			try {
				interfaceBean.validate(); 
				%>
					<jsp:forward page="ResultPage.jsp"/>
				<%
			} catch (IOException e) { 
				%>
				<br>
				<p style="color: #ff0000">
				<% 
				e.getMessage();
				%>
				</p>
				<%
			} catch (JSONNotFound e1) { 
				%>
				<br>
				<p style="color: #ff0000">
				<% 
				e1.getMessage();
				%>
				</p>
				<%	   
			} 
 		}
	}
 %>
			</td>
	</div>
	</tr>
	
	
	
	
	</form>
		</div>
	
			
</body>
</html>