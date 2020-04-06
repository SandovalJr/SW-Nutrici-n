<%-- 
    Document   : Menu5
    Created on : 7/07/2019, 10:25:36 PM
    Author     : 52449
--%>
<%-- 
    Document   : Menu4
    Created on : 7/07/2019, 09:52:17 PM
    Author     : 52449
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html lang="en" class="no-js">
	<head>
       
<%
    String user_name=(String) session.getAttribute("user_name");%>

  
    <%
        if(session.getAttribute("user_name") !=null
                && !session.getAttribute("user_name").equals("")){
        
    }   else {
            response.sendRedirect("/software_nutricion/inicio.jsp");
            }
%>

<link href="css/styletabla1.css" rel="stylesheet" type="text/css"/>


       
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>Circular Navigation - Demo 1 | Codrops</title>
		<meta name="description" content="Circular Navigation Styles - Building a Circular Navigation with CSS Transforms | Codrops " />
		<meta name="keywords" content="css transforms, circular navigation, round navigation, circular menu, tutorial" />
		<meta name="author" content="Sara Soueidan for Codrops" />
		<link rel="shortcut icon" href="../favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/normalizeM.css" />
		<link rel="stylesheet" type="text/css" href="css/demoM.css" />
		<link rel="stylesheet" type="text/css" href="css/component1M.css" />
		<script src="js/modernizr-2.6.2M.min.js"></script>

<script type="text/javascript">
var _gaq = _gaq || [];
_gaq.push(['_setAccount', 'UA-7243260-2']);
_gaq.push(['_trackPageview']);
(function() {
var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
})();
</script>

        
    
              
        
	</head>
	<body   background="fondo_verde.jpg">
          <header>
              
                <center>
                    
                    <div class="addthis_toolbox addthis_32x32_style addthis_default_style">
				<nav class="codrops-demos">
					
					<a  href="http://localhost:8080/software_nutricion/Menu1.jsp">Menu 1</a>
                                        <a href="http://localhost:8080/software_nutricion/Menu2.jsp">Menu 2</a>
                                        <a href="http://localhost:8080/software_nutricion/Menu3.jsp">Menu 3</a>
                                        <a href="http://localhost:8080/software_nutricion/Menu4.jsp">Menu 4</a>
                                        <a href="http://localhost:8080/software_nutricion/Menu5.jsp">Menu 5</a>
				</nav>
              </div>
                </center>
			</header>
		<div class="container">
			<!-- Top Navigation -->
			
			
		
			<div class="component">
				<!-- Start Nav Structure -->
				<button class="cn-button" id="cn-button">+</button>
				<div class="cn-wrapper" id="cn-wrapper">
				    <ul>
				      <li><a href="http://localhost:8080/software_nutricion/Metas_Paciente.jsp"><img src="metas.png">  </a></li>
				      <li><a href="http://localhost:8080/software_nutricion/MenuPlegableDietas.jsp"><img src="dieta2.png" alt =""></a></li>
				      <li><a href="http://localhost:8080/software_nutricion/MenuPlegable.jsp"><img src="c.png"> </a></li>
      <li><a  style="float:right" href="logout"> <img src="cerrar.png" alt =""> </a></li>
				      <li><a href="http://localhost:8080/software_nutricion/Mensaje_Menu.jsp"><img src="carta.png"></a></li>
				     </ul>
				</div>
				<div id="cn-overlay" class="cn-overlay"></div>
				<!-- End Nav Structure -->
			</div>
		</div><!-- /container -->
		<script src="js/polyfillsM.js"></script>
		<script src="js/demo1M.js"></script>
		<!-- For the demo ad only -->   

	</body>
        
        <% 
    //Conexcion a la base de datos
        Connection conexion;
        
        String Driver="org.postgresql.Driver";
       
        Class.forName(Driver);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos de Menu 1 pacientes");
        }
        
      
    %>
        
          <% 
    //Empezamos listado los datos de la tabla usuario
     PreparedStatement d;
              

              ResultSet dietas;
