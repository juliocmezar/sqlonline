
package pruebasql;

import java.sql.*;

public class CCrud {
    
    Connection con;
    
     public CCrud(Connection con){
         this.con = con;
     }
     
     public void consultar(){         
      String query = "use libreria;";
      if(query.contains("use ")){
         try{
         PreparedStatement ps=con.prepareStatement(query);
         int use = ps.executeUpdate();
         }catch (SQLException ex){
             
         }
      }
      try{  
          query = "select * from clientes;";
          PreparedStatement ps=con.prepareStatement(query);
          ResultSet rs = ps.executeQuery();
          ResultSetMetaData metaData = rs.getMetaData();
          int numeroColumnas = metaData.getColumnCount();
          for (int i = 1; i <= numeroColumnas; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
          System.out.println();
          while(rs.next()){
            //System.out.println("ID: "+rs.getInt("id")+"   nombre: "+rs.getString("nombre")+"   apellido: "+rs.getString("apellido")+"   Fecha de nacimiento: "+rs.getString("fechan"));
            for (int i = 1; i <= numeroColumnas; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
          }
          System.out.println("Consulta correcta");
       }catch (SQLException ex){
          System.out.println("Error en el sql");
          ex.printStackTrace();
       }
   } 
}
