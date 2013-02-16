/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author edgar
 */
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConectarBaseDato {
    
    private final static ConectarBaseDato instancia=new ConectarBaseDato();
    private Connection cox;
    private Statement query;
    private int validez=0;
    private ArrayList listaNom,listaDirec,listaTele,listaEmail=new ArrayList();
    private ResultSet res;
    ConectarBaseDato(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cox = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro","root","fcld761");
            query= cox.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ConectarBaseDato.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectarBaseDato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static ConectarBaseDato getInstance(){
        return instancia;
    }
    
    
    public void setLogin(String usuario,String password){
        try {
            res = query.executeQuery("select *from login");
            while(res.next()){
          if(usuario.equals(res.getString("usuario")) && password.equals(res.getString("password"))){
                     validez++;  //se incrementa cuando coincide un usuario
           }
          else{
                     validez=0; //se mantiene en cero cuando ninguno de conincide con un usuario
            }
          }
        } catch (SQLException ex) {
            Logger.getLogger(ConectarBaseDato.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    public int getLogin(){
       if(validez > 0){
           return 1;
       }
       else {
           return 0;
       }
    }
    
    
    
    
    public void setQuery(String nombre, String direccion, String telefono, String email){
        try {
           
 query.executeUpdate("INSERT INTO Usuarios(nombre,direccion,telefono,email)VALUES('"+nombre+"','"+direccion+"','"+telefono+"','"+email+"'");
        } catch (SQLException ex) {
            Logger.getLogger(ConectarBaseDato.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    public Object getQuery(){
        PrintWriter out=null;
        try {
            res = query.executeQuery("select *from usuarios"); 
            
            while(res.next()){
              out.println("<tr>");
              out.println("<td>"+ res.getString("nombre")+"</td>");
              out.println("<td>"+ res.getString("direccion")+"</td>");
              out.println("<td>"+ res.getString("telefono")+"</td>");
              out.println("<td>"+ res.getString("email")+"</td>");
              out.println("</tr>");
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(ConectarBaseDato.class.getName()).log(Level.SEVERE, null, ex);
        }
        return out;
    }
    
    
    
    
    
    
    
}
