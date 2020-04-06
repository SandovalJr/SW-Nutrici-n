package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Menu2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t\t      <li><a href=\"#\"><img src=\"metas.png\">  </a></li>\n");
      out.write("\t\t\t\t      <li><a href=\"http://localhost:8080/software_nutricion/MenuPlegableDietas.jsp\"><img src=\"dieta2.png\" alt =\"\"></a></li>\n");
      out.write("\t\t\t\t      <li><a href=\"http://localhost:8080/software_nutricion/MenuPlegable.jsp\"><img src=\"c.png\"> </a></li>\n");
      out.write("\t\t\t\t      <li><a href=\"#\"><img src=\"evolucion.png\"> </a></li>\n");
      out.write("\t\t\t\t      <li><a href=\"https://www.facebook.com/Nutricion.Tupeso.ideal/\"><img src=\"facebook.png\"></a></li>\n");
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
String desayuno2,menu2,bebida2,comida2,bebida22,cena2,bebida222,colacion2,ce2,ce22;

        System.out.println("LLEGO AL FROM");
 d=conexion.prepareStatement("SELECT id,user_name,menu2,desayuno2,comida2,colacion2,cena2,bebida2,bebida22,bebida222,ce2,ce22 FROM software_nutricion.\"dietas\" WHERE user_name='"+user_name+"'"); dietas=d.executeQuery();  
 System.err.println(d);
        while(dietas.next()){
            //dia que se establecia la dieta
                    menu2=dietas.getString("menu2");
                    //DESAYUNO
                   desayuno2=dietas.getString("desayuno2");
                   bebida2=dietas.getString("bebida2");
                   //COMIDA
                   comida2=dietas.getString("comida2");
                   bebida22=dietas.getString("bebida22");
                   //CENA
                   cena2=dietas.getString("cena2");
                   bebida222=dietas.getString("bebida222");
                   //COLACIONES
                   colacion2=dietas.getString("colacion2");
                   ce2=dietas.getString("ce2");
                   ce22=dietas.getString("ce22");



  
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"addthis_32x32_style \">\n");
      out.write("  <div class=\"table1 col-lg-12\" >\n");
      out.write("<table  class=\"table table-hover\">   \n");
      out.write("    <tr >Dia : ");
