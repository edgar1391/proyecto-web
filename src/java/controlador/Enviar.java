package controlador;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Enviar {
    
   
    private Properties propiedades= null;
    private Session session= null;
    private  MimeMessage mensaje=null;
    
   public Enviar(){
         propiedades=new Properties();
       
       propiedades.put("mail.smtp.host", "smtp.gmail.com");  
       propiedades.put("mail.smtp.starttls.enable", "true"); 
       propiedades.put("mail.smtp.port", 587);               
       propiedades.put("mail.smtp.mail.sender", "edgar1391@gmail.com"); 
       propiedades.put("mail.smtp.user", "edgar1391");  
       propiedades.put("mail.smtp.auth", "true");
       
       session= Session.getDefaultInstance(propiedades);
   }
   
   public void mensaje(String nombre,String mail){
        try {
            mensaje=new MimeMessage(session);   
            mensaje.setFrom(new InternetAddress((String)propiedades.get("mail.smtp.mail.sender")));  
            
            
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(mail));
           
           mensaje.setSubject("mensaje de bienvenida");
           
           mensaje.setText("hola " + nombre + " bienvenido al nuevo sitio web");
        } catch (MessagingException ex) {
            Logger.getLogger(Enviar.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   public void conectarServidor(){
       
        try {
            Transport transp= session.getTransport("smtp");
           
            
             transp.connect((String)propiedades.get("mail.smtp.user"), "fcld7610612"); 
            
            transp.sendMessage(mensaje, mensaje.getAllRecipients());
            
            transp.close();
        }  catch (MessagingException ex) {
             //  Logger.getLogger(controlador.BaseDato.class.getName()).log(Level.SEVERE, null, ex);
           }
      
       
   }
    
    
}