<%-- 
    Document   : editar_ioshi
    Created on : 5/07/2019, 07:52:40 PM
    Author     : 52449
--%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
    
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="styles.css">
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script src="script.js"></script>
 
   
   
   <title>Bienvenido Nutrilogo</title>
  
</head>
<body   background="fondo_verde.jpg">
    
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

</body>

<% 
    //Conexcion a la base de datos
        Connection conexion;
        
        String Driver="org.postgresql.Driver";
       
        Class.forName(Driver);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos de editar dieta");
        }
        
      
    %>
    
 <% 
    //Empezamos listado los datos de la tabla usuario
     PreparedStatement ps;
         ResultSet dss;

         PreparedStatement desa;
         ResultSet desayuno;

         PreparedStatement beb;
         ResultSet bebida;

         PreparedStatement com;
         ResultSet comida;

         PreparedStatement cen;
         ResultSet cena;

         PreparedStatement colaci;
         ResultSet colacion;
              
              
  String user= request.getParameter("user");
    System.out.println(user);

 ps=conexion.prepareStatement("SELECT id,user_name as user,menu1,desayuno1,comida1,colacion1,cena1,menu2,desayuno2,comida2,colacion2,cena2,menu3,desayuno3,comida3,colacion3,cena3,menu4,desayuno4,comida4,colacion4,cena4,menu5,desayuno5,comida5,colacion5,cena5,bebida1,bebida11,bebida111,bebida2,bebida22,bebida222,bebida3,bebida33,bebida333,bebida4,bebida44,bebida444,bebida5,bebida55,bebida555,ce1,ce11,ce2,ce22,ce3,ce33,ce4,ce44,ce5,ce55 FROM software_nutricion.\"dietas\" WHERE user_name='"+user+"'"); 
             dss=ps.executeQuery();  

 
 desa=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'desayuno'"); 
              desayuno=desa.executeQuery();  


 beb=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=beb.executeQuery();  

 
 com=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'comida'"); 
 
        comida=com.executeQuery();  

 cen=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'cena'"); 
        cena=cen.executeQuery();  

 
 colaci=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 

       colacion=colaci.executeQuery();  


out.println("<table  border='1'>");

 out.println("<td>USER_NAME</td>");
  out.println("</table>");  



  %>




  
</html>


