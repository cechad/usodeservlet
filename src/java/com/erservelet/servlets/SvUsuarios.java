/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erservelet.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Usuario;


@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        }
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("123","César","Escobar","14563268"));
        listaUsuarios.add(new Usuario("123","Armado","Chamale","14563268"));
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios",listaUsuarios);
        
        response.sendRedirect("MostrarUsuarios.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String dpi = request.getParameter("dpi");
         String nombre = request.getParameter("nombre");
           String apellido = request.getParameter("apellido");
             String telefono = request.getParameter("telefono");
             
            System.out.println("El DPI es: " + dpi);
            System.out.println("El Nombre es:" + nombre);
            System.out.println("El Apellido es: " + apellido);
            System.out.println("El Telefon es: " + telefono);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
