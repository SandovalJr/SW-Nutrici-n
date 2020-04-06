package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");

    String user_name = (String) session.getAttribute("user_name");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if (session.getAttribute("user_name") != null
            && !session.getAttribute("user_name").equals("")) {

    } else {
        response.sendRedirect("/software_nutricion/inicio.jsp");
    }

      out.write("\n");
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        <!-- SWEET ALERT-->\n");
      out.write("        <script src=\"js/sweetalert.min.js\"> </script>\n");
      out.write(" <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("        <meta charset='utf-8'>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Registrar Expediente</title>\n");
      out.write("\n");
      out.write("    <div style=\"position: fixed; rigth: 75%\"><img src=\"software_nutricion/Login_v5/images/icons/logo_nutricion.png\" width=\"250\" height=\"250\" alt=\"\"/></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<div style=\"float:right\" >\n");
      out.write("    ");
      out.print(user_name);
      out.write("\n");
      out.write("</div>\n");
      out.write("<body background=\"imagenes2.jpg\">\n");
      out.write("\n");
      out.write("    <div id='cssmenu'>\n");
      out.write("        <li><a  style=\"float:right\" href=\"logout\"> <img src=\"cerrar.png\"> </a></li>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id='cssmenu'>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href='http://localhost:8080/software_nutricion/Menu.jsp'><img src=\"casa.png\"></a></li>\n");
      out.write("            <li class='active has-sub'><a href='#'><span>Recetas</span></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href='http://localhost:8080/software_nutricion/desayuno.jsp'><span>Desayuno</span></a></li>\n");
      out.write("                    <li><a href='http://localhost:8080/software_nutricion/comida.jsp'><span>Comida</span></a></li>\n");
      out.write("                    <li><a href='http://localhost:8080/software_nutricion/cena.jsp'><span>Cena</span></a></li>\n");
      out.write("                    <li><a href='http://localhost:8080/software_nutricion/colaciones.jsp'><span>Colación</span></a></li>  \n");
      out.write("                                          <li><a href='http://localhost:8080/software_nutricion/Bebidas.jsp'><span>Bebidas</span></a></li>  \n");
      out.write("\n");
      out.write("                    <a href=\"recetas_registro.jsp\" > <img src=\"mas.png\">  </a>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class='active has-sub'><a href='#'><span>Expedientes</span></a>\n");
      out.write("                <ul>\n");
      out.write("\n");
      out.write("                    <li><a href='http://localhost:8080/software_nutricion/registro.jsp'><span>Añadir</span></a></li>\n");
      out.write("\n");
      out.write("                    <li><a href='http://localhost:8080/software_nutricion/eliminarR.jsp'><span>Eliminar</span></a></li>\n");
      out.write("                    <li><a href='#'><span>Buscar</span></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href='http://localhost:8080/software_nutricion/dietas.jsp'><span>Dietas</span></a></li>\n");
      out.write("            <li><a href='#'><span>Mensajes</span></a></li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write(" \n");
      out.write(" <script>\n");
      out.write("  swal (\" ¡Hola mundo! \");\n");
      out.write(" </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"registrar\" method=\"POST\">\n");
      out.write("    <center>\n");
      out.write("        <div class=\"addthis_toolbox addthis_32x32_style addthis_default_style\" >   \n");
      out.write("            <table border=\"0\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Nombre Completo :</th>\n");
      out.write("                    <th><input type=\"text\" name=\"nombre_apellido\" value = \"\" size=\"40\" required></th>\n");
      out.write("                    <td>Consumes Alcohol: Si <input type=\"radio\" name=\"alcohol\" value = \"si\" size=\"20\"></td>\n");
      out.write("                    <td>No<input type=\"radio\" name=\"alcohol\" value = \"no\" size=\"20\"></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tbody>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Edad:</td>\n");
      out.write("                        <td> <input type=\"text\" name=\"edad\" value = \"\" size=\"40\" required></td>\n");
      out.write("                        <td>Consumes Tabaco:   Si <input type=radio name=\"tabaco\" value = \"si\" size=\"20\"></td>\n");
      out.write("                        <td> No<input type=radio name=\"tabaco\" value = \"no\" size=\"20\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Escolaridad:</td>\n");
      out.write("                        <td> <input type=\"text\" name=\"escolaridad\" value = \"\" size=\"40\"></td>\n");
      out.write("                        <td>Consumes Drogas:   Si <input type=\"radio\" name=\"drogas\" value = \"si\" size=\"20\"></td>\n");
      out.write("                        <td>No<input type=\"radio\" name=\"drogas\" value =\"no\" size=\"20\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Estado Civil:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"civil\" value = \"\" size=\"40\"></td> \n");
      out.write("                        <td>Enfermedades(APP):</td>\n");
      out.write("                        <td> <input type=\"text\" name=\"enfermedadesapp\" value = \"\" size=\"30\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Motivo de la consulta:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"motivo_consulta\" value = \"\" size=\"40\"></td>\n");
      out.write("                        <td>Algun alimento desagradable:</td>\n");
      out.write("          <th>  <textarea style=\"font-size:15px\" rows=\"5\" cols=\"26\" type=\"text\"  name=\"alimentos_desagradablesapp\" ></textarea></th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Ocupacion:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"ocupacion\" value = \"\" size=\"40\"></td>\n");
      out.write("                        <td>Alguna alergia alimentaria:(APP)</td>\n");
      out.write("                        <td><input type=\"text\" name=\"alergias_alimentariosapp\" value = \"\" size=\"30\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                <td>¿Tomas medicamentos?¿Cuales?:</td>\n");
      out.write("                <td><input type=\"text\" name=\"medicamentos\" value = \"\" size=\"40\"></td>\n");
      out.write("                <td>Usuario:</td>\n");
      out.write("                <td><input type=\"text\" name=\"user_name\" value = \"\" size=\"30\" required></td> \n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>Antecedentes heredados:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"antecedentes_heredados\" value = \"\" size=\"40\"></td>\n");
      out.write("\n");
      out.write("                    <td>Contraseña:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"password\" value = \"\" size=\"30\" required></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <center>\n");
      out.write("            <div class=\"addthis_toolbox addthis_32x32_style addthis_default_style\" >\n");
      out.write("                <button style='width:120px; height:50px' class=\"login100-form-btn\"> <img src=\"agregar.png\"> </button>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </center>\n");
      out.write("        <div>\n");
      out.write("       \n");
      out.write("         \n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("            </html>");
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
