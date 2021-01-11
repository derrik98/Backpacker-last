<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.ResultBean"%>

<jsp:useBean id="loginBean" scope="session" class="controller.LoginBean"/>

<html>
<head>
<meta charset="ISO-8859-1">
	<title>Result-Page</title>
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
				<label form="home">&nbsp;<a href="index.jsp"> Home </a></label>
				<label form="result">&nbsp;<a href="ResultPage.jsp"><u> Result </u></a></label>
				<label form="profile">&nbsp;<a href="ProfilePage.jsp"> Profile </a></label>
				<div style="float: right; text-align: right;">
					<%
						if(loginBean.getLogged()){
							System.out.println(loginBean.getLogged());
					%>
						<label form="log">&nbsp;<a href="LogoutPage.jsp"> Logout </a>&nbsp;</label>
					<%
						}
					else{
						System.out.println(loginBean.getLogged());
					%>
					<label form="log">&nbsp;<a href="LoginPage.jsp"> Login </a>&nbsp;</label>
					<%
					}
					%>

				</div>
			</th>
	</table>
	
	<br>
	<br>
	
<table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b>
          <jsp:useBean id="resultBean" scope="session" class="controller.ResultBean"/>
		<jsp:getProperty property="itinerary" name="resultBean"/>
         <%
         resultBean.getInstance().getItinerary().get(2);
         %>
          </b></th> 
          
        </table>  
</body>
</html>