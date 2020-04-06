/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class DIETA extends HttpServlet {
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        
          ConexionJDBC con= new ConexionJDBC ();
        con.conectar();
        String sql="INSERT INTO software_nutricion.\"dietas\"(id,user_name,menu1,desayuno1,comida1,colacion1,cena1,menu2,desayuno2,comida2,colacion2,cena2,menu3,desayuno3,comida3,colacion3,cena3,menu4,desayuno4,comida4,colacion4,cena4,menu5,desayuno5,comida5,colacion5,cena5,bebida1,bebida11,bebida111,bebida2,bebida22,bebida222,bebida3,bebida33,bebida333,bebida4,bebida44,bebida444,bebida5,bebida55,bebida555,ce1,ce11,ce2,ce22,ce3,ce33,ce4,ce44,ce5,ce55)" + "VALUES(default,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      System.out.println(sql);
        
        try(PreparedStatement pst=con.getConexion().prepareStatement(sql)){
            
          
   pst.setString(1,request.getParameter("user_name"));

        // MENU 1
        pst.setString(2,request.getParameter("menu1"));
        pst.setString(3,request.getParameter("desayuno1"));
        pst.setString(4,request.getParameter("comida1"));
        pst.setString(5,request.getParameter("colacion1"));
        pst.setString(6,request.getParameter("cena1"));
      //MENU 2  
       pst.setString(7,request.getParameter("menu2"));
        pst.setString(8,request.getParameter("desayuno2"));
        pst.setString(9,request.getParameter("comida2"));
        pst.setString(10,request.getParameter("colacion2"));
        pst.setString(11,request.getParameter("cena2"));
        //MENU 3
         pst.setString(12,request.getParameter("menu3"));
         pst.setString(13,request.getParameter("desayuno3"));
        pst.setString(14,request.getParameter("comida3"));
        pst.setString(15,request.getParameter("colacion3"));
        pst.setString(16,request.getParameter("cena3"));
        //MENU 4
         pst.setString(17,request.getParameter("menu4"));
         pst.setString(18,request.getParameter("desayuno4"));
        pst.setString(19,request.getParameter("comida4"));
        pst.setString(20,request.getParameter("colacion4"));
        pst.setString(21,request.getParameter("cena4"));
        //MENU 5
         pst.setString(22,request.getParameter("menu5"));
         pst.setString(23,request.getParameter("desayuno5"));
        pst.setString(24,request.getParameter("comida5"));
        pst.setString(25,request.getParameter("colacion5"));
        pst.setString(26,request.getParameter("cena5"));
        
            // BEBIDAS
            pst.setString(27, request.getParameter("bebida1"));
            pst.setString(28, request.getParameter("bebida11"));
            pst.setString(29, request.getParameter("bebida111"));

            pst.setString(30, request.getParameter("bebida2"));
            pst.setString(31, request.getParameter("bebida22"));
            pst.setString(32, request.getParameter("bebida222"));

            pst.setString(33, request.getParameter("bebida3"));
            pst.setString(34, request.getParameter("bebida33"));
            pst.setString(35, request.getParameter("bebida333"));

            pst.setString(36, request.getParameter("bebida4"));
            pst.setString(37, request.getParameter("bebida44"));
            pst.setString(38, request.getParameter("bebida444"));
            
             pst.setString(39, request.getParameter("bebida5"));
            pst.setString(40, request.getParameter("bebida55"));
            pst.setString(41, request.getParameter("bebida555"));
            
            
            // COLACIONES EXTRAS
            pst.setString(42, request.getParameter("ce1"));
            pst.setString(43, request.getParameter("ce11"));

            pst.setString(44, request.getParameter("ce2"));
            pst.setString(45, request.getParameter("ce22"));

            pst.setString(46, request.getParameter("ce3"));
            pst.setString(47, request.getParameter("ce33"));

            pst.setString(48, request.getParameter("ce4"));
            pst.setString(49, request.getParameter("ce44"));

            pst.setString(50, request.getParameter("ce5"));
            pst.setString(51, request.getParameter("ce55"));

        
       pst.execute();
       
        request.getRequestDispatcher("Dieta_Agregada_Con_Exito.jsp").forward(request, response);
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

    
