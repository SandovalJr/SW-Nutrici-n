package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class dietas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("\n");

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
      out.write("<html lang=''>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("   <meta charset='utf-8'>\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("   <script src=\"http://code.jquery.com/jquery-latest.min.js\" type=\"text/javascript\"></script>\n");
      out.write("   <script src=\"script.js\"></script>\n");
      out.write("   <title>CSS MenuMaker</title> <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("      <div style=\"position: fixed; left: 2%\"><img src=\"software_nutricion/Login_v5/images/icons/logo_nutricion.png\" width=\"300\" height=\"300\" alt=\"\"/></div>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body  background=\"fondo_verde.jpg\" >\n");
      out.write("  <div style=\"float:right\" >\n");
      out.write("      <h3>");
      out.print(user_name);
      out.write("</h3>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <div id='cssmenu'>\n");
      out.write("      <li><a  style=\"float:right\" href=\"logout\"> <img src=\"cerrar.png\" alt =\"\"> </a></li>\n");
      out.write("  </div>\n");
      out.write("             \n");
      out.write("\n");
      out.write("<div id='cssmenu'>\n");
      out.write("  \n");
      out.write("<ul>\n");
      out.write("\t <li><a href='http://localhost:8080/software_nutricion/Menu.jsp'><img src=\"casa.png\"></a></li>\n");
      out.write("   <li class='active has-sub'><a href='#'><span>Recetas</span></a>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href='http://localhost:8080/software_nutricion/desayuno.jsp'><span>Desayuno</span></a></li>\n");
      out.write("             <li><a href='http://localhost:8080/software_nutricion/comida.jsp'><span>Comida</span></a></li>\n");
      out.write("\t\t   <li><a href='http://localhost:8080/software_nutricion/cena.jsp'><span>Cena</span></a></li>\n");
      out.write("            <li><a href='http://localhost:8080/software_nutricion/colaciones.jsp'><span>Colación</span></a></li>  \n");
      out.write("                   <li><a href='http://localhost:8080/software_nutricion/Bebidas.jsp'><span>Bebidas</span></a></li>  \n");
      out.write("\n");
      out.write("             <a href=\"recetas_registro.jsp\" > <img src=\"mas.png\">  </a>\n");
      out.write("      </ul>\n");
      out.write("   </li>\n");
      out.write("  <li class='active has-sub'><a href='#'><span>Expedientes</span></a>\n");
      out.write("      <ul>\n");
      out.write("         \n");
      out.write("        <li><a href='http://localhost:8080/software_nutricion/registro.jsp'><span>Añadir</span></a></li>\n");
      out.write("        \n");
      out.write("             <li><a href='http://localhost:8080/software_nutricion/eliminarR.jsp'><span>Eliminar</span></a></li>\n");
      out.write("\t\t   <li><a href='http://localhost:8080/software_nutricion/Buscar_Expediente.jsp'><span>Buscar</span></a></li>\n");
      out.write("      </ul>\n");
      out.write("   </li> \n");
      out.write("    <li><a href='http://localhost:8080/software_nutricion/dietas.jsp'><span>Dietas</span></a></li>\n");
      out.write("                <li><a href='http://localhost:8080/software_nutricion/metas_registro.jsp'><span>Metas</span></a></li>\n");
      out.write("\n");
      out.write("\t <li><a href='http://localhost:8080/software_nutricion/Mensajes_Menu.jsp'><span>Mensajes</span></a></li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
 
    //Conexcion a la base de datos
        Connection conexion;
        
        String Driver="org.postgresql.Driver";
       
        Class.forName(Driver);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos de agregar dieta");
        }
        
        //Empezamos listado los datos de la tabla usuario
        PreparedStatement ps;
        ResultSet rs;
        ps=conexion.prepareStatement("SELECT nombre_apellido,edad,escolaridad,civil,ocupacion,motivo_consulta,antecedentes_heredados,medicamentos,tabaco,alcohol,drogas,enfermedadesapp,alergias_alimentariosapp,alimentos_desagradablesapp,user_name as user,password,id FROM software_nutricion.\"Pacientes_Expediente\" WHERE user_name != 'admin'"); 
        rs=ps.executeQuery();
        
    
      out.write("\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    <br> <br>\n");
      out.write("    \n");
      out.write("    <div class=\"container tabla\">\n");
      out.write("        <div style=\"position: absolute; left: 27%\">\n");
      out.write("                    <div class=\"addthis_toolbox addthis_32x32_style addthis_default_style\"><b><h1>Agregar Dieta </h1></b></div>\n");
      out.write("            <div class=\"d-flex\"> \n");
      out.write("                  <div class=\"card col-lg-15\">\n");
      out.write("                      \n");
      out.write("    <table class=\"display sando\" class=\"table table-hover\">  \n");
      out.write("      \n");
      out.write("        <thead>\n");
      out.write("         <tr>\n");
      out.write("         \n");
      out.write("             <th style=\"background-color:#FFFF00\">\n");
      out.write("              \n");
      out.write("                 <h3>  User Name  </h3></th> \n");
      out.write("                    \n");
      out.write("\n");
      out.write("             <th style=\"background-color:#FFFF00\">  </th></tr>\n");
      out.write("        </thead>\n");
      out.write("         \n");
      out.write("                    ");
 
                    while(rs.next()){
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"text-center\"><h4>");
      out.print(rs.getString("user"));
      out.write("</h4></th>\n");
      out.write("                       \n");
      out.write("                    <td>\n");
      out.write("                       \n");
      out.write("                        <a href=\"dieta_registro.jsp?user=");
      out.print(rs.getString("user"));
      out.write("&user_name=");
      out.print(user_name);
      out.write("\"> <img src=\"mas.png\">  </a> \n");
      out.write("\n");
      out.write("                         <!-- FALTA PONER EDITAR A FUNCIONAR -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("             </div>  </div>\n");
      out.write("    </div>\n");
      out.write("                ");
    
                       PreparedStatement dieta;
        ResultSet d;
    dieta=conexion.prepareStatement("SELECT id,user_name as user,menu1,desayuno1,comida1,colacion1,cena1,menu2,desayuno2,comida2,colacion2,cena2,menu3,desayuno3,comida3,colacion3,cena3,menu4,desayuno4,comida4,colacion4,cena4,menu5,desayuno5,comida5,colacion5,cena5,bebida1,bebida11,bebida111,bebida2,bebida22,bebida222,bebida3,bebida33,bebida333,bebida4,bebida44,bebida444,bebida5,bebida55,bebida555,ce1,ce11,ce2,ce22,ce3,ce33,ce4,ce44,ce5,ce55 FROM software_nutricion.\"dietas\" WHERE user_name != 'admin'"); 
        d=dieta.executeQuery();
        
    
      out.write("\n");
      out.write("       \n");
      out.write("    <div class=\"container tabla\">\n");
      out.write("        <div style=\"position: absolute; left: 55%\">\n");
      out.write("                <div class=\"addthis_toolbox addthis_32x32_style addthis_default_style\"><b><h1>Pacientes con dieta </h1></b></div>\n");
      out.write("\n");
      out.write("            <div class=\"d-flex\"> \n");
      out.write("                  <div class=\"card col-lg-15\">\n");
      out.write("                      \n");
      out.write("    <table class=\"display sando\" class=\"table table-hover\">  \n");
      out.write("        <thead >\n");
      out.write("         <tr>\n");
      out.write("         \n");
      out.write("             <th style=\"background-color:#FFFF00\">\n");
      out.write("              \n");
      out.write("                 <h3>  User Name  </h3></th> \n");
      out.write("                    \n");
      out.write("\n");
      out.write("             <th style=\"background-color:#FFFF00\"> \n");
      out.write("             \n");
      out.write("             </th></tr>\n");
      out.write("        </thead>\n");
      out.write("         \n");
      out.write("                    ");
 
                    while(d.next()){
                    
      out.write("\n");
      out.write("                    ");
      out.print(d.getString("id"));
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"text-center\"><h4>");
      out.print(d.getString("user"));
      out.write("</h4></th>\n");
      out.write("\n");
      out.write("                    <td >\n");
      out.write("                       \n");
      out.write("                        <a href=\"eliminar_dieta.jsp?id=");
      out.print(d.getInt("id"));
      out.write("&user_name=");
      out.print(user_name);
      out.write("\" >  <img src=\"boton-x.png\">  </a>\n");
      out.write("                        <a href=\"Editar_dieta_1.jsp?user=");
      out.print(d.getString("user"));
      out.write("&user_name=");
      out.print(user_name);
      out.write("\"> <img src=\"editar2.png\"> </a>\n");
      out.write(" <a href=\"ver_dieta.jsp?user=");
      out.print(d.getString("user"));
      out.write("&user_name=");
      out.print(user_name);
      out.write("\"> <img src=\"ojo.png\"> </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
                    
                    
      out.write("\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("             </div>  </div>\n");
      out.write("    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <br><br>\n");
      out.write("                    <br><br>\n");
      out.write("                    <br><br>\n");
      out.write("                    <br>                      <br> \n");
      out.write("                   <br>  <br>\n");
      out.write("\n");
      out.write("                    <br> <br>\n");
      out.write("                     <br> <br>\n");
      out.write("                    <br> <br>\n");
      out.write("                    <br> <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                   <a   style=\"position: absolute; left: 78%\"><img src=\"manzana.png\"></a>   \n");
      out.write("                        <a style=\"position: absolute; left: 2%\"><img src=\"manzana.png\"></a>       \n");
      out.write("                    \n");
      out.write("                        </div>\n");
      out.write("    </script>\n");
      out.write("</html>\n");
      out.write(" <link href=\"css/jquery.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <script src=\"js/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('.sando').DataTable();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("\n");
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
