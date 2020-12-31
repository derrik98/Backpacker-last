<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="org.json.JSONException"%>
<%@ page import="controller.JSONNotFound"%>
<%@ page isErrorPage="true" %>
<%@ page errorPage = "ShowError.jsp" %>
<jsp:useBean id="interfaceBean" scope="session" class="controller.InterfaceBean"/>

<html>
   <head>
      <title>Error Handling Example</title>
   </head>
   
   <body>
      <%
         // Throw an exception to invoke the error page
         try{
        	interfaceBean.validate();
         }
      catch(JSONNotFound j){
    	  j.getMessage();
      }
         int x = 1;
         
         if (x == 1) {
            throw new JSONNotFound("Error condition!!!");
         }
      %>
   </body>
</html>