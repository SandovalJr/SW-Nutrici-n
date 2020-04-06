<%-- 
    Document   : editar_exp
    Created on : 7/07/2019, 02:07:37 PM
    Author     : 52449
--%>


<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<%

    String nombrep = request.getParameter("nombrep");

    System.out.println(nombrep);

    String user_name = (String) session.getAttribute("user_name");%>


<%
    if (session.getAttribute("user_name") != null
            && !session.getAttribute("user_name").equals("")) {

    } else {
        response.sendRedirect("/software_nutricion/inicio.jsp");
    }
%>
<html >
    <head>

 <script src="js/sweetalert.min.js"> </script>
 <link href="css/sweetalert.css" rel="stylesheet" type="text/css">

        <meta charset='utf-8'>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="styles.css">
        <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
        <script src="script.js"></script>



        <title>Registrar Expediente</title>

    <div style="position: fixed; rigth: 75%"><img src="software_nutricion/Login_v5/images/icons/logo_nutricion.png" width="250" height="250" alt=""/></div>


</head>
<div style="float:right" >
    <%=user_name%>
</div>
<body background="imagenes2.jpg">

    <div id='cssmenu'>
        <li><a  style="float:right" href="logout"> <img src="cerrar.png"> </a></li>
    </div>

    <div id='cssmenu'>
        <ul>
            <li><a href='http://localhost:8080/software_nutricion/Menu.jsp'><img src="casa.png"></a></li>
            <li class='active has-sub'><a href='#'><span>Recetas</span></a>
                <ul>
                    <li><a href='http://localhost:8080/software_nutricion/desayuno.jsp'><span>Desayuno</span></a></li>
                    <li><a href='http://localhost:8080/software_nutricion/comida.jsp'><span>Comida</span></a></li>
                    <li><a href='http://localhost:8080/software_nutricion/cena.jsp'><span>Cena</span></a></li>
                    <li><a href='http://localhost:8080/software_nutricion/colaciones.jsp'><span>Colación</span></a></li>  
                    <li><a href='http://localhost:8080/software_nutricion/Bebidas.jsp'><span>Bebidas</span></a></li>  

                    <a href="recetas_registro.jsp" > <img src="mas.png">  </a>
                </ul>
            </li>
           <li class='active has-sub'><a href='#'><span>Expedientes</span></a>
      <ul>
         
        <li><a href='http://localhost:8080/software_nutricion/registro.jsp'><span>Añadir</span></a></li>
        
             <li><a href='http://localhost:8080/software_nutricion/eliminarR.jsp'><span>Eliminar</span></a></li>
		   <li><a href='http://localhost:8080/software_nutricion/Buscar_Expediente.jsp'><span>Buscar</span></a></li>
      </ul>
   </li> 
            <li><a href='http://localhost:8080/software_nutricion/dietas.jsp'><span>Dietas</span></a></li>
                        <li><a href='http://localhost:8080/software_nutricion/metas_registro.jsp'><span>Metas</span></a></li>

	 <li><a href='http://localhost:8080/software_nutricion/Mensajes_Menu.jsp'><span>Mensajes</span></a></li>

        </ul>
    </div>

</body>

