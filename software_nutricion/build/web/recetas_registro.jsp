<%-- 
    Document   : recetas_registro
    Created on : 30/06/2019, 12:33:01 PM
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
   



</head>
<div style="float:right" >
    <%=user_name%>
</div>
<body background="fondo_verde.jpg">

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

<form action="dietas_registro" method="POST">
    <center>
        <div class="addthis_toolbox addthis_32x32_style addthis_default_style">   
            <table border="0">
                <br>
                <br>
                <tr>
                    <th> Nombre de el platillo: </th>
                    <th><input type="text" name="nombre_platillo" value = "" size="40" required></th>
                </tr>
                <tbody>

                    <tr>
                        <td>Ingredientes:</td>
                        <th>  <textarea style="font-size:15px" rows="8" cols="33" type="text"  name="ingredientes"required ></textarea></th>



                    </tr>
                    <tr>
                        <td>Tiempo de preparacion:</td>
                        <td> <input type="text" name="tiempo_preparacion" value = "" size="40" ></td>
                        
                    </tr>
                    <tr>
                        <td>Instrucciones:</td>
                                 <th>  <textarea style="font-size:15px" rows="8" cols="33" type="text"  name="instrucciones"required ></textarea></th>

                    </tr>
                    <tr>
                        <td>Calorias del alimento:</td>
                        <td><input type="text" name="calorias" value = "" size="40" required></td>
                       
                    </tr>
                    <tr>
                        <td>Estatus:</td>
                        
                        <td><select name="estatus" required >

                    <option>desayuno</option>
                    <option>comida</option>
                    <option>cena</option>
                    <option>colacion</option>
                <option>bebida</option>

                    <option selected></option>
</td>
                </select>
                        
                    </tr>
              

                </tbody>
            </table>
        </div>
 
               <div style="position: fixed; left:50%">
         <img src="mono.png"  alt=""/></div>
        <br>
        <br>
        <center>
            <div class="addthis_toolbox addthis_32x32_style addthis_default_style" >
                <button style='width:80px; height:85px' class="login100-form-btn"> <img src="boton_registrar.png"> </button>
                
            </div>
           
            </form>

 
        </center>
         
        <div>


            </html>