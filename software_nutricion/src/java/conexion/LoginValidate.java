/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.*;

import javax.servlet.http.HttpSession;


/**
 *
 * @author 52449
 */


// polimorfismo
public class LoginValidate extends HttpServlet {

   
  
Connection conexion= null;
    
//herencia
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String user_name = request.getParameter("user_name");
      String password = request.getParameter("password");
        System.out.println(user_name);
      String user_name1 = "";
      
      
        System.out.println(user_name);
        System.out.println(password);
      
      if (!request.getParameter("user_name").equals("admin")){
          user_name1 = request.getParameter("user_name");
       System.out.println("+++++uno" + user_name1);
      }else{
            user_name1 = request.getParameter("user_name");
             System.out.println("+++++uno" + user_name1);
      }
      if (ValidateUserLogin(user_name1,password)){
          HttpSession session = request.getSession(true);
          session.setAttribute("user_name",user_name1);
           
      
      if(user_name1.equals("admin")){
          response.sendRedirect("Menu.jsp");
      }else{
          response.sendRedirect("MenuPlegable.jsp");
      }
      }
      else{
          request.setAttribute("msg","Usuario o contraseña incorrecta ");
          //mandar a la direccion el texto(mandar cadenas de texto)
          request.getRequestDispatcher("/inicio.jsp").forward(request,response);
      }
      
    }
    
    // ESTO ES PARA CREAR LA CONSULTA 
    
    
    public boolean ValidateUserLogin(String user_name1 , String password){
        boolean flag = false;
        Connection connection = null;
       try{
            connection = createConnection();
            if(connection != null){
                Statement stat = connection.createStatement();
                String qry = "SELECT * FROM software_nutricion.\"Pacientes_Expediente\" WHERE user_name = '" + user_name1 + "' AND password = '" + password + "'";
                ResultSet resultado = stat.executeQuery(qry);
                if (resultado.next()){
                    flag= true;
                }}
            else {
                    System.out.println("No se puedo establecer conexion a la base de datos");
                }
        
    }
        catch (Exception e){
            System.out.println("Error en la consulta");
            e.printStackTrace();
        } finally {
            if(connection !=null){
                try {
                    connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return flag;
            }
    
    
    
public Connection createConnection() {
        System.out.println("Createung postgres DataBase Connection");
        Connection connection = null;

        try {

            // Provide database Driver according to your database
            Class.forName("org.postgresql.Driver");

            // Provide URL, database and credentials according to your database 
       connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");

        } catch (Exception e) {
            System.out.println(" Error en los parametros de conexión");
            e.printStackTrace();
            return null;
        }
        if (connection != null) {
            System.out.println("Connection created successfully....");
        }
        return connection;
    }
    
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}