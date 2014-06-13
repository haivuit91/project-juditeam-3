/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.servlet.admin;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.GiangVienHocSinhDAO;
import model.dao.SlideDAO;
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

    private final SlideDAOService SL_SERVICE = SlideDAO.getInstance();
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
        request.setCharacterEncoding("UTF-8");
        String p = request.getParameter("p");
        if (p != null) {
            switch (p) {
                case "manage-sl":
                    List<Slide> slideList = SL_SERVICE.getAllSlide();
                    request.setAttribute(util.Constants.SL_LIST, slideList);
                    request.setAttribute(util.Constants.PAGE, "manage-sl");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
                    break;
            }
        }
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("do");
        if (action != null) {
            switch (action) {
                case "edit":
                    doEdit(request, response);
                    break;
                case "add":
                    doAddnew(request, response);
                    break;
                case "del":
                    doDel(request, response);
                    break;
            }
        }
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
        String submit = request.getParameter("submit");
        switch (submit) {
            case "Sửa":
                editSlide(request, response);
                break;
            case "Thêm mới":
                addSlide(request, response);
                break;
        }
    }

    private void doAddnew(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute(util.Constants.PAGE, "manage-add-edit-sl");
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void addSlide(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tenSlide = request.getParameter("tenSlide");
        String noiDung = request.getParameter("noiDung");
        int nam = Integer.parseInt(request.getParameter("nam"));
        String GVHS = request.getParameter("gvhs");
        String tuLieu = request.getParameter("tulieu");

        String[] arrGVHS = GVHS.split("-");
        String[] arrTuLieu = tuLieu.split("-");
        int maGVHS = Integer.parseInt(arrGVHS[0]);
        int maTL = Integer.parseInt(arrTuLieu[0]);
        GiangVienHocSinh gvhs = GVHS_SERVICE.getGiangVienHocSinhByMa(maGVHS);
        TuLieu tl = TL_SERVICE.getTuLieuByMaTL(maTL);
        int trangThai = 1;

        System.out.println(tenSlide + "-" + noiDung + "-" + nam + "-" + gvhs + "-" + tl + "-" + trangThai);

//        Slide sl = new Slide(1, tenSlide, noiDung, nam, gvhs, tl, trangThai);
//        if (SL_SERVICE.themSlide(sl)) {
//            List<Slide> slList = SL_SERVICE.getAllSlide();
//            request.setAttribute("slList", slList);
//            request.setAttribute(util.Constants.PAGE, "manage-slide");
//            request.setAttribute("msgResult", "Bạn đã thêm Slide thành công");
//            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
//        } else {
//            request.setAttribute("msgResult", "Có lỗi xảy ra, thêm slide thất bại!");
//            request.setAttribute(util.Constants.PAGE, "manage-add-edit-sl");
//            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
//        }
    }

    private void doEdit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maSlide = Integer.parseInt(request.getParameter("id"));
        Slide sl = SL_SERVICE.getSlideByMa(maSlide);
        request.setAttribute("sl", sl);
        request.setAttribute(util.Constants.PAGE, "manage-add-edit-sl");
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void editSlide(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maSlide = Integer.parseInt(request.getParameter("id"));
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

        Slide sl = new Slide(maSlide, tenSlide, noiDung, nam, gvhs, tl, trangThai);
        if (SL_SERVICE.chinhsuaSlide(sl)) {
            List<Slide> slList = SL_SERVICE.getAllSlide();
            request.setAttribute("slList", slList);
            request.setAttribute(util.Constants.PAGE, "manage-slide");
            request.setAttribute("msgResult", "Bạn đã sửa Slide thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute("msgResult", "Có lỗi xảy ra, sửa slide thất bại!");
            request.setAttribute(util.Constants.PAGE, "editSlide");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void doDel(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maSlide = Integer.parseInt(request.getParameter("id"));
        if (SL_SERVICE.xoaSlide(maSlide)) {
            List<Slide> slList = SL_SERVICE.getAllSlide();
            request.setAttribute("slList", slList);
            request.setAttribute(util.Constants.PAGE, "manage-slide");
            request.setAttribute("msgResult", "Bạn đã sửa Slide thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute(util.Constants.PAGE, "manage-slide");
            request.setAttribute("msgResult", "Có lỗi xảy ra, sửa Slide thất bại");
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
