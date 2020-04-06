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

    <div class="addthis_toolbox addthis_32x32_style addthis_default_style"><img src="software_nutricion/Login_v5/images/icons/logo_nutricion.png" width="300" height="300" alt=""/>

                        </nav>
              </div>
                </center>
     
         
     

              
                <center>

                    <div class="addthis_toolbox addthis_32x32_style addthis_default_style">
                        <nav class="codrops-demos">

                            <a  href="https://www.facebook.com/Nutricion.Tupeso.ideal/"><img src="face.png"> </a>
                            <a href="https://wa.me/524493865009"><img src="whatsapp.png"></a>
                           
                        </nav>
              </div>
                </center>
			
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
        <br><br><br>        <br>
        <br>
        <br>
        <br>
        <br>
        <script>
    swal({
  title: "Mensaje Leido",
  text: "Presiona el boton para continuar",
  imageUrl:"comprobado.png",
  button: "OK",
});
 </script>

                    <div id='cssmenu'>
  </div>
</html>