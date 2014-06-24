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
 * @author Admin
 */
public class Contact extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        if (request.getCharacterEncoding() == null) {
            request.setCharacterEncoding("UTF-8");
        }
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        if (util.Support.sendFeedBackMail(email, fullName, title, content)) {
            request.setAttribute(util.Constants.PAGE, "phanhoi");
            request.setAttribute("phanhoi", "Bạn đã gửi phản hồi thành công! Cảm ơn!");
            request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
        } else {
            request.setAttribute(util.Constants.PAGE, "phanhoi");
            request.setAttribute("phanhoi", "Bạn đã gửi phản hồi thất bại! Vui lòng thử lại!");
            request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
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
