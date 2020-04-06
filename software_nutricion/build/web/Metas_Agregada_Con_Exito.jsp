<%-- 
    Document   : dietas
    Created on : 29/06/2019, 10:51:10 PM
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
    <script src="js/sweetalert.min.js"> </script>
 <link href="css/sweetalert.css" rel="stylesheet" type="text/css">

    
    
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
  

      <div style="position: fixed; left: 2%"><img src="software_nutricion/Login_v5/images/icons/logo_nutricion.png" width="300" height="300" alt=""/></div>

</head>


<body  background="fondo_verde.jpg" >
  <div style="float:right" >
      <h3><%=user_name%></h3>
  </div>
  
  
  <div id='cssmenu'>
      <li><a  style="float:right" href="logout"> <img src="cerrar.png" alt =""> </a></li>
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

<script>
    swal({
  title: " Metas Registradas Con Exito",
  text: "Presiona el boton para continuar",
  imageUrl:"comprobado.png",
  button: "OK",
});
 </script>



<% 
    //Conexcion a la base de datos
        Connection conexion;
        
        String Driver="org.postgresql.Driver";
       
        Class.forName(Driver);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos de agregar dieta");
        }
        
        //Empezamos listado los datos de la tabla usuario
        PreparedStatement ps;
        ResultSet rs;
        ps=conexion.prepareStatement("SELECT nombre_apellido,edad,escolaridad,civil,ocupacion,motivo_consulta,antecedentes_heredados,medicamentos,tabaco,alcohol,drogas,enfermedadesapp,alergias_alimentariosapp,alimentos_desagradablesapp,user_name as user,password,id FROM software_nutricion.\"Pacientes_Expediente\" WHERE user_name != 'admin'"); 
        rs=ps.executeQuery();
        
    %>
    <br>
    

    
    <br> <br>
    <div class="container tabla">
        <div style="position: absolute; left: 27%">
                    <div class="addthis_toolbox addthis_32x32_style addthis_default_style"><b><h1>Agregar Meta </h1></b></div>
            <div class="d-flex"> 
                  <div class="card col-lg-15">
                      
    <table class="display sando" class="table table-hover">  
      
        <thead>
         <tr>
         
             <th style="background-color:#FFFF00">
              
                 <h3>  User Name  </h3></th> 
                    

             <th style="background-color:#FFFF00">  </th></tr>
        </thead>
         
                    <% 
                    while(rs.next()){
                    %>
                    <tr>
                        <th class="text-center"><h4><%=rs.getString("user")%></h4></th>
                       
                    <td>
                       
                        <a href="metas_formulario.jsp?user=<%=rs.getString("user")%>&user_name=<%=user_name%>"> <img src="mas.png">  </a> 

                         <!-- FALTA PONER EDITAR A FUNCIONAR -->


                        </td>
                    </tr>
                    <%}%>
                
            </table>
                    
                 
                    
             </div>  </div>
    </div>
                <%    
                       PreparedStatement dieta;
        ResultSet d;
    dieta=conexion.prepareStatement("SELECT id,user_name as user,meta1,descripcion1,meta2,descripcion2,meta3,descripcion3 FROM software_nutricion.\"Metas\" WHERE user_name != 'admin'"); 
        d=dieta.executeQuery();
        
    %>
       
    <div class="container tabla">
        <div style="position: absolute; left: 55%">
                <div class="addthis_toolbox addthis_32x32_style addthis_default_style"><b><h1>Pacientes Con Metas </h1></b></div>

            <div class="d-flex"> 
                  <div class="card col-lg-15">
                      
    <table class="display sando" class="table table-hover">  
        <thead >
         <tr>
         
             <th style="background-color:#FFFF00">
              
                 <h3>  User Name  </h3></th> 
                    

             <th style="background-color:#FFFF00"> 
             
             </th></tr>
        </thead>
         
                    <% 
                    while(d.next()){
                    %>
                    <%=d.getString("id")%>
                    <tr>
                        <th class="text-center"><h4><%=d.getString("user")%></h4></th>

                    <td >
                       
                      <a href="Eliminar_Metas.jsp?id=<%=d.getInt("id")%>&user_name=<%=user_name%>" >  <img src="boton-x.png">  </a>
                        <a href="Metas_Actualizar.jsp?user=<%=d.getString("user")%>&user_name=<%=user_name%>"> <img src="editar2.png"> </a>
                        <a href="ver_metas.jsp?user=<%=d.getString("user")%>&user_name=<%=user_name%>"> <img src="ojo.png"> </a>


                    </td>
                    </tr>
                    <%}
                    
                    %>
                
            </table>
                    
                 
                    
             </div>  </div>
    </div>
                    
                    
                    <br><br>
                    <br><br>
                    <br><br>
                    <br>                      <br> 
                   <br>  <br>

                    <br> <br>
                     <br> <br>
                    <br> <br>
                    <br> <br>
                    <br>
                    <br>
              
                    
                        </div>
    </script>
</html>
 <link href="css/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
    <script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
    <script src="js/jquery.dataTables.min.js" type="text/javascript"></script>
    
    
    <script>
            $(document).ready(function () {
                $('.sando').DataTable();
            });
        </script>
        
