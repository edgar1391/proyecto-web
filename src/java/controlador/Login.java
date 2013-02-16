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
/**
 *
 * @author edgar
 */
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
       ConectarBaseDato dato= ConectarBaseDato.getInstance();
       
        dato.setLogin(request.getParameter("nombre"), request.getParameter("contrasena"));
        
        if(dato.getLogin() > 0){
            HttpSession sesion = request.getSession();
            
            sesion.setAttribute("nombre", request.getParameter("nombre"));
            
           request.getRequestDispatcher("formulario.jsp").forward(request, response);
            
        }
        else{
            
        }
    }

   
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
