/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataSource;

/**
 *
 * @author 52449
 */
// POLIMORFISMO
public class ConexionJDBC {

    public static DataSource JDBCConexion;
    Connection conexion=null;
    String driverDb="org.postgresql.Driver";
    public Connection conectar() throws SQLException, ClassNotFoundException{
        try{
        Class.forName(driverDb);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos");
        }
        return conexion;
        } catch (ClassNotFoundException | SQLException ex){
        Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
        return null;
        }
    
    }
  public Connection getConexion() {
    return conexion;
}
}
