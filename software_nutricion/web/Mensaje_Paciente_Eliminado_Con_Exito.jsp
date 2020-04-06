<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
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




  <script src="js/sweetalert.min.js"> </script>
 <link href="css/sweetalert.css" rel="stylesheet" type="text/css">

    
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

     
         <center>

                    <div class="addthis_toolbox addthis_32x32_style addthis_default_style">
                        <nav class="codrops-demos">

                            <a href="http://localhost:8080/software_nutricion/Escribir_Mensaje_Paciente.jsp">Escribir Mensaje</a>
                            <a href="http://localhost:8080/software_nutricion/Mensaje_Recibidos_Paciente.jsp"> Mensajes Recibidos</a>
                                                        <a href="http://localhost:8080/software_nutricion/Leido_Pacientes.jsp"> Mensajes Leidos</a>


                        </nav>
              </div>
                </center>
     
         
        
        <% 
    //Conexcion a la base de datos
        Connection conexion;
        
        String Driver="org.postgresql.Driver";
       
        Class.forName(Driver);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos de agregar dieta");
        }
     
        
    %>
  
                <%    
                       PreparedStatement dieta;
        ResultSet d;
    dieta=conexion.prepareStatement("SELECT id,user_name_envia,user_name_recibe,asunto,mensaje,estatus,fecha  FROM software_nutricion.\"Mensajes\" WHERE estatus ='No Leido' and user_name_recibe ='"+user_name+"'"); 
        d=dieta.executeQuery();
        
    %>
        
        <div style="position: absolute; left: 25%">
  <div class="table1 col-lg-12" >
<br>
        <br>
      
<table class="display sando" >
        <thead >
            <tr>

                <th style="background-color:#44FF01"> <h3>id</h3></th>
                <th style="background-color:#FFFF00"><h3>De</h3></th>
                <th style="background-color:#44FF01"> <h3>Asunto</h3></th>
                <th style="background-color:#FFFF00"> <h3>Mensaje</h3></th>
                <th style="background-color:#44FF01"> <h3>Fecha</h3></th>
                                                <th style="background-color:#44FF01"> <h3>Estatus</h3></th>

                <th style="background-color:#FFFF00"> <h3></h3></th>



                </th></tr>
        </thead>

        <%                        while (d.next()) {
        %>

        <tr>
            <th class="text-center"><%=d.getInt("id")%></th>
            <th class="text-center"><%=d.getString("user_name_envia")%></th>
            <th class="text-center"><%=d.getString("asunto")%></th>
            <th class="text-center"><%=d.getString("mensaje")%></th>
            <th class="text-center"><%=d.getString("fecha")%></th>
                        <th class="text-center"><%=d.getString("estatus")%></th>

            <td>
<a href="Eliminar_Mensaje_Paciente.jsp?id=<%=d.getInt("id")%>" ><img src="boton-x.png"></a>        

     <a href="Leer_Paciente.jsp?user_name_recibe=<%=d.getString("user_name_recibe")%>&id=<%=d.getInt("id")%>"> <img src="visto.png">  </a> 

                <a href="Escribir_Mensaje_Paciente.jsp?user_name_recibe=<%=d.getString("user_name_recibe")%>"><img src="responder.png"></a>
 </td>  
        </tr>
        <%}

        %>

</table>

        
        
        
        
        
        
     

          
			
	<body   background="fondo_verde.jpg">
            
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
      <li><a  style="float:right " href="logout"> <img src="cerrar.png" alt =""> </a></li>
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
  
          <div style="position: absolute; left: 150%">
                    <br><br><br>        <br>
        <br>
        <br>
        <br>
        <br> <br>
        <br>
        <br>
        <br> <br>
        <br>
        <br>
        <br> <br>
        <br>
        <br>
        <br> <br>
        <br>
        <br><br> <br><br>
                    <div id='cssmenu'>
  </div>  </div>
       
        
        <script>
    swal({
  title: "Mensaje Eliminado",
  text: "Presiona el boton para continuar",
  imageUrl:"eliminar_icon.png",
  button: "OK",
});
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