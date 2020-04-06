package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class metas_005fformulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
 
    
    String user= request.getParameter("user");
   String user_n=request.getParameter("user_n");

    
    String user_name=(String) session.getAttribute("user_name");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("    ");

        if(session.getAttribute("user_name") !=null
                && !session.getAttribute("user_name").equals("")){
        
    }   else {
            response.sendRedirect("/software_nutricion/inicio.jsp");
            }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    //Conexcion a la base de datos
        Connection conexion;
        
        String Driver="org.postgresql.Driver";
       
        Class.forName(Driver);
        conexion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/software_nutricion","postgres","sandoval123");
        if (!conexion.isClosed()){
            System.out.println("Conexion exitosa a la base de datos");
        }
        
       
        
        
    
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<html lang=''>\n");
      out.write("<head>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<link href=\"css/styletabla1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("    \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   <meta charset='utf-8'>\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("   <script src=\"http://code.jquery.com/jquery-latest.min.js\" type=\"text/javascript\"></script>\n");
      out.write("   <script src=\"script.js\"></script>\n");
      out.write(" \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   <title>Bienvenido Nutrilogo</title>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body  background=\"fondo_verde.jpg\" >\n");
      out.write("  <div style=\"float:right\" >\n");
      out.write("      ");
      out.print(user_name);
      out.write("\n");
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
      out.write("   <li class='active has-sub'><a href='#'><span>Expedientes</span></a>\n");
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
      out.write("    <div style=\"position: fixed; rigth: 75%\"><img src=\"software_nutricion/Login_v5/images/icons/logo_nutricion.png\" width=\"250\" height=\"250\" alt=\"\"/></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div style=\"position: fixed; left:76%\">\n");
      out.write("        <br><br><br><br>  <br><br><br><br>  <br><br><br><br>\n");
      out.write("         <img  src=\"mono.png\" width=\"700\" height=\"500\"  alt=\"\"/></div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("   \n");
      out.write("  <br>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("<form action=\"registrar_metas\" method=\"POST\">\n");
      out.write("  <div style=\"position: absolute; left: 17%\" >\n");
      out.write("           <div class=\"\">  \n");
      out.write("                  <div   class=\"card col-lg-15\">\n");
      out.write("    <table   class=\"table table-hover\">\n");
      out.write("        <td style=\"background-color:#FFFF00\"><b>USER_NAME</b></td>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <td> <input  type=\"text\" name=\"user_name\"  readonly=\"\" value = \"");
      out.print( user);
      out.write("\" size=\"40\" ></td>\n");
      out.write("                <tr>\n");
      out.write("                    <th style=\"background-color:#A4A4A4\">META 1</th>\n");
      out.write("                   <td style=\"background-color:#A4A4A4\"> \n");
      out.write("                     \n");
      out.write("                    <td > \n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                     <th style=\"background-color:#A4A4A4\">META 2</th>\n");
      out.write("                    <td style=\"background-color:#A4A4A4\"> \n");
      out.write("\n");
      out.write("                   \n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                     <th style=\"background-color:#A4A4A4\">Objetivo 1 </th>\n");
      out.write("                    <th><input type=\"text\" name=\"meta1\" value = \"\" size=\"40\" required></th>\n");
      out.write("           \n");
      out.write("</td>\n");
      out.write("                </select>\n");
      out.write("                        \n");
      out.write("                           <td> </td>\n");
      out.write("                     <th style=\"background-color:#A4A4A4\">Objetivo 2 </th>\n");
      out.write("                                 <th><input type=\"text\" name=\"meta2\" value = \"\" size=\"40\"  required></th>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Descripcion 1:</td>\n");
      out.write("            <th>  <textarea style=\"font-size:15px\" rows=\"5\" cols=\"43\" type=\"text\"  name=\"descripcion1\"required ></textarea></th>\n");
      out.write("\n");
      out.write("                     \n");
      out.write("               \n");
      out.write("                     \n");
      out.write("                    <td></td>\n");
      out.write("                         <td>Descripcion 2:</td>\n");
      out.write("            <th>  <textarea style=\"font-size:15px\" rows=\"5\" cols=\"43\" type=\"text\"  name=\"descripcion2\"  required ></textarea></th>\n");
      out.write("\n");
      out.write("        \n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                  </tbody>\n");
      out.write("                  \n");
      out.write("             <table   class=\"table table-hover\">\n");
      out.write("      \n");
      out.write("        \n");
      out.write("     <tr>\n");
      out.write("                   <th style=\"background-color:#A4A4A4\">META 3</th>\n");
      out.write("                   <td style=\"background-color:#A4A4A4\"> \n");
      out.write("                  </tr>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                     <th style=\"background-color:#A4A4A4\">Objetivo 3 </th>\n");
      out.write("                    <th><input type=\"text\" name=\"meta3\" value = \"\" size=\"40\"  required></th>\n");
      out.write("           </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Descripcion 3:</td>\n");
      out.write("            <th>  <textarea style=\"font-size:15px\" rows=\"5\" cols=\"43\" type=\"text\"  name=\"descripcion3\" required ></textarea></th>\n");
      out.write("            <th>\n");
      out.write("                    <div style=\"position: absolute; left: 70%\" >\n");
      out.write("                <button style='width:110px; height:95px' class=\"login100-form-btn\"> <img src=\"archivo.png\" required> REGISTRAR</button>\n");
      out.write("            </div>\n");
      out.write("            </th>\n");
      out.write(" </tbody>\n");
      out.write("            </table>\n");
      out.write("                  </div> </div>  </div>  \n");
      out.write("                         \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("            </table>\n");
      out.write("                  </div> </div>  </div>  \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                    <br> <br> <br><br><br><br><br><br><br><br><br><br><br><br>                 \n");
      out.write("                                      <br> <br>    <br> <br> <br><br>    <br> <br> <br><br>   <br> <br> <br>             \n");
      out.write("\n");
      out.write("      \n");
      out.write("                   </tbody>\n");
      out.write("                  \n");
      out.write("    </table> \n");
      out.write("                 \n");
      out.write("           </div>\n");
      out.write("            \n");
      out.write("                 <br>  \n");
      out.write("                            <br> <br> <br> <br>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("  \n");
      out.write("\n");
      out.write("                    \n");
      out.write("</body>\n");
      out.write("<br>  \n");
      out.write("  </form>\n");
      out.write("   </html>\n");
      out.write("   ");
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
