/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.GiangVienHocSinhDAO;
import model.dao.TuLieuDAO;
import model.dao.service.GiangVienHocSinhDAOService;
import model.dao.service.SlideDAOService;
import model.dao.service.TuLieuDAOService;
import model.entities.GiangVienHocSinh;
import model.entities.Slide;
import model.entities.TuLieu;

/**
 *
 * @author Admin
 */
public class SlideManagement extends HttpServlet {

    private final SlideDAOService SLIDE_SERVICE = null;
    private final GiangVienHocSinhDAOService GVHS_SERVICE = GiangVienHocSinhDAO.getInstance();
    private final TuLieuDAOService TL_SERVICE = TuLieuDAO.getInstance();

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
        response.setContentType("text/html;charset=UTF-8");
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
    }

    private void doAddnew(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute(util.Constants.PAGE, "addSlide");
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void addUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tenSlide = request.getParameter("tenSlide");
        String noiDung = request.getParameter("noiDung");
        int nam = Integer.parseInt(request.getParameter("nam"));
        String GVHS = request.getParameter("gvhs");
        String tuLieu = request.getParameter("tuLieu");

        String[] arrGVHS = GVHS.split("-");
        String[] arrTuLieu = tuLieu.split("-");
        int maGVHS = Integer.parseInt(arrGVHS[0]);
        int maTL = Integer.parseInt(arrTuLieu[0]);
        GiangVienHocSinh gvhs = GVHS_SERVICE.getGiangVienHocSinhByMa(maGVHS);
        TuLieu tl = TL_SERVICE.getTuLieuByMaTL(maTL);
        int trangThai = 1;

        Slide sl = new Slide(1, tenSlide, noiDung, nam, gvhs, tl, trangThai);
        if (SLIDE_SERVICE.themSlide(sl)) {
            List<Slide> slList = SLIDE_SERVICE.getAllSlide();
            request.setAttribute("slList", slList);
            request.setAttribute(util.Constants.PAGE, "manage-slide");
            request.setAttribute("msgResult", "Bạn đã thêm Slide thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute("msgResult", "Có lỗi xảy ra, thêm slide thất bại!");
            request.setAttribute(util.Constants.PAGE, "adduser");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
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
