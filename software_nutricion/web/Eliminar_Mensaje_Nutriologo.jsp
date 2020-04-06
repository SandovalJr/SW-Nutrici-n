<%-- 
    Document   : eliminar_dieta
    Created on : 5/07/2019, 02:02:22 PM
    Author     : 52449
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
     
    
  Connection conexion;
        
        String Driver="org.postgresql.Driver";
       
        Class.forName(Driver);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos de eliminar");
        }
       PreparedStatement dieta;
        int id=Integer.parseInt(request.getParameter("id"));
   dieta=conexion.prepareStatement("DELETE FROM software_nutricion.\"Mensajes\" WHERE id="+id);
       dieta.executeUpdate();
        response.sendRedirect("Mensaje_Eliminado_Con_Exito.jsp");




        %>
    </body>
    
</html>