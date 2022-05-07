/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SusanaHI
 */
public class muestraSolicitud extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            
            //Usuario
            String nombreUser = request.getParameter("userName");
            String apellidoUser = request.getParameter("userLastName");
            String grupoNegociosUser = request.getParameter("userGrupo");
            String plantaUser = request.getParameter("userPlanta");
            String areaUser = request.getParameter("userArea");
            String autorizaUser = request.getParameter("userAutoriza");

            model.user e2 = new model.user(nombreUser);
            model.user e3 = new model.user(apellidoUser);
            model.user e4 = new model.user(grupoNegociosUser);
            model.user e5 = new model.user(plantaUser);
            model.user e6 = new model.user(areaUser);
            model.user e7 = new model.user(autorizaUser);
            //String usuario = e2.getId();

            HttpSession mysession = request.getSession(false);
            mysession.setAttribute("usuarioResuelto", e2.getNombre());
            HttpSession mysession2 = request.getSession(false);
            mysession2.setAttribute("apellidoResuelto", e3.getApellido());
            HttpSession mysession3 = request.getSession(false);
            mysession3.setAttribute("grupoResuelto", e4.getGrupoNegocios());
            HttpSession mysession4 = request.getSession(false);
            mysession4.setAttribute("plantaResuelto", e5.getPlanta());
            HttpSession mysession5 = request.getSession(false);
            mysession5.setAttribute("areaResuelto", e6.getArea());
            HttpSession mysession6 = request.getSession(false);
            mysession6.setAttribute("autorizaResuelto", e7.getAutoriza());
            
            //request.setAttribute("lastUser", e2.getId());
            //request.getRequestDispatcher("/MuestraResultado.jsp").forward(request, response);
            
            //Solicitud, Cookies and Filter
            
            if(request.getAttribute("flag")!=null){
                request.setAttribute("flag", 1);
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }else{
                String tc1 = request.getParameter("tipo");
                String a1 = request.getParameter("aplicacion");
                String dc1 = request.getParameter("descripcion");
                String jc1 = request.getParameter("justificacion");
                
                model.solicitud e1 = new model.solicitud(tc1, a1, dc1, jc1);
                String a = e1.getTipoCambio();
                String a2 = e1.getAplicacion();
                String a3 = e1.getDescripcionCambio();
                String a4 = e1.getJustificacionCambio();                        
                        
                Cookie ck = new Cookie("tipo", e1.getTipoCambio()+"");
                response.addCookie(ck);

                ck = new Cookie("aplicacion", e1.getAplicacion()+"");
                response.addCookie(ck);

                ck = new Cookie("descripcion", e1.getDescripcionCambio()+"");
                response.addCookie(ck);

                ck = new Cookie("justificacion", e1.getJustificacionCambio()+"");
                response.addCookie(ck);

                request.setAttribute("cambioSolicitado", a);
                request.setAttribute("aplicacionSolicitada", a2);
                request.setAttribute("descripcionSolicitada", a3);
                request.setAttribute("justificacionSolicitada", a4);
                
                request.getRequestDispatcher("/muestraResultado.jsp").forward(request, response);
            }
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
