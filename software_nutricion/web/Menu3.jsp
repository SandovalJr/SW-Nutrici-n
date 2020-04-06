<%-- 
    Document   : Menu4
    Created on : 7/07/2019, 09:28:15 PM
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
String desayuno3,menu3,bebida3,comida3,bebida33,cena3,bebida333,colacion3,ce3,ce33;

        System.out.println("LLEGO AL FROM");
 d=conexion.prepareStatement("SELECT id,user_name,menu3,desayuno3,comida3,colacion3,cena3,bebida3,bebida33,bebida333,ce3,ce33 FROM software_nutricion.\"dietas\" WHERE user_name='"+user_name+"'");
 dietas=d.executeQuery();  
 System.err.println(d);
        while(dietas.next()){
            //dia que se establecia la dieta
                    menu3=dietas.getString("menu3");
                    //DESAYUNO
                   desayuno3=dietas.getString("desayuno3");
                   bebida3=dietas.getString("bebida3");
                   //COMIDA
                   comida3=dietas.getString("comida3");
                   bebida33=dietas.getString("bebida33");
                   //CENA
                   cena3=dietas.getString("cena3");
                   bebida333=dietas.getString("bebida333");
                   //COLACIONES
                   colacion3=dietas.getString("colacion3");
                   ce3=dietas.getString("ce3");
                   ce33=dietas.getString("ce33");



  %>
          


  <div class="table1 col-lg-12" >


<table  class="table table-hover">   
    <tr >Dia : <%out.println(menu3);%></tr>
    <th style="background-color:#00FFFF"> </th>
    <th style="background-color:#00FFFF"><h3>nombre_platillo</h3></th>
    <th style="background-color:#00FFFF"> <h3>ingredientes</h3></th>
    <th style="background-color:#00FFFF"> <h3>tiempo_preparacion</h3></th>
    <th style="background-color:#00FFFF"> <h3>instrucciones</h3></th>
    <th style="background-color:#00FFFF"> <h3>calorias</h3></th>
    

    <br>
    <br>
    <%
 PreparedStatement d_3;
        ResultSet desayuno_3;
      d_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+desayuno3+"'"); 
         System.err.println("query de nombre del platillo es = "+d_3);

        desayuno_3=d_3.executeQuery();
        while(desayuno_3.next()){


%>
    <tr>
        <td>Desayuno</td>
        <td > <%out.println(desayuno3);%> </td>
        <th  class="text-center"><%=desayuno_3.getString("ingredientes")%></th>
        <th class="text-center"><%=desayuno_3.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=desayuno_3.getString("instrucciones")%></th>
        <th class="text-center"><%=desayuno_3.getString("calorias")%></th>
        
<%}%>

                </tr>
                <%
 PreparedStatement b_3;
        ResultSet bebida_3;
      b_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida3+"'"); 
         System.err.println("query de nombre del platillo es = "+b_3);

        bebida_3=b_3.executeQuery();
        while(bebida_3.next()){


%>
                <tr>
                    <!-- BEBIDA 2-- DESAYUNO -->
                   <th  style="background-color:#0080FF">  bebida</th> 
                            <td> <%out.println(bebida3);%> </td>
 <th class="text-center"><%=bebida_3.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_3.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_3.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_3.getString("calorias")%></th>
               
                    
                </tr>
                
                <%}%>
                      </tr>
                <%
 PreparedStatement c_3;
        ResultSet comida_3;
      c_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+comida3+"'"); 
         System.err.println("query de nombre del platillo es = "+c_3);

        comida_3=c_3.executeQuery();
        while(comida_3.next()){


%>
                <tr>
                    <!-- comida2 -->
                   <th  style="background-color:#0080FF">Comida</th> 
                            <td> <%out.println(comida3);%> </td>
 <th class="text-center"><%=comida_3.getString("ingredientes")%></th>
        <th class="text-center"><%=comida_3.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=comida_3.getString("instrucciones")%></th>
        <th class="text-center"><%=comida_3.getString("calorias")%></th>
     
                  
                    
                </tr>
                 <% } %> 
         <%
 PreparedStatement b_33;
        ResultSet bebida_33;
      b_33=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida33+"'"); 
         System.err.println("query de nombre del platillo es = "+b_33);

        bebida_33=b_33.executeQuery();
        while(bebida_33.next()){


%>
                <tr>
                    <!-- BEBIDA 22 -- comida -->
                   <th  style="background-color:#0080FF">Bebida:</th> 
                            <td> <%out.println(bebida33);%> </td>
 <th class="text-center"><%=bebida_33.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_33.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_33.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_33.getString("calorias")%></th>
       
                    
                    
                </tr>
                <% }
                %>
        
                   <%
 PreparedStatement cen_3;
        ResultSet cena_3;
      cen_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+cena3+"'"); 
         System.err.println("query de nombre del platillo es = "+cen_3);

        cena_3=cen_3.executeQuery();
        while(cena_3.next()){


%>
                <tr>
                    <!-- CENA 2 -->
                   <th  style="background-color:#0080FF">Cena:</th> 
                            <td> <%out.println(cena3);%> </td>
 <th class="text-center"><%=cena_3.getString("ingredientes")%></th>
        <th class="text-center"><%=cena_3.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=cena_3.getString("instrucciones")%></th>
        <th class="text-center"><%=cena_3.getString("calorias")%></th>
      
                    
                    
                </tr>  
                <% }
                %>
                
                      <%
 PreparedStatement b_333;
        ResultSet bebida_333;
      b_333=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida333+"'"); 
         System.err.println("query de nombre del platillo es = "+b_333);

        bebida_333=b_333.executeQuery();
        while(bebida_333.next()){


%>
                <tr>
                    <!-- CENA 2 BEBIDA 2 -->
                   <th  style="background-color:#0080FF">Bebida:</th> 
                            <td> <%out.println(bebida333);%> </td>
 <th class="text-center"><%=bebida_333.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_333.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_333.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_333.getString("calorias")%></th>
    
                    
                    
                </tr>  
                <% } %>
                
                 <%
 PreparedStatement cola_3;
        ResultSet colacion_3;
      cola_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+colacion3+"'"); 
         System.err.println("query de nombre del platillo es = "+cola_3);

        colacion_3=cola_3.executeQuery();
        while(colacion_3.next()){


%>
                <tr>
                    <!-- CENA 2 -->
                   <th  style="background-color:#0080FF" >Colacion:</th> 
                            <td> <%out.println(colacion3);%> </td>
 <th class="text-center"><%=colacion_3.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_3.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_3.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_3.getString("calorias")%></th>
               
                    
                </tr>  
                <% }
                %>
                
              
                 <%
 PreparedStatement ce_3;
        ResultSet colacion_extra_3;
      ce_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce3+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_3);

        colacion_extra_3=ce_3.executeQuery();
        while(colacion_extra_3.next()){


%>
                <tr>
                    <!-- COLACION EXTRA -->
                   <th  style="background-color:#0080FF">Colacion extra 1:</th> 
                            <td> <%out.println(ce3);%> </td>
 <th class="text-center"><%=colacion_extra_3.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_extra_3.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_extra_3.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_extra_3.getString("calorias")%></th>
     
                    
                    
                </tr>    
                <% }
                %>
                
                      <%
 PreparedStatement ce_33;
        ResultSet colacion_extra_33;
      ce_33=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce33+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_33);

        colacion_extra_33=ce_33.executeQuery();
        while(colacion_extra_33.next()){


%>
                <tr>
                    <!-- CENA 1 -->
                   <th  style="background-color:#0080FF"> Colacion extra 2:</th> 
                            <td> <%out.println(ce33);%> </td>
 <th class="text-center"><%=colacion_extra_33.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_extra_33.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_extra_33.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_extra_33.getString("calorias")%></th>
      
                    
                    
                </tr>    
                <% }
                %>
                
                
        
            </table>
        <%}%>
                    <div id='cssmenu'>
  </div>  </div>

</html>