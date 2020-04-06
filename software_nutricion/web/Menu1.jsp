<%-- 
    Document   : Menu1
    Created on : 5/07/2019, 05:47:08 AM
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
String desayuno1,menu1,bebida1,comida1,bebida11,cena1,bebida111,colacion1,ce1,ce11;

        System.out.println("LLEGO AL FROM");
  d=conexion.prepareStatement("SELECT id,user_name,menu1,desayuno1,comida1,colacion1,cena1,bebida1,bebida11,bebida111,ce1,ce11 FROM software_nutricion.\"dietas\" WHERE user_name='"+user_name+"'"); 
 dietas=d.executeQuery();  
 System.err.println(d);
        while(dietas.next()){
            //dia que se establecia la dieta
                    menu1=dietas.getString("menu1");
                    //DESAYUNO
                   desayuno1=dietas.getString("desayuno1");
                   bebida1=dietas.getString("bebida1");
                   //COMIDA
                   comida1=dietas.getString("comida1");
                   bebida11=dietas.getString("bebida11");
                   //CENA
                   cena1=dietas.getString("cena1");
                   bebida111=dietas.getString("bebida111");
                   //COLACIONES
                   colacion1=dietas.getString("colacion1");
                   ce1=dietas.getString("ce1");
                   ce11=dietas.getString("ce11");



  %>
          
        <div style="position: absolute; left: 1%">
  <div class="table1 col-lg-12" >

<table  class="table table-hover " >
    
    <tr >Dia : <%out.println(menu1);%></tr>
    <th style="background-color:#FFFF00"> </th>
    <th style="background-color:#FFFF00"><h3>nombre_platillo</h3></th>
    <th style="background-color:#FFFF00"> <h3>ingredientes</h3></th>
    <th style="background-color:#FFFF00"> <h3>tiempo_preparacion</h3></th>
    <th style="background-color:#FFFF00"> <h3>instrucciones</h3></th>
    <th style="background-color:#FFFF00"> <h3>calorias</h3></th>
 

    <br>
    <br>
    <%
 PreparedStatement d_1;
        ResultSet desayuno_1;
      d_1=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+desayuno1+"'"); 
         System.err.println("query de nombre del platillo es = "+d_1);

        desayuno_1=d_1.executeQuery();
        while(desayuno_1.next()){


%>


    <tr>
        <td >Desayuno</td>
        <td > <%out.println(desayuno1);%> </td>
        <th class="text-center"><%=desayuno_1.getString("ingredientes")%></th>
        <th class="text-center"><%=desayuno_1.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=desayuno_1.getString("instrucciones")%></th>
        <th class="text-center"><%=desayuno_1.getString("calorias")%></th>

<%}%>

                </tr>
                <%
 PreparedStatement b_1;
        ResultSet bebida_1;
      b_1=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida1+"'"); 
         System.err.println("query de nombre del platillo es = "+b_1);

        bebida_1=b_1.executeQuery();
        while(bebida_1.next()){


%>
                <tr>
                    <!-- BEBIDA 1 -- DESAYUNO -->
                   <th>bebida</th> 
                            <td> <%out.println(bebida1);%> </td>
 <th class="text-center"><%=bebida_1.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_1.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_1.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_1.getString("calorias")%></th>

                    
                    
                </tr>
                
                <%}%>
                      </tr>
                <%
 PreparedStatement c_1;
        ResultSet comida_1;
      c_1=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+comida1+"'"); 
         System.err.println("query de nombre del platillo es = "+c_1);

        comida_1=c_1.executeQuery();
        while(comida_1.next()){


%>
                <tr>
                    <!-- comida -->
                   <th>Comida</th> 
                            <td> <%out.println(comida1);%> </td>
 <th class="text-center"><%=comida_1.getString("ingredientes")%></th>
        <th class="text-center"><%=comida_1.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=comida_1.getString("instrucciones")%></th>
        <th class="text-center"><%=comida_1.getString("calorias")%></th>

                  
                    
                </tr>
                 <% } %> 
         <%
 PreparedStatement b_11;
        ResultSet bebida_11;
      b_11=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida11+"'"); 
         System.err.println("query de nombre del platillo es = "+b_11);

        bebida_11=b_11.executeQuery();
        while(bebida_11.next()){


%>
                <tr>
                    <!-- BEBIDA 11 -- comida -->
                   <th>Bebida:</th> 
                            <td> <%out.println(bebida11);%> </td>
 <th class="text-center"><%=bebida_11.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_11.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_11.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_11.getString("calorias")%></th>

                    
                    
                </tr>
                <% }
                %>
        
                   <%
 PreparedStatement cen_1;
        ResultSet cena_1;
      cen_1=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+cena1+"'"); 
         System.err.println("query de nombre del platillo es = "+cen_1);

        cena_1=cen_1.executeQuery();
        while(cena_1.next()){


%>
                <tr>
                    <!-- CENA 1 -->
                   <th>Cena:</th> 
                            <td> <%out.println(cena1);%> </td>
 <th class="text-center"><%=cena_1.getString("ingredientes")%></th>
        <th class="text-center"><%=cena_1.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=cena_1.getString("instrucciones")%></th>
        <th class="text-center"><%=cena_1.getString("calorias")%></th>

                    
                    
                </tr>  
                <% }
                %>
                
                      <%
 PreparedStatement b_111;
        ResultSet bebida_111;
      b_111=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida111+"'"); 
         System.err.println("query de nombre del platillo es = "+b_111);

        bebida_111=b_111.executeQuery();
        while(bebida_111.next()){


%>
                <tr>
                    <!-- CENA 1 -->
                   <th>Bebida:</th> 
                            <td> <%out.println(bebida111);%> </td>
 <th class="text-center"><%=bebida_111.getString("ingredientes")%></th>
        <th class="text-center"><%=bebida_111.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=bebida_111.getString("instrucciones")%></th>
        <th class="text-center"><%=bebida_111.getString("calorias")%></th>

                    
                    
                </tr>  
                <% } %>
                
                 <%
 PreparedStatement cola_1;
        ResultSet colacion_1;
      cola_1=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+colacion1+"'"); 
         System.err.println("query de nombre del platillo es = "+cola_1);

        colacion_1=cola_1.executeQuery();
        while(colacion_1.next()){


%>
                <tr>
                    <!-- CENA 1 -->
                   <th>Colacion:</th> 
                            <td> <%out.println(colacion1);%> </td>
 <th class="text-center"><%=colacion_1.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_1.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_1.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_1.getString("calorias")%></th>

                    
                    
                </tr>  
                <% }
                %>
                
              
                 <%
 PreparedStatement ce_1;
        ResultSet colacion_extra_1;
      ce_1=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce1+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_1);

        colacion_extra_1=ce_1.executeQuery();
        while(colacion_extra_1.next()){


%>
                <tr>
                    <!-- CENA 1 -->
                   <th>Colacion extra 1:</th> 
                            <td> <%out.println(ce1);%> </td>
 <th class="text-center"><%=colacion_extra_1.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_extra_1.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_extra_1.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_extra_1.getString("calorias")%></th>

                    
                    
                </tr>    
                <% }
                %>
                
                      <%
 PreparedStatement ce_11;
        ResultSet colacion_extra_11;
      ce_11=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce11+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_11);

        colacion_extra_11=ce_11.executeQuery();
        while(colacion_extra_11.next()){


%>
                <tr>
                    <!-- CENA 1 -->
                   <th>Colacion extra 2:</th> 
                            <td> <%out.println(ce11);%> </td>
 <th class="text-center"><%=colacion_extra_11.getString("ingredientes")%></th>
        <th class="text-center"><%=colacion_extra_11.getString("tiempo_preparacion")%></th>
        <th class="text-center"><%=colacion_extra_11.getString("instrucciones")%></th>
        <th class="text-center"><%=colacion_extra_11.getString("calorias")%></th>

                    
                    
                </tr>    
                <% }
                %>
                
                
        
            </table>
        <%}%>
              
                    </div>                    </div>

</html>