<%-- 
    Document   : index
    Created on : 7/06/2019, 12:24:38 PM
    Author     : 52449
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>REGISTRO</h1>
        <form action="alta" method="POST">
            <br>
           Nombre del usuario: <input type="text" name="user_name" value="" />
            <br>
            Contraseña: <input type="password" name="password" value="" />
            <br>
            <input type="submit" value="Grabar" />
            
        </form>
    </body>
</html>
