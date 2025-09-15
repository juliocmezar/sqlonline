
package pruebasql;
import java.sql.*;
import java.util.Scanner;

public class Pruebasql {

   
    public static void main(String[] args) {
     
        CConexion conexion = new CConexion();
        Connection con= conexion.conectar();
        CCrud crud = new CCrud(con);
        crud.consultar();
        
    }
    
}
