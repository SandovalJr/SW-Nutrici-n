package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class eliminarR_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <script src=\"js/BuscadorTabla.js\" type=\"text/javascript\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   <meta charset='utf-8'>\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("   <script src=\"http://code.jquery.com/jquery-latest.min.js\" type=\"text/javascript\"></script>\n");
      out.write("   <script src=\"script.js\"></script>\n");
      out.write("   <title>CSS MenuMaker</title> <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body  background=\"fondo_verde.jpg\" >\n");
      out.write("   \n");
      out.write("       <div style=\"float:right\" >\n");
      out.write("           <h4>  ");
      out.print(user_name);
      out.write(" </h4>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("  <div id='cssmenu'>\n");
      out.write("      <li><a  style=\"float:right\" href=\"logout\"> <img src=\"cerrar.png\"> </a></li>\n");
      out.write("  </div>   \n");
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
      out.write("            <li><a href='http://localhost:8080/software_nutricion/colaciones.jsp'><span>Colación</span></a></li> \n");
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
            System.out.println("Conexion exitosa a la base de datos");
        }
        
        //Empezamos listado los datos de la tabla usuario
        PreparedStatement ps;
        ResultSet rs;
        ps=conexion.prepareStatement("SELECT nombre_apellido as nombrep,edad,escolaridad,civil,ocupacion,motivo_consulta,antecedentes_heredados,medicamentos,tabaco,alcohol,drogas,enfermedadesapp,alergias_alimentariosapp,alimentos_desagradablesapp,user_name,password,id FROM software_nutricion.\"Pacientes_Expediente\""); 
        rs=ps.executeQuery();
    
      out.write("\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <div class=\"container tabla\">\n");
      out.write("        \n");
      out.write("        <div style=\"position: absolute; left: 1%\">\n");
      out.write("            \n");
      out.write("          <div class=\"d-flex\">  \n");
      out.write("              \n");
      out.write("                  <div class=\"card col-lg-15\">\n");
      out.write("           <h3>Buscar por ID:</h3>\n");
      out.write("    <input id=\"searchTerm\" type=\"text\" onkeyup=\"doSearch()\" />\n");
      out.write("               \n");
      out.write("    <table  class=\"table table-hover\" id=\"datos\" >        \n");
      out.write("        <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"background-color:#FFFF00\">nombre_apellido</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">edad</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">escolaridad</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">civil</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">ocupacion</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">motivo_consulta</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">antecedentes_heredados</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">medicamentos</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">tabaco</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">alcohol</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">drogas</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">enfermedadesapp</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">alergias_alimentariosapp</th>\n");
      out.write("                <th style=\"background-color:#FFFF00\">alimentos_desgradables</th>\n");
      out.write("\n");
      out.write("                 <th style=\"background-color:#FFFF00\">user_name</th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\">password</th>\n");
      out.write("                                         <th style=\"background-color:#FFFF00\">ID</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("        </thead>\n");
      out.write("                    \n");
      out.write("                    ");
 
                    while(rs.next()){
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("nombrep"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("edad"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("escolaridad"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("civil"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("ocupacion"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("motivo_consulta"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("antecedentes_heredados"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("medicamentos"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("tabaco"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("alcohol"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("drogas"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("enfermedadesapp"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("alergias_alimentariosapp"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("alimentos_desagradablesapp"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("user_name"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getString("password"));
      out.write("</th>\n");
      out.write("                        <th class=\"text-center\">");
      out.print(rs.getInt("id"));
      out.write("</th>\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("    <a href=\"eliminar.jsp?id=");
      out.print(rs.getInt("id"));
      out.write("\"><img src=\"boton-x.png\"></a>\n");
      out.write("    <a href=\"editar_exp.jsp?nombrep=");
      out.print(rs.getString("nombrep"));
      out.write("\"><img src=\"editar2.png\"></a>\n");
      out.write("    <a href=\"ver_expediente.jsp?nombrep=");
      out.print(rs.getString("nombrep"));
      out.write("\"><img src=\"ojo.png\"></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                \n");
      out.write("            </table>            \n");
      out.write("             </div>              </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("                  <br>  \n");
      out.write("                   <br>  \n");
      out.write("                    <br>  \n");
      out.write("                    <br> \n");
      out.write("                    <br>  \n");
      out.write("                   <br>  \n");
      out.write("                    <br>  \n");
      out.write("                    <br>  \n");
      out.write("                    <br>  \n");
      out.write("                   <br>  \n");
      out.write("                    <br>  \n");
      out.write("                    <br>  <br>  \n");
      out.write("                   <br>  \n");
      out.write("                    <br>  \n");
      out.write("                    <br>  \n");
      out.write("                    <br><br>  \n");
      out.write("                    <br>    \n");
      out.write("                    <br>  \n");
      out.write("                    \n");
      out.write("                    <center>\n");
      out.write("    <div class=\"addthis_toolbox addthis_32x32_style addthis_default_style\"><img src=\"corazon.png\" width=\"400\" height=\"400\" alt=\"\"/></div>\n");
      out.write("</center>\n");
      out.write("   \n");
      out.write("</html>\n");
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
