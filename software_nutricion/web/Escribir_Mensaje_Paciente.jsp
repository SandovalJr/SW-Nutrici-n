<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
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
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    
    
<link href="css/font-awesome.css" rel="stylesheet" type="text/css"/>
<link href="css/estilos.css" rel="stylesheet" type="text/css"/>

<script src="js/jquery-3.2.1.js" type="text/javascript"></script>
<script src="js/script.js" type="text/javascript"></script>

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
<% 
    //Conexcion a la base de datos
        Connection conexion;
        
        String Driver="org.postgresql.Driver";
       
        Class.forName(Driver);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos");
        }
        
       
        
        
    %>
  <center>

                    <div class="addthis_toolbox addthis_32x32_style addthis_default_style">
                        <nav class="codrops-demos">

                            <a href="http://localhost:8080/software_nutricion/Escribir_Mensaje_Paciente.jsp">Escribir Mensaje</a>
                            <a href="http://localhost:8080/software_nutricion/Mensaje_Recibidos_Paciente.jsp"> Mensajes Recibidos</a>
                                                                                    <a href="http://localhost:8080/software_nutricion/Leido_Pacientes.jsp"> Mensajes Leidos</a>


                        </nav>
              </div>
                </center>
     
         
      
        <center>
<form action="Mensajes_Paciente_Nutriologo" method="POST" class="form_contact">
     <div style="position: fixed; left: 27%"  >
         <div class="d-flex">  
                

                  <div   class="card col-lg-15">
    <table   class="table table-hover">
                            <th style="background-color:#A4A4A4"> CONTACTO </th>
                            <th style="background-color:#A4A4A4"> 
                                <div style="position: fixed; right:25%"  class="col-lg-1">
                                <%
    String fech;

Calendar calendar = new GregorianCalendar();
int suma =  calendar.get(Calendar.MONTH) +1;
                    fech = ("   " + calendar.get(Calendar.DAY_OF_MONTH) + "/" + suma + "/" + calendar.get(Calendar.YEAR));


%>
 <input type="text" name="fecha" readonly="" value = "<%=fech%>" size="" required>
</div> 
                            </th>
               
                <tr>
                    <th >Tu Usuario : </th>
                    <th><input type="text" name="user_name_envia" readonly="" value = "<%= user_name%>" size="40" required></th>
                </tr>
                <tr>
                    <th>Para :</th>
                       <th><input type="text" name="user_name_recibe" readonly="" value = "Nutriologa" size="" required></th>
                    
                </tr>
                <tbody>

                    <tr>
                        <td>Asunto:</td>
                        <td> <input type="text" name="asunto" value = "" size="40" required></td>
                        
                    </tr>
                    <tr>
                        <td>Mensaje:  </td>
                        <th>  <textarea style="font-size:15px" rows="8" cols="80" type="text"  name="mensaje"required ></textarea></th>

 
                    </tr>
                     <td>Estatus:  </td>
                    <th><input type="text" name="estatus" readonly="" value = "No Leido" size="" required></th>

                    <tr>
                        <td></td>
                        <td>
                <center>
                 
 <center>
            <div class="addthis_toolbox addthis_32x32_style addthis_default_style" >
                <button style='width:150px; height:40px' class="login100-form-btn"> ENVIAR</button>
                
            </div>
           
           

 
        </center>
                    </div>




                </center>
                </td>
                </tr>

               
                </tbody>
    </table>
                  </div>        </div>  </div>

              
        <br>
        <br>
      

 </form>

       
			
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
        <br>
        <br>
        <br>         <br        <br>
        <br>
    
     <br>
        <br>
        <br>         <br        <br>
        <br>
     <br>
        <br>
        <br>         <br        <br><br>
        

                    <div id='cssmenu'>
  </div>
</html>