package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Bienvenido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");

    String user_name=(String) session.getAttribute("user_name");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.print(user_name);
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("   \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"Tooplate\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?f;amily=Roboto:100,300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <title>SOFTWARE NUTRCION</title>\n");
      out.write("    \n");
      out.write("  <div id='cssmenu'>\n");
      out.write("      <li><a  style=\"float:right\" href=\"logout\"> <img src=\"cerrar.png\"> </a></li>\n");
      out.write("  </div>   \n");
      out.write("      \n");
      out.write("    \n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link href=\"menu_pacientes/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Additional CSS Files -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"menu_pacientes/assets/css/fontawesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"menu_pacientes/assets/css/tooplate-main.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"menu_pacientes/assets/css/owl.css\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <div class=\"sequence\">\n");
      out.write("  \n");
      out.write("      <div class=\"seq-preloader\">\n");
      out.write("        <svg width=\"39\" height=\"16\" viewBox=\"0 0 39 16\" xmlns=\"http://www.w3.org/2000/svg\" class=\"seq-preload-indicator\"><g fill=\"#F96D38\"><path class=\"seq-preload-circle seq-preload-circle-1\" d=\"M3.999 12.012c2.209 0 3.999-1.791 3.999-3.999s-1.79-3.999-3.999-3.999-3.999 1.791-3.999 3.999 1.79 3.999 3.999 3.999z\"/><path class=\"seq-preload-circle seq-preload-circle-2\" d=\"M15.996 13.468c3.018 0 5.465-2.447 5.465-5.466 0-3.018-2.447-5.465-5.465-5.465-3.019 0-5.466 2.447-5.466 5.465 0 3.019 2.447 5.466 5.466 5.466z\"/><path class=\"seq-preload-circle seq-preload-circle-3\" d=\"M31.322 15.334c4.049 0 7.332-3.282 7.332-7.332 0-4.049-3.282-7.332-7.332-7.332s-7.332 3.283-7.332 7.332c0 4.05 3.283 7.332 7.332 7.332z\"/></g></svg>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"logo\">\n");
      out.write("\n");
      out.write("        <h1>BIENVENIDO </h1> \n");
      out.write("\n");
      out.write("        <h2>Usuario</h2>\n");
      out.write("        <div style=\"position: absolute; right: 0%\">\n");
      out.write("            <br> <br> <br>\n");
      out.write("            <img src=\"software_nutricion/Login_v5/images/icons/logo_nutricion.png\" width=\"230\" height=\"250\" alt=\"\"/></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <nav>\n");
      out.write("\n");
      out.write("        <div style=\"color:#FFFFFF\" >\n");
      out.write("            <h4>\n");
      out.write("                ");
      out.print(user_name);
      out.write("\n");
      out.write("            </h4>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <ul>\n");
      out.write("            <li></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li><a href=\"https://www.facebook.com/\"><img src=\"menu_pacientes/assets/images/apple_fruit_fruits_20616 (2).png\" alt =\"\"></a></li>\n");
      out.write("            <li><font color=\"#ffffff\">DIETAS</font></li>\n");
      out.write("            <li><a href=\"#2\"><img src=\"menu_pacientes/assets/images/seo_goals_16325 (1).png\"> <em>METAS</em></a></li>\n");
      out.write("            <li><a href=\"#3\"><img src=\"menu_pacientes/assets/images/graphs_46879.png\"> </a></li><li><font color=\"#ffffff\">EVOLUCION</font>&nbsp;</li>\n");
      out.write("            <li><a href=\"#4\"><img src=\"menu_pacientes/assets/images/Messages_41172 (3).png\"> </a></li><li><font color=\"#ffffff\">CONTACTO</font>&nbsp;</li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("                 \n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("    <script src=\"menu_pacientes/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"menu_pacientes/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Additional Scripts -->\n");
      out.write("    <script src=\"menu_pacientes/assets/js/owl.js\"></script>\n");
      out.write("    <script src=\"menu_pacientes/assets/js/accordations.js\"></script>\n");
      out.write("    <script src=\"menu_pacientes/assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function() {\n");
      out.write("\n");
      out.write("            // navigation click actions \n");
      out.write("            $('.scroll-link').on('click', function(event){\n");
      out.write("                event.preventDefault();\n");
      out.write("                var sectionID = $(this).attr(\"data-id\");\n");
      out.write("                scrollToID('#' + sectionID, 750);\n");
      out.write("            });\n");
      out.write("            // scroll to top action\n");
      out.write("            $('.scroll-top').on('click', function(event) {\n");
      out.write("                event.preventDefault();\n");
      out.write("                $('html, body').animate({scrollTop:0}, 'slow');         \n");
      out.write("            });\n");
      out.write("            // mobile nav toggle\n");
      out.write("            $('#nav-toggle').on('click', function (event) {\n");
      out.write("                event.preventDefault();\n");
      out.write("                $('#main-nav').toggleClass(\"open\");\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        // scroll function\n");
      out.write("        function scrollToID(id, speed){\n");
      out.write("            var offSet = 0;\n");
      out.write("            var targetOffset = $(id).offset().top - offSet;\n");
      out.write("            var mainNav = $('#main-nav');\n");
      out.write("            $('html,body').animate({scrollTop:targetOffset}, speed);\n");
      out.write("            if (mainNav.hasClass(\"open\")) {\n");
      out.write("                mainNav.css(\"height\", \"1px\").removeClass(\"in\").addClass(\"collapse\");\n");
      out.write("                mainNav.removeClass(\"open\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        if (typeof console === \"undefined\") {\n");
      out.write("            console = {\n");
      out.write("                log: function() { }\n");
      out.write("            };\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("  </body>\n");
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
