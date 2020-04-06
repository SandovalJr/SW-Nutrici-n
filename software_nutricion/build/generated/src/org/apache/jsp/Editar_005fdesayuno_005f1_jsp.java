package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class Editar_005fdesayuno_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");

String np= request.getParameter("np");
        
           System.out.println(np);
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
      out.write("<html lang=''>\n");
      out.write("<head>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("     \n");
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
      out.write("    <li class='active has-sub'><a href='#'><span>Expedientes</span></a>\n");
      out.write("      <ul>\n");
      out.write("         \n");
      out.write("        <li><a href='http://localhost:8080/software_nutricion/registro.jsp'><span>Añadir</span></a></li>\n");
      out.write("        \n");
      out.write("             <li><a href='http://localhost:8080/software_nutricion/eliminarR.jsp'><span>Eliminar</span></a></li>\n");
      out.write("\t\t   <li><a href='#'><span>Buscar</span></a></li>\n");
      out.write("      </ul>\n");
      out.write("   </li>\n");
      out.write("    <li><a href='http://localhost:8080/software_nutricion/dietas.jsp'><span>Dietas</span></a></li>\n");
      out.write("\t <li><a href='#'><span>Mensajes</span></a></li>\n");
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
        PreparedStatement ddd;
        ResultSet desa;
      ddd=conexion.prepareStatement("SELECT id,nombre_platillo as np,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen FROM software_nutricion.\"Recetas\" WHERE nombre_platillo='"+np+"'"); 
        
        desa=ddd.executeQuery();
    
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <form action=\"update_desayuno\" method=\"POST\">\n");
      out.write("\n");
      out.write("                 <div style=\"position: absolute; left: 3%\" >\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div class=\"addthis_toolbox addthis_32x32_style addthis_default_style\"><b><h1>EDITAR DESAYUNO</h1></b></div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <div class=\"container tabla\">\n");
      out.write("          <div class=\"d-flex\">  \n");
      out.write("                  <div class=\"card col-lg-15\">\n");
      out.write("                      \n");
      out.write("    <table   class=\"table table-bordered\" >        \n");
      out.write("       \n");
      out.write("                    <tr>\n");
      out.write("                     <th style=\"background-color:#FFFF00\"> <h3>id</h3></th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\"><h3>nombre_platillo</h3></th>\n");
      out.write("                    \n");
      out.write("                 <th style=\"background-color:#FFFF00\"> <h3>ingredientes</h3></th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\"> <h3>tiempo de preparacion</h3></th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\"> <h3>instrucciones</h3></th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\"> <h3>calorias</h3></th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\"> <h3>estatus</h3></th>\n");
      out.write("                 <th style=\"background-color:#FFFF00\"><h3>imagen</h3></th>\n");
      out.write("                                 <th style=\"background-color:#FFFF00\"></th>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                                         </thead> \n");
      out.write("\n");
      out.write("                    ");
 
                    while(desa.next()){
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr >\n");
      out.write("\n");
      out.write("                        <th class=\"text-center\"><h3>");
      out.print(desa.getInt("id") );
      out.write("</h3></th>\n");
      out.write("               <th> <input style=\"font-size:15px\" type=\"text\"  name=\"np\" value = \"");
      out.print(desa.getString("np"));
      out.write("\" size=\"20\" ></th>\n");
      out.write("               <th>  <textarea style=\"font-size:15px\" rows=\"20\" cols=\"20\" type=\"text\"  name=\"ingredientes\" >");
      out.print(desa.getString("ingredientes"));
      out.write("</textarea></th>\n");
      out.write("               <th> <input style=\"font-size:15px\" type=\"text\"  name=\"tiempo_preparacion\" value = \"");
      out.print(desa.getString("tiempo_preparacion"));
      out.write("\" size=\"12\" ></th>\n");
      out.write("               <th>  <textarea style=\"font-size:15px\" rows=\"20\" cols=\"25\" type=\"text\"  name=\"instrucciones\" >");
      out.print(desa.getString("instrucciones"));
      out.write("</textarea></th>\n");
      out.write("               <th> <input style=\"font-size:15px\" type=\"text\"  name=\"calorias\" value = \"");
      out.print(desa.getString("calorias"));
      out.write("\" size=\"15\" ></th>\n");
      out.write("                  <td ><select style=\"font-size:15px\" name=\"estatus\">\n");
      out.write("                    <option>");
      out.print(desa.getString("estatus") );
      out.write("</option>\n");
      out.write("                    <option>desayuno</option>\n");
      out.write("                    <option>comida</option>\n");
      out.write("                    <option>cena</option>\n");
      out.write("                    <option>colacion</option>\n");
      out.write("                    <option>bebida</option> \n");
      out.write("                  </td>\n");
      out.write("  <th> <input style=\"font-size:15px\" type=\"text\"  name=\"imagen\" value = \"");
      out.print(desa.getString("imagen"));
      out.write("\" size=\"30\" ></th>\n");
      out.write("\n");
      out.write("  <td>\n");
      out.write("                           \n");
      out.write("   \n");
      out.write("  </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </center>\n");
      out.write("            </table> \n");
      out.write("             </div>\n");
      out.write("    </div></div></div></div>\n");
      out.write("    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("         <div style=\"position: absolute; left: 81%\" >\n");
      out.write("                <button style='width:150px; height:155px' class=\"login100-form-btn\"> <img src=\"actualizar.png\"> <b>Actualizar</b></button>\n");
      out.write("            </div>\n");
      out.write("</form>\n");
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
