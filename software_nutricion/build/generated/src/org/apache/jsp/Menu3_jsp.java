package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Menu3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("\t<head>\n");
      out.write("       \n");

    String user_name=(String) session.getAttribute("user_name");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("    ");

        if(session.getAttribute("user_name") !=null
                && !session.getAttribute("user_name").equals("")){
        
    }   else {
            response.sendRedirect("/software_nutricion/inicio.jsp");
            }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"css/styletabla1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("       \n");
      out.write("\t\t<meta charset=\"UTF-8\" />\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("\t\t<title>Circular Navigation - Demo 1 | Codrops</title>\n");
      out.write("\t\t<meta name=\"description\" content=\"Circular Navigation Styles - Building a Circular Navigation with CSS Transforms | Codrops \" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"css transforms, circular navigation, round navigation, circular menu, tutorial\" />\n");
      out.write("\t\t<meta name=\"author\" content=\"Sara Soueidan for Codrops\" />\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"../favicon.ico\">\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalizeM.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/demoM.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component1M.css\" />\n");
      out.write("\t\t<script src=\"js/modernizr-2.6.2M.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var _gaq = _gaq || [];\n");
      out.write("_gaq.push(['_setAccount', 'UA-7243260-2']);\n");
      out.write("_gaq.push(['_trackPageview']);\n");
      out.write("(function() {\n");
      out.write("var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("})();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    \n");
      out.write("              \n");
      out.write("        \n");
      out.write("\t</head>\n");
      out.write("\t<body   background=\"fondo_verde.jpg\">\n");
      out.write("          <header>\n");
      out.write("              \n");
      out.write("                <center>\n");
      out.write("                    \n");
      out.write("                    <div class=\"addthis_toolbox addthis_32x32_style addthis_default_style\">\n");
      out.write("\t\t\t\t<nav class=\"codrops-demos\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a  href=\"http://localhost:8080/software_nutricion/Menu1.jsp\">Menu 1</a>\n");
      out.write("                                        <a href=\"http://localhost:8080/software_nutricion/Menu2.jsp\">Menu 2</a>\n");
      out.write("                                        <a href=\"http://localhost:8080/software_nutricion/Menu3.jsp\">Menu 3</a>\n");
      out.write("                                        <a href=\"http://localhost:8080/software_nutricion/Menu4.jsp\">Menu 4</a>\n");
      out.write("                                        <a href=\"http://localhost:8080/software_nutricion/Menu5.jsp\">Menu 5</a>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("              </div>\n");
      out.write("                </center>\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<!-- Top Navigation -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"component\">\n");
      out.write("\t\t\t\t<!-- Start Nav Structure -->\n");
      out.write("\t\t\t\t<button class=\"cn-button\" id=\"cn-button\">+</button>\n");
      out.write("\t\t\t\t<div class=\"cn-wrapper\" id=\"cn-wrapper\">\n");
      out.write("\t\t\t\t    <ul>\n");
      out.write("\t\t\t\t      <li><a href=\"http://localhost:8080/software_nutricion/Metas_Paciente.jsp\"><img src=\"metas.png\">  </a></li>\n");
      out.write("\t\t\t\t      <li><a href=\"http://localhost:8080/software_nutricion/MenuPlegableDietas.jsp\"><img src=\"dieta2.png\" alt =\"\"></a></li>\n");
      out.write("\t\t\t\t      <li><a href=\"http://localhost:8080/software_nutricion/MenuPlegable.jsp\"><img src=\"c.png\"> </a></li>\n");
      out.write("      <li><a  style=\"float:right\" href=\"logout\"> <img src=\"cerrar.png\" alt =\"\"> </a></li>\n");
      out.write("\t\t\t\t      <li><a href=\"http://localhost:8080/software_nutricion/Mensaje_Menu.jsp\"><img src=\"carta.png\"></a></li>\n");
      out.write("\t\t\t\t     </ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"cn-overlay\" class=\"cn-overlay\"></div>\n");
      out.write("\t\t\t\t<!-- End Nav Structure -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!-- /container -->\n");
      out.write("\t\t<script src=\"js/polyfillsM.js\"></script>\n");
      out.write("\t\t<script src=\"js/demo1M.js\"></script>\n");
      out.write("\t\t<!-- For the demo ad only -->   \n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("        \n");
      out.write("        ");
 
    //Conexcion a la base de datos
        Connection conexion;
        
        String Driver="org.postgresql.Driver";
       
        Class.forName(Driver);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos de Menu 1 pacientes");
        }
        
      
    
      out.write("\n");
      out.write("        \n");
      out.write("          ");
 
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



  
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"table1 col-lg-12\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("<table  class=\"table table-hover\">   \n");
      out.write("    <tr >Dia : ");
