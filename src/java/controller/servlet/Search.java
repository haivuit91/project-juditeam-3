/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.service.GiangVienHocSinhDAOService;
import model.entities.GiangVienHocSinh;

/**
 *
 * @author Admin
 */
public class Search extends HttpServlet {

    GiangVienHocSinhDAOService GVHS_SERVICE;

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
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("do");
        switch (action) {
            case "search-cb":
                searchCB(request, response);
                break;
            case "search-nc":
                searchNC(request, response);
                break;
        }
    }

    private void searchCB(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String tenGVHS = request.getParameter("keyWord");
        GiangVienHocSinh gvhs = GVHS_SERVICE.getGiangVienHocSinhByTen(tenGVHS);
        request.setAttribute("gvhs", gvhs);
        request.setAttribute(util.Constants.PAGE, "search-cb");
        request.removeAttribute(util.Constants.MSG_RESULT);
        request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
    }

    private void searchNC(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String tenTT = request.getParameter("tenTT");
        String loaiTT = request.getParameter("loaiTT");
        String soTrang = request.getParameter("soTrang");
        String nguoiThucHien = request.getParameter("nguoiThucHien");
        List<GiangVienHocSinh> gvhsList = GVHS_SERVICE.timkiemGiangVienHocSinhByTen(tenTT);
        switch (loaiTT) {
            case "Bài giảng":
                break;
            case "Slide":
                break;
            case "Tất cả":
                break;
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
    }
}