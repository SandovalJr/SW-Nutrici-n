package org.apache.jsp.CircularNavigation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_005fpacientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("\t\t\n");
      out.write("\t\t<meta name=\"description\" content=\"Circular Navigation Styles - Building a Circular Navigation with CSS Transforms | Codrops \" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"css transforms, circular navigation, round navigation, circular menu, tutorial\" />\n");
      out.write("\t\t<meta name=\"author\" content=\"Sara Soueidan for Codrops\" />\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"../favicon.ico\">\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component1.css\" />\n");
      out.write("\t\t<script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<!-- Top Navigation -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"component\">\n");
      out.write("\t\t\t\t<!-- Start Nav Structure -->\n");
      out.write("\t\t\t\t<button class=\"cn-button\" id=\"cn-button\">+</button>\n");
      out.write("\t\t\t\t<div class=\"cn-wrapper\" id=\"cn-wrapper\">\n");
      out.write("\t\t\t\t    <ul>\n");
      out.write("\t\t\t\t      <li><a href=\"#\"><span class=\"icon-picture\"></span></a></li>\n");
      out.write("\t\t\t\t      <li><a href=\"#\"><span class=\"icon-headphones\"></span></a></li>\n");
      out.write("\t\t\t\t      <li><a href=\"#\"><span class=\"icon-home\"></span></a></li>\n");
      out.write("\t\t\t\t      <li><a href=\"#\"><span class=\"icon-facetime-video\"></span></a></li>\n");
      out.write("\t\t\t\t      <li><a href=\"#\"><span class=\"icon-envelope-alt\"></span></a></li>\n");
      out.write("\t\t\t\t     </ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"cn-overlay\" class=\"cn-overlay\"></div>\n");
      out.write("\t\t\t\t<!-- End Nav Structure -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!-- /container -->\n");
      out.write("\t\t<script src=\"js/polyfills.js\"></script>\n");
      out.write("\t\t<script src=\"js/demo1.js\"></script>\n");
      out.write("\t\t<!-- For the demo ad only -->   \n");
      out.write("\t</body>\n");
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