out.println(menu3);
      out.write("</tr>\n");
      out.write("    <th style=\"background-color:#00FFFF\"> </th>\n");
      out.write("    <th style=\"background-color:#00FFFF\"><h3>nombre_platillo</h3></th>\n");
      out.write("    <th style=\"background-color:#00FFFF\"> <h3>ingredientes</h3></th>\n");
      out.write("    <th style=\"background-color:#00FFFF\"> <h3>tiempo_preparacion</h3></th>\n");
      out.write("    <th style=\"background-color:#00FFFF\"> <h3>instrucciones</h3></th>\n");
      out.write("    <th style=\"background-color:#00FFFF\"> <h3>calorias</h3></th>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    ");

 PreparedStatement d_3;
        ResultSet desayuno_3;
      d_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+desayuno3+"'"); 
         System.err.println("query de nombre del platillo es = "+d_3);

        desayuno_3=d_3.executeQuery();
        while(desayuno_3.next()){



      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>Desayuno</td>\n");
      out.write("        <td > ");
out.println(desayuno3);
      out.write(" </td>\n");
      out.write("        <th  class=\"text-center\">");
      out.print(desayuno_3.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(desayuno_3.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(desayuno_3.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(desayuno_3.getString("calorias"));
      out.write("</th>\n");
      out.write("        \n");
}
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");

 PreparedStatement b_3;
        ResultSet bebida_3;
      b_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida3+"'"); 
         System.err.println("query de nombre del platillo es = "+b_3);

        bebida_3=b_3.executeQuery();
        while(bebida_3.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- BEBIDA 2-- DESAYUNO -->\n");
      out.write("                   <th  style=\"background-color:#0080FF\">  bebida</th> \n");
      out.write("                            <td> ");
out.println(bebida3);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(bebida_3.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_3.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_3.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_3.getString("calorias"));
      out.write("</th>\n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");
}
      out.write("\n");
      out.write("                      </tr>\n");
      out.write("                ");

 PreparedStatement c_3;
        ResultSet comida_3;
      c_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+comida3+"'"); 
         System.err.println("query de nombre del platillo es = "+c_3);

        comida_3=c_3.executeQuery();
        while(comida_3.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- comida2 -->\n");
      out.write("                   <th  style=\"background-color:#0080FF\">Comida</th> \n");
      out.write("                            <td> ");
out.println(comida3);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(comida_3.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(comida_3.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(comida_3.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(comida_3.getString("calorias"));
      out.write("</th>\n");
      out.write("     \n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                 ");
 } 
      out.write(" \n");
      out.write("         ");

 PreparedStatement b_33;
        ResultSet bebida_33;
      b_33=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida33+"'"); 
         System.err.println("query de nombre del platillo es = "+b_33);

        bebida_33=b_33.executeQuery();
        while(bebida_33.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- BEBIDA 22 -- comida -->\n");
      out.write("                   <th  style=\"background-color:#0080FF\">Bebida:</th> \n");
      out.write("                            <td> ");
out.println(bebida33);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(bebida_33.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_33.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_33.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_33.getString("calorias"));
      out.write("</th>\n");
      out.write("       \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("        \n");
      out.write("                   ");

 PreparedStatement cen_3;
        ResultSet cena_3;
      cen_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+cena3+"'"); 
         System.err.println("query de nombre del platillo es = "+cen_3);

        cena_3=cen_3.executeQuery();
        while(cena_3.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- CENA 2 -->\n");
      out.write("                   <th  style=\"background-color:#0080FF\">Cena:</th> \n");
      out.write("                            <td> ");
out.println(cena3);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(cena_3.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(cena_3.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(cena_3.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(cena_3.getString("calorias"));
      out.write("</th>\n");
      out.write("      \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>  \n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("                \n");
      out.write("                      ");

 PreparedStatement b_333;
        ResultSet bebida_333;
      b_333=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida333+"'"); 
         System.err.println("query de nombre del platillo es = "+b_333);

        bebida_333=b_333.executeQuery();
        while(bebida_333.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- CENA 2 BEBIDA 2 -->\n");
      out.write("                   <th  style=\"background-color:#0080FF\">Bebida:</th> \n");
      out.write("                            <td> ");
out.println(bebida333);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(bebida_333.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_333.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_333.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_333.getString("calorias"));
      out.write("</th>\n");
      out.write("    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>  \n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                \n");
      out.write("                 ");

 PreparedStatement cola_3;
        ResultSet colacion_3;
      cola_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+colacion3+"'"); 
         System.err.println("query de nombre del platillo es = "+cola_3);

        colacion_3=cola_3.executeQuery();
        while(colacion_3.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- CENA 2 -->\n");
      out.write("                   <th  style=\"background-color:#0080FF\" >Colacion:</th> \n");
      out.write("                            <td> ");
out.println(colacion3);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(colacion_3.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_3.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_3.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_3.getString("calorias"));
      out.write("</th>\n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                </tr>  \n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                 ");

 PreparedStatement ce_3;
        ResultSet colacion_extra_3;
      ce_3=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce3+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_3);

        colacion_extra_3=ce_3.executeQuery();
        while(colacion_extra_3.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- COLACION EXTRA -->\n");
      out.write("                   <th  style=\"background-color:#0080FF\">Colacion extra 1:</th> \n");
      out.write("                            <td> ");
out.println(ce3);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(colacion_extra_3.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_3.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_3.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_3.getString("calorias"));
      out.write("</th>\n");
      out.write("     \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>    \n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("                \n");
      out.write("                      ");

 PreparedStatement ce_33;
        ResultSet colacion_extra_33;
      ce_33=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce33+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_33);

        colacion_extra_33=ce_33.executeQuery();
        while(colacion_extra_33.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- CENA 1 -->\n");
      out.write("                   <th  style=\"background-color:#0080FF\"> Colacion extra 2:</th> \n");
      out.write("                            <td> ");
out.println(ce33);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(colacion_extra_33.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_33.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_33.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_33.getString("calorias"));
      out.write("</th>\n");
      out.write("      \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>    \n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        \n");
      out.write("            </table>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("                    <div id='cssmenu'>\n");
      out.write("  </div>  </div>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
