<%-- 
    Document   : Editar_expediente_1
    Created on : 7/07/2019, 02:05:27 PM
    Author     : 52449
--%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<%
String nombrep= request.getParameter("nombrep");
        
           System.out.println(nombrep);
    String user_name=(String) session.getAttribute("user_name");%>

  
    <%
        if(session.getAttribute("user_name") !=null
                && !session.getAttribute("user_name").equals("")){
        
    }   else {
            response.sendRedirect("/software_nutricion/inicio.jsp");
            }
%>

<html lang=''>
<head>
  
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>



    
    
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
   <link rel="stylesheet" href="styles.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script src="script.js"></script>
   <title>CSS MenuMaker</title> <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>


<body  background="fondo_verde.jpg" >
     
       <div style="float:right" >
           <h4>  <%=user_name%> </h4>
  </div>
    
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
        
        String Driver="org.postgresql.Driver";
       
        Class.forName(Driver);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos");
        }
        
        //Empezamos listado los datos de la tabla usuario
        PreparedStatement com;
        ResultSet comida;
    com = conexion.prepareStatement("SELECT nombre_apellido as nombrep,edad,escolaridad,civil,ocupacion,motivo_consulta,antecedentes_heredados,medicamentos,tabaco,alcohol,drogas,enfermedadesapp,alergias_alimentariosapp,alimentos_desagradablesapp,user_name,password,id FROM software_nutricion.\"Pacientes_Expediente\" WHERE nombre_apellido='" + nombrep + "'");
        
        comida=com.executeQuery();
    %>
    <br>
    <form action="update_expediente_1" method="POST">

                 <div style="position: absolute; left: 3%" >

    <center>
        <div class="addthis_toolbox addthis_32x32_style addthis_default_style"><b><h1>EDITAR EXPEDIENTE</h1></b></div>

   
    <div class="container tabla">
          <div class="d-flex">  
                  <div class="card col-lg-15">
                      
    <table   class="table table-bordered" >        
           
                    <tr>
                                                <th style="background-color:#FFFF00">id</th>

                        <th style="background-color:#FFFF00">nombre_apellido</th>
                 <th style="background-color:#FFFF00">edad</th>
                 <th style="background-color:#FFFF00">escolaridad</th>
                 <th style="background-color:#FFFF00">civil</th>
                 <th style="background-color:#FFFF00">ocupacion</th>
                 <th style="background-color:#FFFF00">motivo_consulta</th>
                 <th style="background-color:#FFFF00">antecedentes_heredados</th>
                 <th style="background-color:#FFFF00">medicamentos</th>
                 <th style="background-color:#FFFF00">tabaco</th>
                 <th style="background-color:#FFFF00">alcohol</th>
                 <th style="background-color:#FFFF00">drogas</th>
                 <th style="background-color:#FFFF00">enfermedadesapp</th>
                 <th style="background-color:#FFFF00">alergias_alimentariosapp</th>
                <th style="background-color:#FFFF00">alimentos_desgradables</th>

                 <th style="background-color:#FFFF00">user_name</th>
                 <th style="background-color:#FFFF00">password</th>

                    </tr>
                    
                

                    <% 
                    while(comida.next()){
                    %>
                    
                    <tr >

                        <th class="text-center"><h3><%=comida.getInt("id") %></h3></th>
               <th> <input style="font-size:15px" type="text"  name="nombrep" value = "<%=comida.getString("nombrep")%>" size="20" ></th>
                                 <td> <input type="text" name="edad" value = "<%=comida.getString("edad")%>" size="40"></td>
                        <td> <input type="text" name="escolaridad" value = "<%=comida.getString("escolaridad")%>" size="40"></td>
                        <td><input type="text" name="civil" value = "<%=comida.getString("civil")%>" size="40"></td> 
                        <td><input type="text" name="ocupacion" value = "<%=comida.getString("ocupacion")%>" size="40"></td>
     <td><input type="text" name="motivo_consulta" value = "<%=comida.getString("motivo_consulta")%>" size="40"></td>
                    <td><input type="text" name="antecedentes_heredados" value = "<%=comida.getString("antecedentes_heredados")%>" size="40"></td>

                               <td><input type="text" name="medicamentos" value = "<%=comida.getString("medicamentos")%>" size="40"></td>
<td ><select style="font-size:15px" name="tabaco">
        <option><%=comida.getString("tabaco")%></option>
        <option></option>
        <option>si</option>
        <option>no</option>

</td>
<td ><select style="font-size:15px" name="alcohol">
        <option><%=comida.getString("alcohol")%></option>
        <option></option>
        <option>si</option>
        <option>no</option>

</td>
<td ><select style="font-size:15px" name="drogas">
        <option><%=comida.getString("drogas")%></option>
        <option></option>
        <option>si</option>
        <option>no</option>

</td>
<td> <input type="text" name="enfermedadesapp" value = "<%=comida.getString("enfermedadesapp")%>" size="30"></td>
                        <td><input type="text" name="alergias_alimentariosapp" value = "<%=comida.getString("alergias_alimentariosapp")%>" size="30"></td>
          <th>  <textarea style="font-size:15px" rows="5" cols="26" type="text"  name="alimentos_desagradablesapp" ><%=comida.getString("alimentos_desagradablesapp")%></textarea></th>

                        
                                        <td><input type="text" name="user_name" value = "<%=comida.getString("user_name")%>" size="30"></td> 

                                            <td><input type="text" name="password" value = "<%=comida.getString("password")%>" size="30"></td>

<td>

   
  </td>
                    </tr>
                    <%}%>
                </center>
            </table> 
             </div>
    </div></div></div></div>
    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
         <div style="position: absolute; left: 81%" >
                <button style='width:150px; height:155px' class="login100-form-btn"> <img src="actualizar.png"> <b>Actualizar</b></button>
            </div>
</form>
</html>