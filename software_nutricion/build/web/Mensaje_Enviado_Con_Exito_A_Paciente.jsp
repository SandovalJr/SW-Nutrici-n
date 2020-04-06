<%-- 
    Document   : Menu
    Created on : 13/06/2019, 12:31:08 AM
    Author     : 52449
--%>

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
  <br><br>
             <center>

                    <div class="addthis_toolbox addthis_32x32_style addthis_default_style">
                        <nav class="codrops-demos">

                            <a href="http://localhost:8080/software_nutricion/Escribir_Mensaje_A_Paciente.jsp">Escribir Mensaje</a>
                            <a href="http://localhost:8080/software_nutricion/Mensajes_Recibidos_Nutriologo.jsp"> Mensajes Recibidos</a>
                                                                                    <a href="http://localhost:8080/software_nutricion/Leidos_Nutriologo.jsp"> Mensajes Leidos</a>

    <div class="addthis_toolbox addthis_32x32_style addthis_default_style"><img src="software_nutricion/Login_v5/images/icons/logo_nutricion.png" width="500" height="500" alt=""/>

                        </nav>
              </div>
                </center>

</body>
<script>
    swal({
  title: "Mensaje Enviado ",
  text: "Presiona el boton para continuar",
  imageUrl:"mensaje_enviado.png",
  button: "OK",
});
 </script>


  
</html>