String desayuno5,menu5,bebida5,comida5,bebida55,cena5,bebida555,colacion5,ce5,ce55;

        System.out.println("LLEGO AL FROM");
 d=conexion.prepareStatement("SELECT id,user_name,menu5,desayuno5,comida5,colacion5,cena5,bebida5,bebida55,bebida555,ce5,ce55 FROM software_nutricion.\"dietas\" WHERE user_name='"+user_name+"'");
 dietas=d.executeQuery();  
 System.err.println(d);
        while(dietas.next()){
            //dia que se establecia la dieta
                    menu5=dietas.getString("menu5");
                    //DESAYUNO
                   desayuno5=dietas.getString("desayuno5");
                   bebida5=dietas.getString("bebida5");
                   //COMIDA
                   comida5=dietas.getString("comida5");
                   bebida55=dietas.getString("bebida55");
                   //CENA
                   cena5=dietas.getString("cena5");
                   bebida555=dietas.getString("bebida555");
                   //COLACIONES
                   colacion5=dietas.getString("colacion5");
                   ce5=dietas.getString("ce5");
                   ce55=dietas.getString("ce55");



  %>
          


  <div class="table1 col-lg-12">
      
<table  class="table table-hover">
    
    <tr >Dia : <%out.println(menu5);%></tr>
    <th style="background-color:#FFFF00"> </th>
    <th style="background-color:#FFFF00"><h3>nombre_platillo</h3></th>
    <th style="background-color:#FFFF00"> <h3>ingredientes</h3></th>
    <th style="background-color:#FFFF00"> <h3>tiempo_preparacion</h3></th>
    <th style="background-color:#FFFF00"> <h3>instrucciones</h3></th>
    <th style="background-color:#FFFF00"> <h3>calorias</h3></th>
   
    <br>
    <br>
    <%
 PreparedStatement d_5;
        ResultSet desayuno_5;
      d_5=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+desayuno5+"'"); 
         System.err.println("query de nombre del platillo es = "+d_5);

        desayuno_5=d_5.executeQuery();
        while(desayuno_5.next()){


%>
    <tr>
        <td>Desayuno</td>
        <td> <%out.println(desayuno5);%> </td>
        <th class="text-center"><%=desayuno_5.getString("ingredientes")%></th>
        <th class="text-center"><%=desayuno_5.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=desayuno_5.getString("instrucciones")%></th>
        <th class="text-center"><%=desayuno_5.getString("calorias")%></th>
       
<%}%>

                </tr>
                <%
 PreparedStatement b_5;
        ResultSet bebida_5;
      b_5=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida5+"'"); 
         System.err.println("query de nombre del platillo es = "+b_5);

        bebida_5=b_5.executeQuery();
        while(bebida_5.next()){


%>
                <tr>
                    <!-- BEBIDA 2-- DESAYUNO -->
                   <th>bebida</th> 
                            <td> <%out.println(bebida5);%> </td>
 <th class="text-center"><%=bebida_5.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_5.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_5.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_5.getString("calorias")%></th>
       
                    
                    
                </tr>
                
                <%}%>
                      </tr>
                <%
 PreparedStatement c_5;
        ResultSet comida_5;
      c_5=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+comida5+"'"); 
         System.err.println("query de nombre del platillo es = "+c_5);

        comida_5=c_5.executeQuery();
        while(comida_5.next()){


%>
                <tr>
                    <!-- comida2 -->
                   <th>Comida</th> 
                            <td> <%out.println(comida5);%> </td>
 <th class="text-center"><%=comida_5.getString("ingredientes")%></th>
        <th class="text-center"><%=comida_5.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=comida_5.getString("instrucciones")%></th>
        <th class="text-center"><%=comida_5.getString("calorias")%></th>
       
                  
                    
                </tr>
                 <% } %> 
         <%
 PreparedStatement b_55;
        ResultSet bebida_55;
      b_55=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida55+"'"); 
         System.err.println("query de nombre del platillo es = "+b_55);

        bebida_55=b_55.executeQuery();
        while(bebida_55.next()){


%>
                <tr>
                    <!-- BEBIDA 22 -- comida -->
                   <th>Bebida:</th> 
                            <td> <%out.println(bebida55);%> </td>
 <th class="text-center"><%=bebida_55.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_55.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_55.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_55.getString("calorias")%></th>
      
                    
                    
                </tr>
                <% }
                %>
        
                   <%
 PreparedStatement cen_5;
        ResultSet cena_5;
      cen_5=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+cena5+"'"); 
         System.err.println("query de nombre del platillo es = "+cen_5);

        cena_5=cen_5.executeQuery();
        while(cena_5.next()){


%>
                <tr>
                    <!-- CENA 2 -->
                   <th>Cena:</th> 
                            <td> <%out.println(cena5);%> </td>
 <th class="text-center"><%=cena_5.getString("ingredientes")%></th>
        <th class="text-center"><%=cena_5.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=cena_5.getString("instrucciones")%></th>
        <th class="text-center"><%=cena_5.getString("calorias")%></th>
             
                    
                </tr>  
                <% }
                %>
                
                      <%
 PreparedStatement b_555;
        ResultSet bebida_555;
      b_555=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida555+"'"); 
         System.err.println("query de nombre del platillo es = "+b_555);

        bebida_555=b_555.executeQuery();
        while(bebida_555.next()){


%>
                <tr>
                    <!-- CENA 2 BEBIDA 2 -->
                   <th>Bebida:</th> 
                            <td> <%out.println(bebida555);%> </td>
 <th class="text-center"><%=bebida_555.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_555.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_555.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_555.getString("calorias")%></th>
     
                    
                    
                </tr>  
                <% } %>
                
                 <%
 PreparedStatement cola_5;
        ResultSet colacion_5;
      cola_5=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+colacion5+"'"); 
         System.err.println("query de nombre del platillo es = "+cola_5);

        colacion_5=cola_5.executeQuery();
        while(colacion_5.next()){


%>
                <tr>
                    <!-- CENA 2 -->
                   <th>Colacion:</th> 
                            <td> <%out.println(colacion5);%> </td>
 <th class="text-center"><%=colacion_5.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_5.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_5.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_5.getString("calorias")%></th>
            
                    
                </tr>  
                <% }
                %>
                
              
                 <%
 PreparedStatement ce_5;
        ResultSet colacion_extra_5;
      ce_5=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce5+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_5);

        colacion_extra_5=ce_5.executeQuery();
        while(colacion_extra_5.next()){


%>
                <tr>
                    <!-- COLACION EXTRA -->
                   <th>Colacion extra 1:</th> 
                            <td> <%out.println(ce5);%> </td>
 <th class="text-center"><%=colacion_extra_5.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_extra_5.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_extra_5.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_extra_5.getString("calorias")%></th>
       
                    
                    
                </tr>    
                <% }
                %>
                
                      <%
 PreparedStatement ce_55;
        ResultSet colacion_extra_55;
      ce_55=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce55+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_55);

        colacion_extra_55=ce_55.executeQuery();
        while(colacion_extra_55.next()){


%>
                <tr>
                    <!-- CENA 1 -->
                   <th>Colacion extra 2:</th> 
                            <td> <%out.println(ce55);%> </td>
 <th class="text-center"><%=colacion_extra_55.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_extra_55.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_extra_55.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_extra_55.getString("calorias")%></th>
     
                    
                    
                </tr>    
                <% }
                %>
                
                
        
            </table>
        <%}%>
                  </div>

</html>