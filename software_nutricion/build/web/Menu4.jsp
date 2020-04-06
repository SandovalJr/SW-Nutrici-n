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



  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
       
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
String desayuno4,menu4,bebida4,comida4,bebida44,cena4,bebida444,colacion4,ce4,ce44;

        System.out.println("LLEGO AL FROM");
 d=conexion.prepareStatement("SELECT id,user_name,menu4,desayuno4,comida4,colacion4,cena4,bebida4,bebida44,bebida444,ce4,ce44 FROM software_nutricion.\"dietas\" WHERE user_name='"+user_name+"'");
 dietas=d.executeQuery();  
 System.err.println(d);
        while(dietas.next()){
            //dia que se establecia la dieta
                    menu4=dietas.getString("menu4");
                    //DESAYUNO
                   desayuno4=dietas.getString("desayuno4");
                   bebida4=dietas.getString("bebida4");
                   //COMIDA
                   comida4=dietas.getString("comida4");
                   bebida44=dietas.getString("bebida44");
                   //CENA
                   cena4=dietas.getString("cena4");
                   bebida444=dietas.getString("bebida444");
                   //COLACIONES
                   colacion4=dietas.getString("colacion4");
                   ce4=dietas.getString("ce4");
                   ce44=dietas.getString("ce44");



  %>
          


  <div class="table1 col-lg-12" >

<table  class="table table-hover">
    
    <tr >Dia : <%out.println(menu4);%></tr>
    <th style="background-color:#FFFF00"> </th>
    <th style="background-color:#FFFF00"><h3>nombre_platillo</h3></th>
    <th style="background-color:#FFFF00"> <h3>ingredientes</h3></th>
    <th style="background-color:#FFFF00"> <h3>tiempo_preparacion</h3></th>
    <th style="background-color:#FFFF00"> <h3>instrucciones</h3></th>
    <th style="background-color:#FFFF00"> <h3>calorias</h3></th>
  
    <br>
    <br>
    <%
 PreparedStatement d_4;
        ResultSet desayuno_4;
      d_4=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+desayuno4+"'"); 
         System.err.println("query de nombre del platillo es = "+d_4);

        desayuno_4=d_4.executeQuery();
        while(desayuno_4.next()){


%>
    <tr>
        <td  >Desayuno</td>
        <td> <%out.println(desayuno4);%> </td>
        <th class="text-center"><%=desayuno_4.getString("ingredientes")%></th>
        <th class="text-center"><%=desayuno_4.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=desayuno_4.getString("instrucciones")%></th>
        <th class="text-center"><%=desayuno_4.getString("calorias")%></th>
       
<%}%>

                </tr>
                <%
 PreparedStatement b_4;
        ResultSet bebida_4;
      b_4=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida4+"'"); 
         System.err.println("query de nombre del platillo es = "+b_4);

        bebida_4=b_4.executeQuery();
        while(bebida_4.next()){


%>
                <tr>
                    <!-- BEBIDA 2-- DESAYUNO -->
                   <th style="background-color:#17FBE8">bebida</th> 
                            <td> <%out.println(bebida4);%> </td>
 <th class="text-center"><%=bebida_4.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_4.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_4.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_4.getString("calorias")%></th>
        
                    
                    
                </tr>
                
                <%}%>
                      </tr>
                <%
 PreparedStatement c_4;
        ResultSet comida_4;
      c_4=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+comida4+"'"); 
         System.err.println("query de nombre del platillo es = "+c_4);

        comida_4=c_4.executeQuery();
        while(comida_4.next()){


%>
                <tr>
                    <!-- comida2 -->
                   <th style="background-color:#17FBE8">Comida</th> 
                            <td> <%out.println(comida4);%> </td>
 <th class="text-center"><%=comida_4.getString("ingredientes")%></th>
        <th class="text-center"><%=comida_4.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=comida_4.getString("instrucciones")%></th>
        <th class="text-center"><%=comida_4.getString("calorias")%></th>
      
                  
                    
                </tr>
                 <% } %> 
         <%
 PreparedStatement b_44;
        ResultSet bebida_44;
      b_44=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida44+"'"); 
         System.err.println("query de nombre del platillo es = "+b_44);

        bebida_44=b_44.executeQuery();
        while(bebida_44.next()){


%>
                <tr>
                    <!-- BEBIDA 22 -- comida -->
                   <th style="background-color:#17FBE8">Bebida:</th> 
                            <td> <%out.println(bebida44);%> </td>
 <th class="text-center"><%=bebida_44.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_44.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_44.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_44.getString("calorias")%></th>
      
                    
                    
                </tr>
                <% }
                %>
        
                   <%
 PreparedStatement cen_4;
        ResultSet cena_4;
      cen_4=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+cena4+"'"); 
         System.err.println("query de nombre del platillo es = "+cen_4);

        cena_4=cen_4.executeQuery();
        while(cena_4.next()){


%>
                <tr>
                    <!-- CENA 2 -->
                   <th style="background-color:#17FBE8">Cena:</th> 
                            <td> <%out.println(cena4);%> </td>
 <th class="text-center"><%=cena_4.getString("ingredientes")%></th>
        <th class="text-center"><%=cena_4.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=cena_4.getString("instrucciones")%></th>
        <th class="text-center"><%=cena_4.getString("calorias")%></th>
        
                    
                    
                </tr>  
                <% }
                %>
                
                      <%
 PreparedStatement b_444;
        ResultSet bebida_444;
      b_444=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida444+"'"); 
         System.err.println("query de nombre del platillo es = "+b_444);

        bebida_444=b_444.executeQuery();
        while(bebida_444.next()){


%>
                <tr>
                    <!-- CENA 2 BEBIDA 2 -->
                   <th style="background-color:#17FBE8">Bebida:</th> 
                            <td> <%out.println(bebida444);%> </td>
 <th class="text-center"><%=bebida_444.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_444.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_444.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_444.getString("calorias")%></th>
                  
                    
                </tr>  
                <% } %>
                
                 <%
 PreparedStatement cola_4;
        ResultSet colacion_4;
      cola_4=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+colacion4+"'"); 
         System.err.println("query de nombre del platillo es = "+cola_4);

        colacion_4=cola_4.executeQuery();
        while(colacion_4.next()){


%>
                <tr>
                    <!-- CENA 2 -->
                   <th style="background-color:#17FBE8">Colacion:</th> 
                            <td> <%out.println(colacion4);%> </td>
 <th class="text-center"><%=colacion_4.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_4.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_4.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_4.getString("calorias")%></th>
     
                    
                    
                </tr>  
                <% }
                %>
                
              
                 <%
 PreparedStatement ce_4;
        ResultSet colacion_extra_4;
      ce_4=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce4+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_4);

        colacion_extra_4=ce_4.executeQuery();
        while(colacion_extra_4.next()){


%>
                <tr>
                    <!-- COLACION EXTRA -->
                   <th style="background-color:#17FBE8">Colacion extra 1:</th> 
                            <td> <%out.println(ce4);%> </td>
 <th class="text-center"><%=colacion_extra_4.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_extra_4.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_extra_4.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_extra_4.getString("calorias")%></th>
      
                    
                    
                </tr>    
                <% }
                %>
                
                      <%
 PreparedStatement ce_44;
        ResultSet colacion_extra_44;
      ce_44=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce44+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_44);

        colacion_extra_44=ce_44.executeQuery();
        while(colacion_extra_44.next()){


%>
                <tr>
                    <!-- CENA 1 -->
                   <th style="background-color:#17FBE8">Colacion extra 2:</th> 
                            <td> <%out.println(ce44);%> </td>
 <th class="text-center"><%=colacion_extra_44.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_extra_44.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_extra_44.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_extra_44.getString("calorias")%></th>
       
                    
                    
                </tr>    
                <% }
                %>
                
                
        
            </table>
        <%}%>
                </div>

</html>