/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 52449
 */


//polimorfismo
@WebServlet("/logout")
public class logout extends HttpServlet {

     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("entre");
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("http://localhost:8080/software_nutricion/inicio.jsp");
                System.out.println("bloqueo_de_cerrar_echo");

        
        
    }

}
