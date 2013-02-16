<%-- 
    Document   : salida
    Created on : 14-feb-2013, 18:59:27
    Author     : edgar
--%>



<%@page import=""%>
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<meta http-equiv="Content-Language" content="en-us" />
	<meta name="robots" content="all" />
	<meta name="author" content="Luka Cvrk (www.solucija.com)" />
	<meta name="Copyright" content="" />
	<meta name="description" content="" /> 
	 
	<link href="images/style.css" rel="stylesheet" type="text/css" />  
	<title>Tabla de registros</title>
</head>
<body> 
        <div id="wrap">
        <div id="container"> 
	<div id="header">
	<p>Systema de <span class="red">Registro por E-mail</span>!</p>
	</div>
    	   <div id="hmenu"></div>
    	<div id="left_column"> 
        <p>Todos los registros guardados </p>
               <!--  <p><a href="bd">Consulta base de registro</a></p> -->
	</div> <div id="right_column"><div class="main_article">
              <table border="1">
               <tr>
               <td>Nombre </td>
               <td>Direccion </td>
               <td>Telefono </td>
               <td>Email </td>
               </tr>
                  <%
                       request.getAttribute("consultas");
                       
                  %>                                                                                    
              </table>
             
</body>
</html>