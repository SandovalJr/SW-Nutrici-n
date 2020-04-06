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
public class update_expediente_1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        
     
     
          ConexionJDBC con= new ConexionJDBC ();
        con.conectar();
        String nombrep, edad, escolaridad, civil, ocupacion, motivo_consulta,antecedentes_heredados, medicamentos, tabaco, alcohol, drogas,enfermedadesapp, alergias_alimentariosapp, alimentos_desagradablesapp,user_name,password;
        
        
         int id=Integer.parseInt(request.getParameter("id"));

     nombrep = request.getParameter("nombrep");
     edad = request.getParameter("edad");
     escolaridad = request.getParameter("escolaridad");
     civil = request.getParameter("civil");
     ocupacion = request.getParameter("ocupacion");
     motivo_consulta = request.getParameter("motivo_consulta");
     antecedentes_heredados = request.getParameter("antecedentes_heredados");
     medicamentos = request.getParameter("medicamentos");
     tabaco = request.getParameter("tabaco");
     alcohol = request.getParameter("alcohol");
     drogas = request.getParameter("drogas");
     enfermedadesapp = request.getParameter("enfermedadesapp");
     alergias_alimentariosapp = request.getParameter("alergias_alimentariosapp");
     alimentos_desagradablesapp = request.getParameter("alimentos_desagradablesapp");
     user_name = request.getParameter("user_name");
     password = request.getParameter("password");

        
        
        String sql="UPDATE software_nutricion.\"Pacientes_Expediente\" SET nombre_apellido='"+nombrep+"', edad='"+edad+"', escolaridad='"+escolaridad+"', civil='"+civil+"', ocupacion='"+ocupacion+"',motivo_consulta='"+motivo_consulta+"', antecedentes_heredados='"+antecedentes_heredados+"', medicamentos='"+medicamentos+"', tabaco='"+tabaco+"', alcohol='"+alcohol+"', drogas='"+drogas+"', enfermedadesapp='"+enfermedadesapp+"', alergias_alimentariosapp='"+alergias_alimentariosapp+"',alimentos_desagradablesapp='"+alimentos_desagradablesapp+"', user_name='"+user_name+"', password='"+password+"' WHERE id="+id;
      System.out.println(sql);
        
        try(PreparedStatement pst=con.getConexion().prepareStatement(sql)){
        pst.executeUpdate();
       
        request.getRequestDispatcher("Expediente_Editado_Con_Exito.jsp").forward(request, response);
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
