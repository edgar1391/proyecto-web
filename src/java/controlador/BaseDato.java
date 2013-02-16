/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.ConectarBaseDato;
import controlador.Enviar;
/**
 *
 * @author edgar
 */
public class BaseDato extends HttpServlet {

   

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=null;     
        ConectarBaseDato dato= ConectarBaseDato.getInstance();
        Enviar env=new Enviar();
        
 dato.setQuery(request.getParameter("nombre"), request.getParameter("direccion"), request.getParameter("telefono"), request.getParameter("email"));
     request.setAttribute("consultas", dato.getQuery());
     
     env.mensaje(request.getParameter("nombre"), request.getParameter("email"));
     env.conectarServidor();
   request.getRequestDispatcher("salida.jsp").forward(request, response);     
        
}

       
    
  
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
