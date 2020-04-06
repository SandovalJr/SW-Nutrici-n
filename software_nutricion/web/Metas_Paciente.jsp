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

<link href="css/style_metas.css" rel="stylesheet" type="text/css"/>
<link href="css/style_metas2.css" rel="stylesheet" type="text/css"/>






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
        <center>
            <div class="addthis_toolbox addthis_32x32_style addthis_default_style">
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
String meta1,descripcion1,meta2,descripcion2,meta3,descripcion3;     

        System.out.println("LLEGO AL FROM");
     d=conexion.prepareStatement("SELECT id,user_name,meta1,descripcion1,meta2,descripcion2,meta3,descripcion3 FROM software_nutricion.\"Metas\" WHERE user_name='"+user_name+"'"); 
 dietas=d.executeQuery();  
 System.err.println(d);
        while(dietas.next()){
            //dia que se establecia la dieta
           



  %>
          
        <div style="position: absolute; left: 1%">
  <div class="table1 col-lg-12" >

<table  class="table table-hover "  >
    
   <th style="background-color:#FFFF00"> <h3></h3></th>
        <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> </th>
    <th style="background-color:#FFFF00"><h3>META 1</h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
        <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
                <th style="background-color:#FFFF00"> <h3></h3></th>

    <th style="background-color:#FFFF00"> <h3>META 2</h3></th>
<th style="background-color:#FFFF00"> <h3></h3></th>
        <th style="background-color:#FFFF00"> <h3></h3></th>
                <th style="background-color:#FFFF00"> <h3></h3></th>

    <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3>META 3</h3></th>
   
    <br>
    <br>
        <br>
    <br>    <br>
    <br>





    <tr>
        <th style="background-color:#FFFF00"> <h3>OBJETIVO</h3></th>
 <th style="background-color:#FFFF00"> <h3></h3></th>
        <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>

        <th class="text-center"><%=dietas.getString("meta1")%></th>

    <th style="background-color:#FFFF00"> <h3></h3></th>
    
        <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
        <th class="text-center"><%=dietas.getString("meta2")%></th>

    <th style="background-color:#FFFF00"> <h3></h3></th>
    
        <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
        <th class="text-center"><%=dietas.getString("meta3")%></th>

    
    </tr> 

    <tr>
        <th style="background-color:#FFFF00"> <h3>DESCRIPCION</h3></th>
 <th style="background-color:#FFFF00"> <h3></h3></th>
        <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
    <th class="text-center"><%=dietas.getString("descripcion1")%></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
    
        <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
    <th class="text-center"><%=dietas.getString("descripcion2")%></th>
 <th style="background-color:#FFFF00"> <h3></h3></th>
    
        <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
    <th style="background-color:#FFFF00"> <h3></h3></th>
    <th class="text-center"><%=dietas.getString("descripcion3")%></th>

    </tr>
              
 
    
    
    
        
            </table>
        <%}%>
        </div>
         </center>
      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        
                                       <div style="position: absolute; left: 1%"><img src="meta.png" width="500" height="300" alt=""/></div>

                        </div>    
        
                                       <div style="position: absolute; right: 1%"><img src="metav.png" width="500" height="300" alt=""/></div>

                        </div>    
        </div>                  
           <div id='cssmenu'>
  </div>
</html>