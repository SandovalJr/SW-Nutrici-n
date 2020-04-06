<%-- 
    Document   : eliminarR
    Created on : 9/06/2019, 04:34:46 PM
    Author     : 52449
--%>

<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<%
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
    <script src="js/BuscadorTabla.js" type="text/javascript"></script>
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
        PreparedStatement ps;
        ResultSet rs;
        ps=conexion.prepareStatement("SELECT nombre_apellido as nombrep,edad,escolaridad,civil,ocupacion,motivo_consulta,antecedentes_heredados,medicamentos,tabaco,alcohol,drogas,enfermedadesapp,alergias_alimentariosapp,alimentos_desagradablesapp,user_name,password,id FROM software_nutricion.\"Pacientes_Expediente\""); 
        rs=ps.executeQuery();
    %>
    <br>
    
    <div class="container tabla">
        
        <div style="position: absolute; left: 1%">
            
          <div class="d-flex">  
              
                  <div class="card col-lg-15">
           <h3>Buscar por ID:</h3>
    <input id="searchTerm" type="text" onkeyup="doSearch()" />
               
    <table  class="table table-hover" id="datos" >        
        <thead>
                    <tr>
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
                                         <th style="background-color:#FFFF00">ID</th>

                    </tr>
        </thead>
                    
                    <% 
                    while(rs.next()){
                    %>
                    <tr>

                        <th class="text-center"><%=rs.getString("nombrep")%></th>
                        <th class="text-center"><%=rs.getString("edad")%></th>
                        <th class="text-center"><%=rs.getString("escolaridad")%></th>
                        <th class="text-center"><%=rs.getString("civil")%></th>
                        <th class="text-center"><%=rs.getString("ocupacion")%></th>
                        <th class="text-center"><%=rs.getString("motivo_consulta")%></th>
                        <th class="text-center"><%=rs.getString("antecedentes_heredados")%></th>
                        <th class="text-center"><%=rs.getString("medicamentos")%></th>
                        <th class="text-center"><%=rs.getString("tabaco")%></th>
                        <th class="text-center"><%=rs.getString("alcohol")%></th>
                        <th class="text-center"><%=rs.getString("drogas")%></th>
                        <th class="text-center"><%=rs.getString("enfermedadesapp")%></th>
                        <th class="text-center"><%=rs.getString("alergias_alimentariosapp")%></th>
                        <th class="text-center"><%=rs.getString("alimentos_desagradablesapp")%></th>
                        <th class="text-center"><%=rs.getString("user_name")%></th>
                        <th class="text-center"><%=rs.getString("password")%></th>
                        <th class="text-center"><%=rs.getInt("id")%></th>

                        <td>

    <a href="eliminar.jsp?id=<%=rs.getInt("id")%>"><img src="boton-x.png"></a>
    <a href="editar_exp.jsp?nombrep=<%=rs.getString("nombrep")%>"><img src="editar2.png"></a>
    <a href="ver_expediente.jsp?nombrep=<%=rs.getString("nombrep")%>"><img src="ojo.png"></a>


                        </td>
                    </tr>
                    <%}%>
                
            </table>            
             </div>              </div>

    </div>
                  <br>  
                   <br>  
                    <br>  
                    <br> 
                    <br>  
                   <br>  
                    <br>  
                    <br>  
                    <br>  
                   <br>  
                    <br>  
                    <br>  <br>  
                   <br>  
                    <br>  
                    <br>  
                    <br><br>  
                    <br>    
                    <br>  
                    
                    <center>
    <div class="addthis_toolbox addthis_32x32_style addthis_default_style"><img src="corazon.png" width="400" height="400" alt=""/></div>
</center>
   
</html>
