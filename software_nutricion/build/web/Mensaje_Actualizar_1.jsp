<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<% 
    
    String user= request.getParameter("user");
   String user_n=request.getParameter("user_n");

            

    String user_name=(String) session.getAttribute("user_name");%>

 
    <%
        if(session.getAttribute("user_name") !=null
                && !session.getAttribute("user_name").equals("")){
        
    }   else {
            response.sendRedirect("/software_nutricion/inicio.jsp");
            }
%>





<% 
    //Conexcion a la base de datos
        Connection conexion;
        
        String Driver="org.postgresql.Driver";
       
        Class.forName(Driver);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos");
        }
        
       
        
        
    %>
    

<html lang=''>
<head>
   
    
    
<link href="css/styletabla1.css" rel="stylesheet" type="text/css"/>


 
    
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    
    
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="styles.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script src="script.js"></script>
 
   
   
   <title>Bienvenido Nutrilogo</title>
  
</head>

<body  background="fondo_verde.jpg" >
  <div style="float:right" >
      <%=user_name%>
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
    <div style="position: fixed; rigth: 75%"><img src="software_nutricion/Login_v5/images/icons/logo_nutricion.png" width="250" height="250" alt=""/></div>


    <div style="position: fixed; left:76%">
        <br><br><br><br>  <br><br><br><br>  <br><br><br><br>
         <img  src="mono.png" width="700" height="500"  alt=""/></div>
    

   
  <br>
  

       <% 
    //Empezamos listado los datos de la tabla usuario
     PreparedStatement ps;
              

              ResultSet rs;

        System.out.println("LLEGO AL FROM");
        
   System.out.println(user);
int id=Integer.parseInt(request.getParameter("id"));
System.out.println(id);
    ps=conexion.prepareStatement("SELECT id,user_name_envia as user,user_name_recibe,asunto,mensaje,estatus,fecha  FROM software_nutricion.\"Mensajes\""); 
 rs=ps.executeQuery();  
 System.err.println(ps);
        while(rs.next()){
            System.out.println("ingreso al while");
  %>
    
    
 <form action="Update_Marcar_Leido_Nutriologo" method="POST" class="form_contact">
     <div style="position: fixed; left: 27%"  >
         <div class="d-flex">  
                

                  <div   class="card col-lg-15">
    <table   class="table table-hover">
                            <th style="background-color:#A4A4A4"> MENSAJE DE PACIENTE </th>
                            <th style="background-color:#A4A4A4"> 
                                <div style="position: fixed; right:27%"  class="col-lg-1">
                                <%
    String fech;

Calendar calendar = new GregorianCalendar();
int suma =  calendar.get(Calendar.MONTH) +1;
                    fech = ("   " + calendar.get(Calendar.DAY_OF_MONTH) + "/" + suma + "/" + calendar.get(Calendar.YEAR));


%>
 <input type="text" name="fecha" readonly="" value = "<%=rs.getString("fecha")%>" size="12" required>
</div> 
                            </th>
               
                <tr>
                    <th >Paciente: </th>
                    <th><input type="text" name="user_name_envia" readonly="" value = "<%=rs.getString("user")%>" size="40" required></th>
                </tr>
                <tr>
                    <th>Para :</th>
                       <th><input type="text" name="user_name_recibe" readonly="" value = "<%=rs.getString("user_name_recibe")%>" size="" required></th>
                    
                </tr>
                <tbody>

                    <tr>
                        <td>Asunto:</td>
                        <td> <input type="text" name="asunto" value = "<%=rs.getString("asunto")%>" size="40" required></td>
                        
                    </tr>
                    <tr>
                        <td>Mensaje:  </td>
                        <th>  <textarea style="font-size:15px" rows="8" cols="80" type="text"  name="mensaje"required ><%=rs.getString("mensaje")%></textarea></th>

 
                    </tr>
                     <td>Estatus:  </td>
                    <th><input type="text" name="estatus" readonly="" value = "Leido" size="" required></th>

                    <tr>
                        <td></td>
                        <td>
                <center>
                 
 <center>
            <div class="addthis_toolbox addthis_32x32_style addthis_default_style" >
                <button style='width:150px; height:40px' class="login100-form-btn"> Leido</button>
                
            </div>
           
           
 <% }%>
 
        </center>
                    </div>

                    
</body>
<br>  
  </form>
               
   </html>
   