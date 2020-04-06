<%-- 
    Document   : inicio.jsp
    Created on : 24/05/2019, 07:11:03 PM
    Author     : 52449
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
     <script type="text/javascript">history.forward();
</script>
	<title>Software_Nutrcion</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="software_nutricion/Login_v5/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="software_nutricion/Login_v5/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="software_nutricion/Login_v5/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="software_nutricion/Login_v5/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="software_nutricion/Login_v5/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="software_nutricion/Login_v5/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="software_nutricion/Login_v5/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="software_nutricion/Login_v5/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="software_nutricion/Login_v5/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="software_nutricion/Login_v5/css/util.css">
	<link rel="stylesheet" type="text/css" href="software_nutricion/Login_v5/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
	<div style="position: fixed; left: 75%"><img src="software_nutricion/Login_v5/images/icons/logo_nutricion.png" width="300" height="300" alt=""/></div>
<div class="container-login100" style="background-image: url('software_nutricion/fondo_2.jpg');">
	  <div class="wrap-login100 p-l-110 p-r-110 p-t-62 p-b-33">
              
				<form action ="LoginValidate" method="post" name="FormEntrar">
					<span class="login100-form-title p-b-53">
						INICIA SESIÓN
					</span>

					
				  <div class="p-t-31 p-b-9"><span class="txt1"> Usuario</span></div>
					<div class="wrap-input100 validate-input" data-validate = "Username is required">
						<input class="input100" type="text" name="user_name" >
						<span class="focus-input100"></span>
					</div>
					
					<div class="p-t-13 p-b-9"><span class="txt1"> Contraseña &nbsp; &nbsp; &nbsp; </span><a href="#" class="txt2 bo1 m-l-5">&nbsp; &nbsp; &nbsp;</a></div>
					<div class="wrap-input100 validate-input" data-validate = "Password is required">
						<input class="input100" type="password" name="password" >
						<span class="focus-input100"></span>
					</div>

					<div class="container-login100-form-btn m-t-17">
						<button class="login100-form-btn"> ingresar</button>
					</div>
<% String msg = (String) request.getAttribute("msg");
            if(msg!=null) {%>
            <b><font color ="red"><%=msg%></font></b>
            <% } %>
					<div class="w-full text-center p-t-55"></div>
		</form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="software_nutricion/Login_v5/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="software_nutricion/Login_v5/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="software_nutricion/Login_v5/vendor/bootstrap/js/popper.js"></script>
	<script src="software_nutricion/Login_v5/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="software_nutricion/Login_v5/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="software_nutricion/Login_v5/vendor/daterangepicker/moment.min.js"></script>
	<script src="software_nutricion/Login_v5/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="software_nutricion/Login_v5/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="software_nutricion/Login_v5/js/main.js"></script>

</body>
</html>