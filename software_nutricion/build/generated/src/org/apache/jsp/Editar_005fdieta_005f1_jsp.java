package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class Editar_005fdieta_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("  \n");
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
      out.write("    \n");
      out.write("   <title>Bienvenido Nutrilogo</title>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body   background=\"fondo_verde.jpg\">\n");
      out.write("    \n");
      out.write("    <div style=\"float:right\" >\n");
      out.write("        ");
      out.print(user_name);
      out.write("\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <div id='cssmenu'>\n");
      out.write("      <li><a  style=\"float:right\" href=\"logout\"> <img src=\"cerrar.png\" alt =\"\"> </a></li>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<div id='cssmenu'>\n");
      out.write("<ul>\n");
      out.write("\t <li><a href='http://localhost:8080/software_nutricion/Menu.jsp'><img src=\"casa.png\"></a></li>\n");
      out.write("   <li class='active has-sub'><a href='#'><span>Recetas</span></a>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href='http://localhost:8080/software_nutricion/desayuno.jsp'><span>Desayuno</span></a></li>\n");
      out.write("             <li><a href='http://localhost:8080/software_nutricion/comida.jsp'><span>Comida</span></a></li>\n");
      out.write("\t\t   <li><a href='http://localhost:8080/software_nutricion/cena.jsp'><span>Cena</span></a></li>\n");
      out.write("            <li><a href='http://localhost:8080/software_nutricion/colaciones.jsp'><span>Colación</span></a></li>\n");
      out.write("       <li><a href='http://localhost:8080/software_nutricion/Bebidas.jsp'><span>Bebidas</span></a></li>  \n");
      out.write("\n");
      out.write("            <a href=\"recetas_registro.jsp\" > <img src=\"mas.png\">  </a>\n");
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
      out.write("   <li><a href='http://localhost:8080/software_nutricion/dietas.jsp'><span>Dietas</span></a></li>\n");
      out.write("   \n");
      out.write("\t <li><a href='#'><span>Mensajes</span></a></li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("     \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <div style=\"position: fixed; rigth: 75%\"><img src=\"software_nutricion/Login_v5/images/icons/logo_nutricion.png\" width=\"250\" height=\"250\" alt=\"\"/></div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("<form action=\"update\" method=\"POST\">\n");
      out.write("\n");
      out.write("    <div style=\"position: fixed; left:73%\">\n");
      out.write("        <br><br><br><br>  <br><br><br><br>  <br><br><br><br>\n");
      out.write("         <img  src=\"mono.png\" width=\"800\" height=\"500\"  alt=\"\"/></div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("   \n");
      out.write("  <br>\n");
      out.write("  \n");
      out.write("   ");
 
    //Empezamos listado los datos de la tabla usuario
     PreparedStatement ps;
              

              ResultSet rs;

        System.out.println("LLEGO AL FROM");
        
   System.out.println(user);

     ps=conexion.prepareStatement("SELECT id,user_name as user,menu1,desayuno1,comida1,colacion1,cena1,menu2,desayuno2,comida2,colacion2,cena2,menu3,desayuno3,comida3,colacion3,cena3,menu4,desayuno4,comida4,colacion4,cena4,menu5,desayuno5,comida5,colacion5,cena5,bebida1,bebida11,bebida111,bebida2,bebida22,bebida222,bebida3,bebida33,bebida333,bebida4,bebida44,bebida444,bebida5,bebida55,bebida555,ce1,ce11,ce2,ce22,ce3,ce33,ce4,ce44,ce5,ce55 FROM software_nutricion.\"dietas\" WHERE user_name='"+user+"'"); 
 rs=ps.executeQuery();  
 System.err.println(ps);
        while(rs.next()){
            System.out.println("ingreso al while");
  
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("      \n");
      out.write("    <div style=\"position: absolute; left: 17%\" >\n");
      out.write("           <div class=\"d-flex\">  \n");
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
      out.write("                    <th style=\"background-color:#A4A4A4\">MENU 1</th>\n");
      out.write("                   <td style=\"background-color:#A4A4A4\"> \n");
      out.write("                       <select name=\"menu1\"  >\n");
      out.write("\n");
      out.write("                    <option> lunes    </option>\n");
      out.write("                    <option>  martes   </option>\n");
      out.write("                    <option>  miercoles  </option>\n");
      out.write("                     <option>  jueves  </option>\n");
      out.write("                      <option>  viernes  </option>\n");
      out.write("                       <option>  sabado  </option>\n");
      out.write("                        <option>  domingo  </option>\n");
      out.write("                        <option selected>");
      out.print(rs.getString("menu1"));
      out.write("</option>\n");
      out.write("                    <td > \n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                     <th style=\"background-color:#A4A4A4\">MENU 3</th>\n");
      out.write("\n");
      out.write("                    <td style=\"background-color:#A4A4A4\"> \n");
      out.write("                    <select name=\"menu3\"  >\n");
      out.write("\n");
      out.write("                    <option> lunes    </option>\n");
      out.write("                    <option>  martes   </option>\n");
      out.write("                    <option>  miercoles  </option>\n");
      out.write("                     <option>  jueves  </option>\n");
      out.write("                      <option>  viernes  </option>\n");
      out.write("                       <option>  sabado  </option>\n");
      out.write("                        <option>  domingo  </option>\n");
      out.write("                    <option selected>");
      out.print(rs.getString("menu3"));
      out.write("</option>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Desayuno</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"desayuno1\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("desayuno1"));
      out.write("</option>\n");
      out.write("                    <option>       ");
  

  PreparedStatement d;
        ResultSet desayuno;
        d=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'desayuno'"); 
       desayuno=d.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(desayuno.next()){
            out.println("<option value='"+desayuno.getString("nombre_platillo")+"'>"+desayuno.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("                \n");
      out.write("</td>\n");
      out.write("                </select>\n");
      out.write("                        \n");
      out.write("                           <td> </td>\n");
      out.write("  <td>Desayuno</td> <!-- MENU 3 -->\n");
      out.write("                 <td><select name=\"desayuno3\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("desayuno3"));
      out.write("</option>\n");
      out.write("                    <option>       ");
 

  
        d=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'desayuno'"); 
       desayuno=d.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(desayuno.next()){
            out.println("<option value='"+desayuno.getString("nombre_platillo")+"'>"+desayuno.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida1\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida1"));
      out.write("</option>\n");
      out.write("                    <option>       ");
  
PreparedStatement b;
        ResultSet bebida;
 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("                    \n");
      out.write("                    <td></td>\n");
      out.write("                    \n");
      out.write("                    <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida3\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida3"));
      out.write("</option>\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Comida</td> <!-- COMIDA 1 -->\n");
      out.write("                        <td><select name=\"comida1\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("comida1"));
      out.write("</option>\n");
      out.write("                    <option>       ");
 

  PreparedStatement c;
        ResultSet comida;
 
        c=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'comida'"); 
       comida=c.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(comida.next()){
            out.println("<option value='"+comida.getString("nombre_platillo")+"'>"+comida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                           <td> </td>\n");
      out.write("                        <td>Comida</td> <!-- COMIDA 3-->\n");
      out.write("                        <td><select name=\"comida3\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("comida3"));
      out.write("</option>\n");
      out.write("                    <option>       ");
 

  
        c=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'comida'"); 
       comida=c.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(comida.next()){
            out.println("<option value='"+comida.getString("nombre_platillo")+"'>"+comida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                       <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida11\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida11"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>  \n");
      out.write("                    <td></td>\n");
      out.write("                       \n");
      out.write("                    <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida33\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida33"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("      \n");
      out.write("                       \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                      <td>Cena</td> <!-- CENA 1 -->\n");
      out.write("                        \n");
      out.write("                        <td><select name=\"cena1\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("cena1"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

    PreparedStatement cen;
        ResultSet cena;
 
        cen=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'cena'"); 
       cena=cen.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(cena.next()){
            out.println("<option value='"+cena.getString("nombre_platillo")+"'>"+cena.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                           <td> </td>\n");
      out.write("                         <td>Cena</td> <!-- CENA 3-->\n");
      out.write("                          <td><select name=\"cena3\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("cena3"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cen=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'cena'"); 
       cena=cen.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(cena.next()){
            out.println("<option value='"+cena.getString("nombre_platillo")+"'>"+cena.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                         <tr>\n");
      out.write("                         <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida111\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida111"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>   \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <td></td>\n");
      out.write("                    <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida333\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida333"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("                       </tr>  \n");
      out.write("                                      <tr>\n");
      out.write("                         <td>Colacion</td> <!--COLACION 1 -->\n");
      out.write("                                 <td><select name=\"colacion1\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("colacion1"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  PreparedStatement cola;
        ResultSet colacion;
 
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                           <td> </td>\n");
      out.write("                         <td>Colacion</td> <!--COLACION 3 -->\n");
      out.write("                          <td><select name=\"colacion3\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("colacion3"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                       </tr> \n");
      out.write("                       \n");
      out.write("               \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("            <tr>\n");
      out.write("                         <td>Colacion extra 1:</td> <!--COLACION 1 -->\n");
      out.write("                                 <td><select name=\"ce1\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("ce1"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                           <td> </td>\n");
      out.write("                         <td>Colacion extra 1:</td> <!--COLACION 3 -->\n");
      out.write("                          <td><select name=\"ce3\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("ce3"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                      </tr> \n");
      out.write("                      \n");
      out.write("                        <tr>\n");
      out.write("                         <td>Colacion extra 2:</td> <!--COLACION 1 -->\n");
      out.write("                                 <td><select name=\"ce11\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("ce11"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                           <td> </td>\n");
      out.write("                         <td>Colacion extra 2:</td> <!--COLACION 3 -->\n");
      out.write("                          <td><select name=\"ce33\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("ce33"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                      </tr> \n");
      out.write("                     \n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                  </tbody>\n");
      out.write("            </table>\n");
      out.write("                  </div> </div>  </div>  \n");
      out.write("                    \n");
      out.write("                    <br> <br> <br><br><br><br><br><br><br><br><br><br><br><br>                 \n");
      out.write("                                        <br> <br> <br><br>    <br> <br> <br><br>   <br> <br> <br>             \n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"d-flex\">  \n");
      out.write("        <div  style=\"position: absolute; left: 17%\" class=\"card col-lg-15\"> \n");
      out.write("    <table class=\"table table-hover\">\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <th style=\"background-color:#A4A4A4\">MENU 2</th>\n");
      out.write("                    <td style=\"background-color:#A4A4A4\">\n");
      out.write("                         <select name=\"menu2\"  >\n");
      out.write("\n");
      out.write("                    <option> lunes    </option>\n");
      out.write("                    <option>  martes   </option>\n");
      out.write("                    <option>  miercoles  </option>\n");
      out.write("                     <option>  jueves  </option>\n");
      out.write("                      <option>  viernes  </option>\n");
      out.write("                       <option>  sabado  </option>\n");
      out.write("                        <option>  domingo  </option>\n");
      out.write("                         <option selected>");
      out.print(rs.getString("menu2"));
      out.write("</option>\n");
      out.write("                    </td>\n");
      out.write("                       <td> </td>\n");
      out.write("                       <th style=\"background-color:#A4A4A4\">MENU 4</th>\n");
      out.write("                       <td style=\"background-color:#A4A4A4\">\n");
      out.write("                            <select name=\"menu4\"  >\n");
      out.write("\n");
      out.write("                    <option> lunes    </option>\n");
      out.write("                    <option>  martes   </option>\n");
      out.write("                    <option>  miercoles  </option>\n");
      out.write("                     <option>  jueves  </option>\n");
      out.write("                      <option>  viernes  </option>\n");
      out.write("                       <option>  sabado  </option>\n");
      out.write("                        <option>  domingo  </option>\n");
      out.write("                         <option selected>");
      out.print(rs.getString("menu4"));
      out.write("</option>\n");
      out.write("                           \n");
      out.write("                       </td>\n");
      out.write("                </tr>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Desayuno</td> <!-- MENU 2 -->\n");
      out.write("                          <td><select name=\"desayuno2\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("desayuno2"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        d=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'desayuno'"); 
       desayuno=d.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(desayuno.next()){
            out.println("<option value='"+desayuno.getString("nombre_platillo")+"'>"+desayuno.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                           <td>\n");
      out.write("                           </td>\n");
      out.write("<td>Desayuno</td> <!-- MENU 4-->\n");
      out.write("   <td><select name=\"desayuno4\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("desayuno4"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        d=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'desayuno'"); 
       desayuno=d.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(desayuno.next()){
            out.println("<option value='"+desayuno.getString("nombre_platillo")+"'>"+desayuno.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("             <tr>\n");
      out.write("            <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida2\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida2"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("                    \n");
      out.write("                    <td></td>\n");
      out.write("                    \n");
      out.write("                    <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida4\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida4"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Comida</td> <!-- COMIDA 2-->\n");
      out.write("                       <td><select name=\"comida2\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("comida2"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        c=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'comida'"); 
       comida=c.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(comida.next()){
            out.println("<option value='"+comida.getString("nombre_platillo")+"'>"+comida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                           <td> </td>\n");
      out.write("                            <td>Comida</td> <!-- COMIDA4 --> \n");
      out.write("                       <td><select name=\"comida4\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("comida4"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        c=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'comida'"); 
       comida=c.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(comida.next()){
            out.println("<option value='"+comida.getString("nombre_platillo")+"'>"+comida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                          <tr>\n");
      out.write("            <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida22\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida22"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("                    \n");
      out.write("                    <td></td>\n");
      out.write("                    \n");
      out.write("                    <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida44\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida44"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("               \n");
      out.write("             \n");
      out.write("                <tr>\n");
      out.write("                      <td>Cena</td> <!--cena2-->\n");
      out.write("                                 <td><select name=\"cena2\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("cena2"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cen=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'cena'"); 
       cena=cen.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(cena.next()){
            out.println("<option value='"+cena.getString("nombre_platillo")+"'>"+cena.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                        \n");
      out.write("                           <td> </td>\n");
      out.write("                            <td>Cena</td> <!-- cena4 -->\n");
      out.write("                            \n");
      out.write("                                 <td><select name=\"cena4\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("cena4"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cen=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'cena'"); 
       cena=cen.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(cena.next()){
            out.println("<option value='"+cena.getString("nombre_platillo")+"'>"+cena.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                         \n");
      out.write("                          \n");
      out.write("                           \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                     <tr>\n");
      out.write("            <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida222\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida222"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("                    \n");
      out.write("                    <td></td>\n");
      out.write("                    \n");
      out.write("                    <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida444\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida444"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("             <tr>\n");
      out.write("                         <td>Colacion</td> <!-- COLACION 2-->\n");
      out.write("                          <td><select name=\"colacion2\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("colacion2"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                          \n");
      out.write("                           <td> </td>\n");
      out.write("                             <td>Colacion</td> <!-- COLACION 4-->\n");
      out.write("                          <td><select name=\"colacion4\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("colacion4"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("</tr> \n");
      out.write("  <tr>\n");
      out.write("                         <td>Colacion extra 1:</td> <!--COLACION 1 -->\n");
      out.write("                                 <td><select name=\"ce2\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("ce2"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                           <td> </td>\n");
      out.write("                         <td>Colacion extra 1:</td> <!--COLACION 3 -->\n");
      out.write("                          <td><select name=\"ce4\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("ce4"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                      </tr> \n");
      out.write("                      \n");
      out.write("                        <tr>\n");
      out.write("                         <td>Colacion extra 2:</td> <!--COLACION 1 -->\n");
      out.write("                                 <td><select name=\"ce22\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("ce22"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                           <td> </td>\n");
      out.write("                         <td>Colacion extra 2:</td> <!--COLACION 3 -->\n");
      out.write("                          <td><select name=\"ce44\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("ce44"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                      </tr>    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                   </tbody>\n");
      out.write("                  \n");
      out.write("    </table> \n");
      out.write("                   \n");
      out.write("           </div>\n");
      out.write("                     <br><br> <br><br> <br><br> <br><br><br> <br><br> <br> \n");
      out.write("                                          <br><br> <br><br> <br><br> <br><br><br> <br><br> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex\">  \n");
      out.write("                  <div   style=\"position: absolute; left: 17%\"  class=\"card col-lg-15\">\n");
      out.write("    <table class=\"table table-hover\">\n");
      out.write("               \n");
      out.write("                      <tr>\n");
      out.write("                      <th style=\"background-color:#A4A4A4\">MENU 5</th>\n");
      out.write("                      <td style=\"background-color:#A4A4A4\">\n");
      out.write("                           <select name=\"menu5\"  >\n");
      out.write("\n");
      out.write("                    <option> lunes    </option>\n");
      out.write("                    <option>  martes   </option>\n");
      out.write("                    <option>  miercoles  </option>\n");
      out.write("                     <option>  jueves  </option>\n");
      out.write("                      <option>  viernes  </option>\n");
      out.write("                       <option>  sabado  </option>\n");
      out.write("                        <option>  domingo  </option>\n");
      out.write("                        <option selected>");
      out.print(rs.getString("menu5"));
      out.write("</option>\n");
      out.write("                          \n");
      out.write("                      </td>\n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <tbody>\n");
      out.write("                         <tr>\n");
      out.write("                        <td>Desayuno</td> <!-- menu5-->\n");
      out.write("                          <td><select name=\"desayuno5\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("desayuno5"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        d=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'desayuno'"); 
       desayuno=d.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(desayuno.next()){
            out.println("<option value='"+desayuno.getString("nombre_platillo")+"'>"+desayuno.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                         </tr>\n");
      out.write("                         <tr>\n");
      out.write("                            <tr>\n");
      out.write("            <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida5\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida5"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("                      \n");
      out.write("                             \n");
      out.write("                         </tr>  \n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                          <tr>\n");
      out.write("                        <td>Comida</td> <!--COMIDA 5 -->\n");
      out.write("                       <td><select name=\"comida5\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("comida5"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        c=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'comida'"); 
       comida=c.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(comida.next()){
            out.println("<option value='"+comida.getString("nombre_platillo")+"'>"+comida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                            <tr>\n");
      out.write("            <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida55\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida55"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("                      \n");
      out.write("                             \n");
      out.write("                         </tr>    \n");
      out.write("                              \n");
      out.write("                          </tr>\n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("                           <tr>\n");
      out.write("                               <td>Cena</td> <!-- cena  -->\n");
      out.write("                                  <td><select name=\"cena5\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("cena5"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cen=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'cena'"); 
       cena=cen.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(cena.next()){
            out.println("<option value='"+cena.getString("nombre_platillo")+"'>"+cena.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                     </tr>    \n");
      out.write("                     \n");
      out.write("                      <tr>\n");
      out.write("            <td>Bebida</td>\n");
      out.write("                   \n");
      out.write("                         <td><select name=\"bebida555\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("bebida555"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
  

 
        b=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'bebida'"); 
       bebida=b.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(bebida.next()){
            out.println("<option value='"+bebida.getString("nombre_platillo")+"'>"+bebida.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option> \n");
      out.write("                      \n");
      out.write("                             \n");
      out.write("                         </tr> \n");
      out.write("                          <tr>\n");
      out.write("                         <td>Colacion</td> <!-- COLACION 5 -->\n");
      out.write("                         <td><select name=\"colacion5\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("colacion5"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           </tr>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                            <tr>\n");
      out.write("                         <td>Colacion extra 1:</td> <!--COLACION 1 -->\n");
      out.write("                                 <td><select name=\"ce5\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("ce5"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                      </tr> \n");
      out.write("                      \n");
      out.write("                        <tr>\n");
      out.write("                \n");
      out.write("                         <td>Colacion extra 2:</td> <!--COLACION 3 -->\n");
      out.write("                          <td><select name=\"ce55\" >\n");
      out.write(" <option selected>");
      out.print(rs.getString("ce55"));
      out.write("</option>\n");
      out.write("\n");
      out.write("                    <option>       ");
 

  
        cola=conexion.prepareStatement("SELECT nombre_platillo FROM software_nutricion.\"Recetas\" WHERE estatus = 'colacion'"); 
       colacion=cola.executeQuery();  
        //Empezamos listado los datos de la tabla usuario
        
       
        out.println(" <option value= ''>Seleccione...</option>'");
        while(colacion.next()){
            out.println("<option value='"+colacion.getString("nombre_platillo")+"'>"+colacion.getString("nombre_platillo")+"</option>");
        }
        
                    
      out.write("   </option>    </td>\n");
      out.write("                        \n");
      out.write("                      </tr>  \n");
      out.write("                           \n");
      out.write("                         \n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                    </tbody>\n");
      out.write("                   </table>\n");
      out.write("                    \n");
      out.write("                       </div> \n");
      out.write("                    \n");
      out.write("                    </div>    \n");
      out.write("                   \n");
      out.write("                    <table >\n");
      out.write("        <br> <br> <br> <br><br> <br> <br> <br>\n");
      out.write("                       \n");
      out.write("            <div style=\"position: absolute; left: 65%\" >\n");
      out.write("                <button style='width:150px; height:155px' class=\"login100-form-btn\"> <img src=\"actualizar.png\"> <b>Actualizar</b></button>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("                    </table>\n");
      out.write("                    <br>  \n");
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
      out.write("                    ");
 } 
      out.write("\n");
      out.write("   </html>\n");
      out.write(" \n");
      out.write("\n");
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
