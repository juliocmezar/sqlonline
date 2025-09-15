
package pruebasql;

import java.sql.*;

public class CConexion {
   String usuario="programacion";
   String contrasena="#3Programacion3";
   String url="jdbc:mysql://72.167.84.254/";
   
   
   public Connection conectar(){
       Connection con=null;
       try{         
          con= DriverManager.getConnection(url,usuario,contrasena);
          System.out.println("conexion correcta");
       }catch (Exception e){
          System.out.println(e.toString());
       }
       return con;
       
   }
   
  
   
}
