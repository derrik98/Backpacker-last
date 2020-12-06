<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
			<td height="15"></td>
			<th>&nbsp; <a href="HomePage.jsp"><u>Home</u></a> &nbsp; <a href="ResultPage.jsp">Result</a> &nbsp; <a href="ProfilePage.jsp">Profile</a>
			<div style="float: right; text-align: right;">Login &nbsp;</div></th>
	</table>

	<br>
	<br>
	
	<form>
	<table align="center">
	<tr>
			<td>seleziona Stato &nbsp;</td>
			<td>
				<select name="Continente" size="1">
				<option>Italia</option>
				<option>Francia</option>
				<option>Spagna</option>
				<option>Germania</option>
				<option>Oceania</option>
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