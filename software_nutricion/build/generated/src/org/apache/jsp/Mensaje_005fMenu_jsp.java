package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Mensaje_005fMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
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
      out.write("\n");
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
      out.write("     \n");
      out.write("         <center>\n");
      out.write("\n");
      out.write("                    <div class=\"addthis_toolbox addthis_32x32_style addthis_default_style\">\n");
      out.write("                        <nav class=\"codrops-demos\">\n");
      out.write("\n");
      out.write("                            <a href=\"http://localhost:8080/software_nutricion/Escribir_Mensaje_Paciente.jsp\">Escribir Mensaje</a>\n");
      out.write("                            <a href=\"http://localhost:8080/software_nutricion/Menu5.jsp\"> Mensajes Recibidos</a>\n");
      out.write("                            <a href=\"http://localhost:8080/software_nutricion/Menu5.jsp\"> Mensajes Vistos</a>\n");
      out.write("    <div class=\"addthis_toolbox addthis_32x32_style addthis_default_style\"><img src=\"software_nutricion/Login_v5/images/icons/logo_nutricion.png\" width=\"300\" height=\"300\" alt=\"\"/>\n");
      out.write("\n");
      out.write("                        </nav>\n");
      out.write("              </div>\n");
      out.write("                </center>\n");
      out.write("     \n");
      out.write("         \n");
      out.write("     \n");
      out.write("\n");
      out.write("              \n");
      out.write("                <center>\n");
      out.write("\n");
      out.write("                    <div class=\"addthis_toolbox addthis_32x32_style addthis_default_style\">\n");
      out.write("                        <nav class=\"codrops-demos\">\n");
      out.write("\n");
      out.write("                            <a  href=\"https://www.facebook.com/Nutricion.Tupeso.ideal/\"><img src=\"face.png\"> </a>\n");
      out.write("                            <a href=\"https://wa.me/524493865009\"><img src=\"whatsapp.png\"></a>\n");
      out.write("                           \n");
      out.write("                        </nav>\n");
      out.write("              </div>\n");
      out.write("                </center>\n");
      out.write("\t\t\t\n");
      out.write("\t<body   background=\"fondo_verde.jpg\">\n");
      out.write("            \n");
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
      out.write("\t\t\t\t      <li><a href=\"#\"><img src=\"evolucion.png\"> </a></li>\n");
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
      out.write("        <br><br><br>        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>         <br        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("                    <div id='cssmenu'>\n");
      out.write("      <li><a  style=\"float:right\" href=\"logout\"> <img src=\"cerrar.png\" alt =\"\"> </a></li>\n");
      out.write("  </div>\n");
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
