<%-- 
    Document   : index
    Created on : 04-feb-2013, 22:10:06
    Author     : edgar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<meta http-equiv="Content-Language" content="en-us" />
	<meta name="robots" content="all" />
	<meta name="author" content="Luka Cvrk (www.solucija.com)" />
	<meta name="Copyright" content="" />
	<meta name="description" content="" /> 
	 
	<link href="images/style.css" rel="stylesheet" type="text/css" />  
	<title>Systema de registro con tablas</title>
</head>
<body> 
        <div id="wrap">
        <div id="container"> 
	<div id="header">
	<p>Systema de <span class="red">Registro por E-mail</span>!</p>
	</div>
    	   <div id="hmenu"></div>
    	<div id="left_column"> 
        <p>Registrese al sistema y de inmediato recibira una notificacion por correro </p>
               <!--  <p><a href="bd">Consulta base de registro</a></p> -->
	</div> 
			
			<div id="right_column">
				<div class="main_article">
    	   <h3><span>Login: </span></h3> 
           		
              <form action="login" method="post">
                  <b>Usuario: </b><input type="text" name="usuario" value="" size=20 />
                  <br>
                  <b>Contrasena: </b><input type="password" name="contrasena" value="" size=20 />
                  <br>
                  <input type="submit" value="entrar" name="entrar" />
                  
              </form> 
   
           
           
             
</body>
</html>