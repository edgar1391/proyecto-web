<%-- 
    Document   : formulario
    Created on : 14-feb-2013, 18:20:57
    Author     : edgar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



<%@page session='true' %>

   <%
     //obtiene la session y al mismo tiempo la compara si no tiene valor
   if(request.getSession().getAttribute("usuario") == null){
       
   
   %> 
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	
	<link href="images/style.css" rel="stylesheet" type="text/css" />  
	<title>Systema de registro con tablas</title>
</head>
<body> 
	<div id="wrap">
       <div id="container"> 
	<div id="header">
	<p>Systema de <span class="red">Registro por E-mail</span>!</p>
	</div>
    	
	    <div id="hmenu">     	
	    		
    	      </div>
    	
      		<div id="left_column"> 
                    <p>Registrese al sistema y de inmediato recibira una notificacion por correro </p>
               <!--  <p><a href="bd">Consulta base de registro</a></p> -->
		</div> 
			
			<div id="right_column">
				<div class="main_article">
    	   <h3><span>Complete los campos a continuacion</span></h3> 
      				
              <form action="bd" method="post">
               
                <b>Nombre Completo: <br></b>
                      <input type="text" name="nombre"/>
                <br>
                <b>Direccion: <br></b>
                     <input type="text" name="direccion" />
                <br>
                <b>Telefono :<br></b>
                     <input type="text" name="telefono"/>
                <br>
                <b>Email <br></b>
                     <input type="email" name="email"/>
                <br>
                <br>
                     <input type="reset" value="Limpiar" name="btnLimpiar" />
                <br>
                <br>
                <br>
                    <input type="submit" value="Guardar y Registrarse" name="btnGuardar" />
                
              </form>                                        
      
</body>
</html>
 
<%
}
   else{
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
       
   }

%>