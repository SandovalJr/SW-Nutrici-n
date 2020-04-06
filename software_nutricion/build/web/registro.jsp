<%-- 
    Document   : registro
    Created on : 13/06/2019, 12:52:35 AM
    Author     : 52449
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<%
    String user_name = (String) session.getAttribute("user_name");%>


<%
    if (session.getAttribute("user_name") != null
            && !session.getAttribute("user_name").equals("")) {

    } else {
        response.sendRedirect("/software_nutricion/inicio.jsp");
    }
%>
<html >
    <head>
     
 
        <meta charset='utf-8'>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="styles.css">
        <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
        <script src="script.js"></script>



        <title>Registrar Expediente</title>

    <div style="position: fixed; rigth: 75%"><img src="software_nutricion/Login_v5/images/icons/logo_nutricion.png" width="250" height="250" alt=""/></div>


</head>
<div style="float:right" >
    <%=user_name%>
</div>
<body background="imagenes2.jpg">

    <div id='cssmenu'>
        <li><a  style="float:right" href="logout"> <img src="cerrar.png"> </a></li>
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

</body>

 
 

<form action="registrar" method="POST">
    <center>
        <div class="addthis_toolbox addthis_32x32_style addthis_default_style" >   
            <table border="0">
                <br>
                <br>
                <tr>
                    <th>Nombre Completo :</th>
                    <th><input type="text" name="nombre_apellido" value = "" size="40" required></th>
                    <td>Consumes Alcohol: Si <input type="radio" name="alcohol" value = "si" size="20"></td>
                    <td>No<input type="radio" name="alcohol" value = "no" size="20"></td>

                </tr>
                <tbody>

                    <tr>
                        <td>Edad:</td>
                        <td> <input type="text" name="edad" value = "" size="40" required></td>
                        <td>Consumes Tabaco:   Si <input type=radio name="tabaco" value = "si" size="20"></td>
                        <td> No<input type=radio name="tabaco" value = "no" size="20"></td>
                    </tr>
                    <tr>
                        <td>Escolaridad:</td>
                        <td> <input type="text" name="escolaridad" value = "" size="40"></td>
                        <td>Consumes Drogas:   Si <input type="radio" name="drogas" value = "si" size="20"></td>
                        <td>No<input type="radio" name="drogas" value ="no" size="20"></td>
                    </tr>
                    <tr>
                        <td>Estado Civil:</td>
                        <td><input type="text" name="civil" value = "" size="40"></td> 
                        <td>Enfermedades(APP):</td>
                        <td> <input type="text" name="enfermedadesapp" value = "" size="30"></td>
                    </tr>
                    <tr>
                        <td>Motivo de la consulta:</td>
                        <td><input type="text" name="motivo_consulta" value = "" size="40"></td>
                        <td>Algun alimento desagradable:</td>
          <th>  <textarea style="font-size:15px" rows="5" cols="26" type="text"  name="alimentos_desagradablesapp" ></textarea></th>

                    </tr>
                    <tr>
                        <td>Ocupacion:</td>
                        <td><input type="text" name="ocupacion" value = "" size="40"></td>
                        <td>Alguna alergia alimentaria:(APP)</td>
                        <td><input type="text" name="alergias_alimentariosapp" value = "" size="30"></td>
                    </tr>
                <td>¿Tomas medicamentos?¿Cuales?:</td>
                <td><input type="text" name="medicamentos" value = "" size="40"></td>
                <td>Usuario:</td>
                <td><input type="text" name="user_name" value = "" size="30" required></td> 
                <tr>

                    <td>Antecedentes heredados:</td>
                    <td><input type="text" name="antecedentes_heredados" value = "" size="40"></td>

                    <td>Contraseña:</td>
                    <td><input type="text" name="password" value = "" size="30" required></td>
                </tr>


                </tbody>
            </table>
        </div>

        <br>
        <br>
        <center>
            <div class="addthis_toolbox addthis_32x32_style addthis_default_style" >
                <button style='width:120px; height:50px' class="login100-form-btn"> <img src="agregar.png"> </button>
            </div>
            
       
            </form>


        </center>
        <div>
       
         
           


            </html>