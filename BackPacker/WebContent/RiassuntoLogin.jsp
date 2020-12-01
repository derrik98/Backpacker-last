<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Pagina della spesa</title>
	</head>
	
	<body>
	<h2>Pagina della spesa</h2>
	<p>In questa pagina mostreremo come utilizzare vari elementi HTML mediante un esempio
	di modulo per gli acquisti.</p>
	<p><a name="InizioDocumento"></a>Gli elementi che vogliamo creare sono</p>
	<ul>
		<li>Checkbox</li>
		<li>Radio button</li>
		<li>Text field</li>
		<li>Text field protetto</li>
		<li>Single selection field</li>
		<li>Multiple selection field</li>
		<li>Button
			<ol>
				<li>Submit button</li>
				<li>Reset button</li>
			</ol>
		</li>
	</ul>
	
	<p>Nella seguente tabella scriviamo dettagli di ciascun
	elemento</p>
	
	<table border="1" width=500px>
		<tr>
			<th>Elemento HTML</th>
			<th>Valori</th>
		</tr>
		
		<tr>
			<td>Checkbox</td>
			<td>Scegliere un qualsiasi numero di elementi tra Frutta, 
			Elettronica, Casa.</td>
		</tr>
		
		<tr>
			<td>Radio button</td>
			<td>Scegliere una delle seguenti strategie di sconto:
				Sconto del 10% sul totale; sconto di 50£ sulla frutta.</td>
		</tr>
		
		<tr>
			<td>Text field</td>
			<td>Nome del cliente.</td>
		</tr>
		
		<tr>
			<td>Text field protetto</td>
			<td>Numero di carta.</td>
		</tr>
		
		<tr>
			<td>Selection field</td>
			<td>Continente.</td>
		</tr>
		
		<tr>
			<td>Selection field multiple</td>
			<td>selezionare le nazioni dalle quali si
				accetta di ricevere la merce tra:Italia, Francia, Germania, Spagna, Svezia.</td>
		</tr>
		
		<tr>
			<td>Button</td>
			<td>Bottone epr l'invio dei dati al server ed il reset del form.</td>
		</tr>
	
	</table>
	
	<br>
	<hr>
	<p><u><em><b>Form di acquinsto</b></em></u></p>
	
	<form>
	<table width=600px>
		<tr>
			<td>Merce di interesse</td>
			<td><input name="Frutta" type="checkbox">Frutta</td>
			<td><input name="Elettronica" type="checkbox">Elettronica</td>
			<td><input name="Casa" type="checkbox">Casa</td>
		</tr>
		<tr>
			<td>Sconto</td>
			<td><input type="radio" name="sconto">10% sul totale</td>
			<td><input type="radio" name="sconto">50£ sulla frutta</td>
		</tr>
		<tr>
			<td>Nome cliente</td>
			<td><input type="text" name="NomeCliente" size="20" maxlength="5"></td>
		</tr>
		<tr>
			<td>Numero carta</td>
			<td><input type="password" name="NomeCliente" size="20" maxlength="16"></td>
		</tr>
		<tr>
			<td>Continente</td>
			<td><select name="Continente" size="1">
				<option>Africa</option>
				<option>America</option>
				<option>Asia</option>
				<option>Europa</option>
				<option>Oceania</option>
			</select></td>
		</tr>
		<tr>
			<td>Provenienza accettata</td>
			<td><select multiple="true" name="Provenienza" size="3">
				<option>Francia</option>
				<option>Germania</option>
				<option>Italia</option>
				<option>Spagna</option>
				<option>Svezia</option>
			</select></td>
		</tr>
		<tr>
			<td>&ugrave;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>
				<input name="Acquista" type="submit" value="Acquista">
				<input name="Reset" type="reset" value="Reset">
			</td>
		</tr>
	
	</table>
	</form>
	
	<p>Per maggiori informazioni utilizzare <a href="http://www.google.com">Google</a> oppure si pu&ograve; 
		rileggere questa guida ricominciando <a href="#InizioDocumento">a capo</a>
	
	</body>
	
</html>