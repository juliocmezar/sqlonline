
package pruebasql;

import java.sql.*;

public class CConexion {
   String usuario="root";
   String contrasena="root";
   String url="jdbc:mysql://localhost:3306/";
   
   
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