<%
    //Conexcion a la base de datos
    Connection conexion;

    String Driver = "org.postgresql.Driver";

    Class.forName(Driver);
    conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion", "postgres", "sandoval123");
    if (!conexion.isClosed()) {
        System.out.println("Conexion exitosa a la base de datos");
    }

    //Empezamos listado los datos de la tabla usuario
    PreparedStatement nom;
    ResultSet nombre;
    nom = conexion.prepareStatement("SELECT nombre_apellido as nombrep,edad,escolaridad,civil,ocupacion,motivo_consulta,antecedentes_heredados,medicamentos,tabaco,alcohol,drogas,enfermedadesapp,alergias_alimentariosapp,alimentos_desagradablesapp,user_name,password,id FROM software_nutricion.\"Pacientes_Expediente\" WHERE nombre_apellido='" + nombrep + "'");

    nombre = nom.executeQuery();
    while (nombre.next()) {

%>


 <center>
        <div class="addthis_toolbox addthis_32x32_style addthis_default_style" >   
            <table border="0">
                <br>
                <br>
                <tr>
                    <th>Nombre Completo :</th>
                    <th><input type="text" name="nombrep" readonly=""  value = "<%=nombre.getString("nombrep")%>" size="40"></th>
                    <td>Consumes Alcohol: 
                     <td ><select style="font-size:15px" name="alcohol">
                            <option><%=nombre.getString("alcohol")%></option>
                            <option></option>
                            <option>si</option>
                            <option>no</option>
                    
                    </td>

                </tr>
                <tbody>

                    <tr>
                        <td>Edad:</td>
                        <td> <input type="text" name="edad" readonly="" value = "<%=nombre.getString("edad")%>" size="40"></td>
                        <td>Consumes Tabaco:   <td ><select style="font-size:15px" name="tabaco">
                            <option><%=nombre.getString("tabaco")%></option>
                            <option></option>
                            <option>si</option>
                            <option>no</option>
                    
                    </td>
                    </tr>
                    <tr>
                        <td>Escolaridad:</td>
                        <td> <input type="text" name="escolaridad"  readonly="" value = "<%=nombre.getString("escolaridad")%>" size="40"></td>
                        <td>Consumes Drogas:  <td ><select style="font-size:15px" name="drogas">
                            <option><%=nombre.getString("drogas")%></option>
                            <option></option>
                            <option>si</option>
                            <option>no</option>
                    
                    </td>
                    </tr>
                    <tr>
                        <td>Estado Civil:</td>
                        <td><input type="text" name="civil" readonly=""  value = "<%=nombre.getString("civil")%>" size="40"></td> 
                        <td>Enfermedades(APP):</td>
                        <td> <input type="text" name="enfermedadesapp" readonly=""  value = "<%=nombre.getString("enfermedadesapp")%>" size="30"></td>
                    </tr>
                    <tr>
                        <td>Motivo de la consulta:</td>
                        <td><input type="text" name="motivo_consulta" readonly=""  value = "<%=nombre.getString("motivo_consulta")%>" size="40"></td>
                        <td>Algun alimento desagradable:</td>
          <th>  <textarea style="font-size:15px" rows="5" cols="26" type="text" readonly=""  name="alimentos_desagradablesapp" ><%=nombre.getString("alimentos_desagradablesapp")%></textarea></th>

                    </tr>
                    <tr>
                        <td>Ocupacion:</td>
                        <td><input type="text" name="ocupacion" readonly=""  value = "<%=nombre.getString("ocupacion")%>" size="40"></td>
                        <td>Alguna alergia alimentaria:(APP)</td>
                        <td><input type="text" name="alergias_alimentariosapp" readonly=""  value = "<%=nombre.getString("alergias_alimentariosapp")%>" size="30"></td>
                    </tr>
                <td>¿Tomas medicamentos?¿Cuales?:</td>
                <td><input type="text" name="medicamentos" readonly=""  value = "<%=nombre.getString("medicamentos")%>" size="40"></td>
                <td>Usuario:</td>
                <td><input type="text" name="user_name" readonly=""  value = "<%=nombre.getString("user_name")%>" size="30"></td> 
                <tr>

                    <td>Antecedentes heredados:</td>
                    <td><input type="text" readonly=""  name="antecedentes_heredados" value = "<%=nombre.getString("antecedentes_heredados")%>" size="40"></td>

                    <td>Contraseña:</td>
                    <td><input type="text" name="password" value = "<%=nombre.getString("password")%>" size="30"></td>
                </tr>


                </tbody>
                <% } %>
            </table>
        </div>

        <br>
        <br>
        
        <center>
         
            
   </center>
<script>
    swal({
  title: "Los cambios que generes no quedaran guardados",
  text: "Presiona el boton para continuar",
  imageUrl:"aviso.png",
  button: "OK",
});
 </script>


        <div>
</html>
