
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
public class update_metas extends HttpServlet {
    
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        
     
     
          ConexionJDBC con= new ConexionJDBC ();
        con.conectar();
        
String meta1,descripcion1,meta2,descripcion2,meta3,descripcion3,user_name;      
// MENU 1
            user_name = request.getParameter("user_name");

            meta1 = request.getParameter("meta1");
           descripcion1 = request.getParameter("descripcion1");
           meta2 = request.getParameter("meta2");
           descripcion2 = request.getParameter("descripcion2");
           meta3 = request.getParameter("meta3");
           descripcion3 = request.getParameter("descripcion3");
         
           

        
        
        String sql="UPDATE software_nutricion.\"Metas\" SET meta1='"+meta1+"',descripcion1='"+descripcion1+"',meta2='"+meta2+"',descripcion2='"+descripcion2+"',meta3='"+meta3+"',descripcion3='"+descripcion3 +"'WHERE user_name='"+user_name+"'";
      System.out.println(sql);
        
        try(PreparedStatement pst=con.getConexion().prepareStatement(sql)){
        
   
        
       pst.executeUpdate();
       
        request.getRequestDispatcher("Metas_Actualizadas_Con_Exito.jsp").forward(request, response);
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