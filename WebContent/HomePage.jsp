<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:useBean id="loginBean" scope="session" class="controller.LoginBean"/>
<!--  dichiarazione e istanziazione di un loginBean !-->
<jsp:useBean id="HomePage" scope="request" class="boundary.desktop.HomeGraphicInterface"/>

<!--  mappare attributi di un oggetto sui campi della form  !-->
<jsp:setProperty name="HomePage" property="*" />

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
		
			<td>seleziona Stato &nbsp;</td>
			<td>
				<select name="Continente" size="1">
			
			<%
			    for(int j=0; j<HomePage.addCountry().size(); j++) {
			        out.println("<option>" + HomePage.addCountry().get(j) + "</option>");
			    }
			%>

			</select></td>
	</tr>
	<td height="15"></td>
	<tr>
			
			<td>seleziona citt&agrave; &nbsp;</td>
			<td><select name="Città" size="1">
				<option>Roma</option>
				<option>Milano</option>
				<option>Torino</option>
				<option>Napoli</option>
				<option>Palermo</option>
			</select></td>
	</tr>
	
	<td height="15"></td>
	<tr>
			
			<td>Indirizzo</td>
			<td><input type="text" name="Indirizzo" size="20" maxlength="35"></td>
	</tr>
	
	<td height="15"></td>
	
	
	
	</table>
	</form>
		
	<tr>
	<div align="center">
			<td>
				<input name="Search" type="submit" value="Search">
			</td>
	</div>
	</tr>
			
</body>
</html>