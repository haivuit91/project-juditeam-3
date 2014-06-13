/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Welcomes
 */
public class Page extends HttpServlet {

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
        String page = request.getParameter("p");
        switch (page) {
            case "search-cb":
                request.setAttribute(util.Constants.PAGE, "search-cb");
                request.removeAttribute(util.Constants.MSG_RESULT);
                request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                break;

            case "search-nc":
                request.setAttribute(util.Constants.PAGE, "search-nc");
                request.removeAttribute(util.Constants.MSG_RESULT);
                request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                break;
            case "login":
                request.setAttribute(util.Constants.PAGE, "login");
                request.removeAttribute(util.Constants.MSG_RESULT);
                request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                break;
            case "contact":
                request.setAttribute(util.Constants.PAGE, "contact");
                request.removeAttribute(util.Constants.MSG_RESULT);
                request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                break;
            case "about":
                request.setAttribute(util.Constants.PAGE, "about");
                request.removeAttribute(util.Constants.MSG_RESULT);
                request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                break;
            case "manage-bg":
                request.setAttribute(util.Constants.PAGE, "manage-bg");
                request.removeAttribute(util.Constants.MSG_RESULT);
                request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
                break;
            case "manage-dcct":
                request.setAttribute(util.Constants.PAGE, "manage-dcct");
                request.removeAttribute(util.Constants.MSG_RESULT);
                request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
                break;
            case "manage-sl":
                request.setAttribute(util.Constants.PAGE, "manage-sl");
                request.removeAttribute(util.Constants.MSG_RESULT);
                request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
                break;
            case "manage-tl":
                request.setAttribute(util.Constants.PAGE, "manage-tl");
                request.removeAttribute(util.Constants.MSG_RESULT);
                request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
                break;

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
