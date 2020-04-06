
package Expedientes;

import datos.ConexionJDBC;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 52449
 */
public class update extends HttpServlet {
    
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        
     
     
          ConexionJDBC con= new ConexionJDBC ();
        con.conectar();
        
        String user_name, menu1, desayuno1, comida1, colacion1, cena1, menu2, desayuno2, comida2, colacion2, cena2, menu3, desayuno3, comida3, colacion3, cena3, menu4, desayuno4, comida4, colacion4, cena4, menu5, desayuno5, comida5, colacion5, cena5, bebida1, bebida11, bebida111, bebida2, bebida22, bebida222, bebida3, bebida33, bebida333, bebida4, bebida44, bebida444, bebida5, bebida55, bebida555, ce1, ce11, ce2, ce22, ce3, ce33, ce4, ce44, ce5, ce55;
           // MENU 1
            user_name = request.getParameter("user_name");
           menu1 = request.getParameter("menu1");
           desayuno1 = request.getParameter("desayuno1");
           comida1 = request.getParameter("comida1");
           colacion1 = request.getParameter("colacion1");
           cena1 = request.getParameter("cena1");
           //MENU 2  
           menu2 = request.getParameter("menu2");
           desayuno2 = request.getParameter("desayuno2");
           comida2 = request.getParameter("comida2");
           colacion2 = request.getParameter("colacion2");
           cena2 = request.getParameter("cena2");
           //MENU 3
           menu3 = request.getParameter("menu3");
           desayuno3 = request.getParameter("desayuno3");
           comida3 = request.getParameter("comida3");
           colacion3 = request.getParameter("colacion3");
           cena3 = request.getParameter("cena3");
           //MENU 4
           menu4 = request.getParameter("menu4");
           desayuno4 = request.getParameter("desayuno4");
           comida4 = request.getParameter("comida4");
           colacion4 = request.getParameter("colacion4");
           cena4 = request.getParameter("cena4");
           //MENU 5
           menu5 = request.getParameter("menu5");
           desayuno5 = request.getParameter("desayuno5");
           comida5 = request.getParameter("comida5");
           colacion5 = request.getParameter("colacion5");
           cena5 = request.getParameter("cena5");

           // BEBIDAS
           bebida1 = request.getParameter("bebida1");
           bebida11 = request.getParameter("bebida11");
           bebida111 = request.getParameter("bebida111");

           bebida2 = request.getParameter("bebida2");
           bebida22 = request.getParameter("bebida22");
           bebida222 = request.getParameter("bebida222");

           bebida3 = request.getParameter("bebida3");
           bebida33 = request.getParameter("bebida33");
           bebida333 = request.getParameter("bebida333");

           bebida4 = request.getParameter("bebida4");
           bebida44 = request.getParameter("bebida44");
           bebida444 = request.getParameter("bebida444");

           bebida5 = request.getParameter("bebida5");
           bebida55 = request.getParameter("bebida55");
           bebida555 = request.getParameter("bebida555");

           // COLACIONES EXTRAS
           ce1 = request.getParameter("ce1");
           ce11 = request.getParameter("ce11");

           ce2 = request.getParameter("ce2");
           ce22 = request.getParameter("ce22");

           ce3 = request.getParameter("ce3");
           ce33 = request.getParameter("ce33");

           ce4 = request.getParameter("ce4");
           ce44 = request.getParameter("ce44");

           ce5 = request.getParameter("ce5");
           ce55 = request.getParameter("ce55");
           

        
        
        String sql="UPDATE software_nutricion.\"dietas\" SET menu1='"+menu1+"',desayuno1='"+desayuno1+"',comida1='"+comida1+"',colacion1='"+colacion1+"',cena1='"+cena1+"',menu2='"+menu2+"',desayuno2='"+desayuno2+"',comida2='"+comida2+"',colacion2='"+colacion2+"',cena2='"+cena2+"',menu3='"+menu3+"',desayuno3='"+desayuno3+"',comida3='"+comida3+"',colacion3='"+colacion3+"',cena3='"+cena3+"',menu4='"+menu4+"',desayuno4='"+desayuno4+"',comida4='"+comida4+"',colacion4='"+colacion4+"',cena4='"+cena4+"',menu5='"+menu5+"',desayuno5='"+desayuno5+"',comida5='"+comida5+"',colacion5='"+colacion5+"',cena5='"+cena5+"',bebida1='"+bebida1+"',bebida11='"+bebida11+"',bebida111='"+bebida111+"',bebida2='"+bebida2+"',bebida22='"+bebida22+"',bebida222='"+bebida222+"',bebida3='"+bebida3+"',bebida33='"+bebida33+"',bebida333='"+bebida333+"',bebida4='"+bebida4+"',bebida44='"+bebida44+"',bebida444='"+bebida444+"',bebida5='"+bebida5+"',bebida55='"+bebida55+"',bebida555='"+bebida555+"',ce1='"+ce1+"',ce11='"+ce11+"',ce2='"+ce2+"',ce22='"+ce22+"',ce3='"+ce3+"',ce33='"+ce33+"',ce4='"+ce4+"',ce44='"+ce44+"',ce5='"+ce5+"',ce55='"+ce55+"' WHERE user_name='"+user_name+"'";
      System.out.println(sql);
        
        try(PreparedStatement pst=con.getConexion().prepareStatement(sql)){
        
   
        
       pst.executeUpdate();
       
        request.getRequestDispatcher("Dieta_Actualizada_Con_Exito.jsp").forward(request, response);
        } catch (SQLException ex){
        Logger.getLogger(registrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    //HERENCIA
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(registrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
         Logger.getLogger(registrar.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}