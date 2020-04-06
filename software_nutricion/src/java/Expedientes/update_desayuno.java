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
public class update_desayuno extends HttpServlet {
    
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        
     
     
          ConexionJDBC con= new ConexionJDBC ();
        con.conectar();
        String np,ingredientes,tiempo_preparacion,instrucciones,calorias,estatus,imagen;
        
        
        
          
            np = request.getParameter("np");
           ingredientes = request.getParameter("ingredientes");
           tiempo_preparacion = request.getParameter("tiempo_preparacion");
           instrucciones = request.getParameter("instrucciones");
           calorias = request.getParameter("calorias");
           estatus = request.getParameter("estatus");
       
          
        
        
        String sql="UPDATE software_nutricion.\"Recetas\" SET nombre_platillo='"+np+"',ingredientes='"+ingredientes+"',tiempo_preparacion='"+tiempo_preparacion+"',instrucciones='"+instrucciones+"',calorias='"+calorias+"', estatus='"+estatus+"'WHERE nombre_platillo='"+np+"'";
      System.out.println(sql);
        
        try(PreparedStatement pst=con.getConexion().prepareStatement(sql)){
        
   
        
       pst.executeUpdate();
       
        request.getRequestDispatcher("Recetas_Actualizada_Con_Exito.jsp").forward(request, response);
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