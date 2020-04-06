<%-- 
    Document   : Menu2
    Created on : 7/07/2019, 08:47:21 PM
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
String desayuno2,menu2,bebida2,comida2,bebida22,cena2,bebida222,colacion2,ce2,ce22;

        System.out.println("LLEGO AL FROM");
 d=conexion.prepareStatement("SELECT id,user_name,menu2,desayuno2,comida2,colacion2,cena2,bebida2,bebida22,bebida222,ce2,ce22 FROM software_nutricion.\"dietas\" WHERE user_name='"+user_name+"'"); dietas=d.executeQuery();  
 System.err.println(d);
        while(dietas.next()){
            //dia que se establecia la dieta
                    menu2=dietas.getString("menu2");
                    //DESAYUNO
                   desayuno2=dietas.getString("desayuno2");
                   bebida2=dietas.getString("bebida2");
                   //COMIDA
                   comida2=dietas.getString("comida2");
                   bebida22=dietas.getString("bebida22");
                   //CENA
                   cena2=dietas.getString("cena2");
                   bebida222=dietas.getString("bebida222");
                   //COLACIONES
                   colacion2=dietas.getString("colacion2");
                   ce2=dietas.getString("ce2");
                   ce22=dietas.getString("ce22");



  %>


<div class="addthis_32x32_style ">
  <div class="table1 col-lg-12" >
<table  class="table table-hover">   
    <tr >Dia : <%out.println(menu2);%></tr>
    <th style="background-color:#FFFF00"> </th>
    <th style="background-color:#FFFF00"><h3>nombre_platillo</h3></th>
    <th style="background-color:#FFFF00"> <h3>ingredientes</h3></th>
    <th style="background-color:#FFFF00"> <h3>tiempo_preparacion</h3></th>
    <th style="background-color:#FFFF00"> <h3>instrucciones</h3></th>
    <th style="background-color:#FFFF00"> <h3>calorias</h3></th>
   

    <br>
    <br>
              
<%
 PreparedStatement d_2;
        ResultSet desayuno_2;
      d_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+desayuno2+"'"); 
         System.err.println("query de nombre del platillo es = "+d_2);

        desayuno_2=d_2.executeQuery();
        while(desayuno_2.next()){


%>
    <tr>
        <td>Desayuno</td>
        <td> <%out.println(desayuno2);%> </td>
        <th class="text-center"><%=desayuno_2.getString("ingredientes")%></th>
        <th class="text-center"><%=desayuno_2.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=desayuno_2.getString("instrucciones")%></th>
        <th class="text-center"><%=desayuno_2.getString("calorias")%></th>
       
<%}%>

                </tr>
                <%
 PreparedStatement b_2;
        ResultSet bebida_2;
      b_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida2+"'"); 
         System.err.println("query de nombre del platillo es = "+b_2);

        bebida_2=b_2.executeQuery();
        while(bebida_2.next()){


%>
                <tr>
                    <!-- BEBIDA 2-- DESAYUNO -->
                   <th>bebida</th> 
                            <td> <%out.println(bebida2);%> </td>
 <th class="text-center"><%=bebida_2.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_2.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_2.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_2.getString("calorias")%></th>
      

                    
                    
                </tr>
                
                <%}%>
                      </tr>
                <%
 PreparedStatement c_2;
        ResultSet comida_2;
      c_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+comida2+"'"); 
         System.err.println("query de nombre del platillo es = "+c_2);

        comida_2=c_2.executeQuery();
        while(comida_2.next()){


%>
                <tr>
                    <!-- comida2 -->
                   <th>Comida</th> 
                            <td> <%out.println(comida2);%> </td>
 <th class="text-center"><%=comida_2.getString("ingredientes")%></th>
        <th class="text-center"><%=comida_2.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=comida_2.getString("instrucciones")%></th>
        <th class="text-center"><%=comida_2.getString("calorias")%></th>
       

                  
                    
                </tr>
                 <% } %> 
         <%
 PreparedStatement b_22;
        ResultSet bebida_22;
      b_22=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida22+"'"); 
         System.err.println("query de nombre del platillo es = "+b_22);

        bebida_22=b_22.executeQuery();
        while(bebida_22.next()){


%>
                <tr>
                    <!-- BEBIDA 22 -- comida -->
                   <th>Bebida:</th> 
                            <td> <%out.println(bebida22);%> </td>
 <th class="text-center"><%=bebida_22.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_22.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_22.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_22.getString("calorias")%></th>
       
                    
                    
                </tr>
                <% }
                %>
        
                   <%
 PreparedStatement cen_2;
        ResultSet cena_2;
      cen_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+cena2+"'"); 
         System.err.println("query de nombre del platillo es = "+cen_2);

        cena_2=cen_2.executeQuery();
        while(cena_2.next()){


%>
                <tr>
                    <!-- CENA 2 -->
                   <th>Cena:</th> 
                            <td> <%out.println(cena2);%> </td>
 <th class="text-center"><%=cena_2.getString("ingredientes")%></th>
        <th class="text-center"><%=cena_2.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=cena_2.getString("instrucciones")%></th>
        <th class="text-center"><%=cena_2.getString("calorias")%></th>
       
                    
                    
                </tr>  
                <% }
                %>
                
                      <%
 PreparedStatement b_222;
        ResultSet bebida_222;
      b_222=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida222+"'"); 
         System.err.println("query de nombre del platillo es = "+b_222);

        bebida_222=b_222.executeQuery();
        while(bebida_222.next()){


%>
                <tr>
                    <!-- CENA 2 BEBIDA 2 -->
                   <th>Bebida:</th> 
                            <td> <%out.println(bebida222);%> </td>
 <th class="text-center"><%=bebida_222.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_222.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_222.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_222.getString("calorias")%></th>
                
                    
                </tr>  
                <% } %>
                
                 <%
 PreparedStatement cola_2;
        ResultSet colacion_2;
      cola_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+colacion2+"'"); 
         System.err.println("query de nombre del platillo es = "+cola_2);

        colacion_2=cola_2.executeQuery();
        while(colacion_2.next()){


%>
                <tr>
                    <!-- CENA 2 -->
                   <th>Colacion:</th> 
                            <td> <%out.println(colacion2);%> </td>
 <th class="text-center"><%=colacion_2.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_2.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_2.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_2.getString("calorias")%></th>
     
                    
                    
                </tr>  
                <% }
                %>
                
              
                 <%
 PreparedStatement ce_2;
        ResultSet colacion_extra_2;
      ce_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce2+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_2);

        colacion_extra_2=ce_2.executeQuery();
        while(colacion_extra_2.next()){


%>
                <tr>
                    <!-- COLACION EXTRA -->
                   <th>Colacion extra 1:</th> 
                            <td> <%out.println(ce2);%> </td>
 <th class="text-center"><%=colacion_extra_2.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_extra_2.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_extra_2.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_extra_2.getString("calorias")%></th>

                    
                    
                </tr>    
                <% }
                %>
                
                      <%
 PreparedStatement ce_22;
        ResultSet colacion_extra_22;
      ce_22=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce22+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_22);

        colacion_extra_22=ce_22.executeQuery();
        while(colacion_extra_22.next()){


%>
                <tr>
                    <!-- CENA 1 -->
                   <th>Colacion extra 2:</th> 
                            <td> <%out.println(ce22);%> </td>
 <th class="text-center"><%=colacion_extra_22.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_extra_22.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_extra_22.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_extra_22.getString("calorias")%></th>
       
                    
                    
                </tr>    
                <% }
                %>
                
                
        
            </table>
        <%}%>
                   </div>   </div>

</html>