out.println(menu2);
      out.write("</tr>\n");
      out.write("    <th style=\"background-color:#FFFF00\"> </th>\n");
      out.write("    <th style=\"background-color:#FFFF00\"><h3>nombre_platillo</h3></th>\n");
      out.write("    <th style=\"background-color:#FFFF00\"> <h3>ingredientes</h3></th>\n");
      out.write("    <th style=\"background-color:#FFFF00\"> <h3>tiempo_preparacion</h3></th>\n");
      out.write("    <th style=\"background-color:#FFFF00\"> <h3>instrucciones</h3></th>\n");
      out.write("    <th style=\"background-color:#FFFF00\"> <h3>calorias</h3></th>\n");
      out.write("    <th style=\"background-color:#FFFF00\"> <h3>estatus</h3></th>\n");
      out.write("    <th style=\"background-color:#FFFF00\"><h3>imagen</h3></th>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("              \n");

 PreparedStatement d_2;
        ResultSet desayuno_2;
      d_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+desayuno2+"'"); 
         System.err.println("query de nombre del platillo es = "+d_2);

        desayuno_2=d_2.executeQuery();
        while(desayuno_2.next()){



      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>Desayuno</td>\n");
      out.write("        <td> ");
out.println(desayuno2);
      out.write(" </td>\n");
      out.write("        <th class=\"text-center\">");
      out.print(desayuno_2.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(desayuno_2.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(desayuno_2.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(desayuno_2.getString("calorias"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(desayuno_2.getString("estatus"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(desayuno_2.getString("imagen"));
      out.write("</th>\n");
      out.write("\n");
}
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");

 PreparedStatement b_2;
        ResultSet bebida_2;
      b_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida2+"'"); 
         System.err.println("query de nombre del platillo es = "+b_2);

        bebida_2=b_2.executeQuery();
        while(bebida_2.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- BEBIDA 2-- DESAYUNO -->\n");
      out.write("                   <th>bebida</th> \n");
      out.write("                            <td> ");
out.println(bebida2);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(bebida_2.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_2.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_2.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_2.getString("calorias"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_2.getString("estatus"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_2.getString("imagen"));
      out.write("</th>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");
}
      out.write("\n");
      out.write("                      </tr>\n");
      out.write("                ");

 PreparedStatement c_2;
        ResultSet comida_2;
      c_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+comida2+"'"); 
         System.err.println("query de nombre del platillo es = "+c_2);

        comida_2=c_2.executeQuery();
        while(comida_2.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- comida2 -->\n");
      out.write("                   <th>Comida</th> \n");
      out.write("                            <td> ");
out.println(comida2);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(comida_2.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(comida_2.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(comida_2.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(comida_2.getString("calorias"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(comida_2.getString("estatus"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(comida_2.getString("imagen"));
      out.write("</th>\n");
      out.write("\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                 ");
 } 
      out.write(" \n");
      out.write("         ");

 PreparedStatement b_22;
        ResultSet bebida_22;
      b_22=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida22+"'"); 
         System.err.println("query de nombre del platillo es = "+b_22);

        bebida_22=b_22.executeQuery();
        while(bebida_22.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- BEBIDA 22 -- comida -->\n");
      out.write("                   <th>Bebida:</th> \n");
      out.write("                            <td> ");
out.println(bebida22);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(bebida_22.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_22.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_22.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_22.getString("calorias"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_22.getString("estatus"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_22.getString("imagen"));
      out.write("</th>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("        \n");
      out.write("                   ");

 PreparedStatement cen_2;
        ResultSet cena_2;
      cen_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+cena2+"'"); 
         System.err.println("query de nombre del platillo es = "+cen_2);

        cena_2=cen_2.executeQuery();
        while(cena_2.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- CENA 2 -->\n");
      out.write("                   <th>Cena:</th> \n");
      out.write("                            <td> ");
out.println(cena2);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(cena_2.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(cena_2.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(cena_2.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(cena_2.getString("calorias"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(cena_2.getString("estatus"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(cena_2.getString("imagen"));
      out.write("</th>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>  \n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("                \n");
      out.write("                      ");

 PreparedStatement b_222;
        ResultSet bebida_222;
      b_222=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+bebida222+"'"); 
         System.err.println("query de nombre del platillo es = "+b_222);

        bebida_222=b_222.executeQuery();
        while(bebida_222.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- CENA 2 BEBIDA 2 -->\n");
      out.write("                   <th>Bebida:</th> \n");
      out.write("                            <td> ");
out.println(bebida222);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(bebida_222.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_222.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_222.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_222.getString("calorias"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_222.getString("estatus"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(bebida_222.getString("imagen"));
      out.write("</th>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>  \n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                \n");
      out.write("                 ");

 PreparedStatement cola_2;
        ResultSet colacion_2;
      cola_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+colacion2+"'"); 
         System.err.println("query de nombre del platillo es = "+cola_2);

        colacion_2=cola_2.executeQuery();
        while(colacion_2.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- CENA 2 -->\n");
      out.write("                   <th>Colacion:</th> \n");
      out.write("                            <td> ");
out.println(colacion2);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(colacion_2.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_2.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_2.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_2.getString("calorias"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_2.getString("estatus"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_2.getString("imagen"));
      out.write("</th>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>  \n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                 ");

 PreparedStatement ce_2;
        ResultSet colacion_extra_2;
      ce_2=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce2+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_2);

        colacion_extra_2=ce_2.executeQuery();
        while(colacion_extra_2.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- COLACION EXTRA -->\n");
      out.write("                   <th>Colacion extra 1:</th> \n");
      out.write("                            <td> ");
out.println(ce2);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(colacion_extra_2.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_2.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_2.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_2.getString("calorias"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_2.getString("estatus"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_2.getString("imagen"));
      out.write("</th>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>    \n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("                \n");
      out.write("                      ");

 PreparedStatement ce_22;
        ResultSet colacion_extra_22;
      ce_22=conexion.prepareStatement("SELECT nombre_platillo,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo ='"+ce22+"'"); 
         System.err.println("query de nombre del platillo es = "+ce_22);

        colacion_extra_22=ce_22.executeQuery();
        while(colacion_extra_22.next()){



      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <!-- CENA 1 -->\n");
      out.write("                   <th>Colacion extra 2:</th> \n");
      out.write("                            <td> ");
out.println(ce22);
      out.write(" </td>\n");
      out.write(" <th class=\"text-center\">");
      out.print(colacion_extra_22.getString("ingredientes"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_22.getString("tiempo_preparacion"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_22.getString("instrucciones"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_22.getString("calorias"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_22.getString("estatus"));
      out.write("</th>\n");
      out.write("        <th class=\"text-center\">");
      out.print(colacion_extra_22.getString("imagen"));
      out.write("</th>\n");
      out.write("\n");
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
      out.write("      <li><a  style=\"float:right\" href=\"logout\"> <img src=\"cerrar.png\" alt =\"\"> </a></li>\n");
      out.write("  </div>   </div>   </div>\n");
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
