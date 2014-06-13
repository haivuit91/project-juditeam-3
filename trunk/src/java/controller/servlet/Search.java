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
import model.dao.BaiGiangDAO;
import model.dao.DeCuongDAO;
import model.dao.GiangVienHocSinhDAO;
import model.dao.SlideDAO;
import model.dao.service.BaiGiangDAOService;
import model.dao.service.DeCuongDAOService;
import model.dao.service.GiangVienHocSinhDAOService;
import model.dao.service.SlideDAOService;
import model.entities.BaiGiang;
import model.entities.DeCuong;
import model.entities.GiangVienHocSinh;
import model.entities.Slide;

/**
 *
 * @author Admin
 */
public class Search extends HttpServlet {

    GiangVienHocSinhDAOService GVHS_SERVICE = GiangVienHocSinhDAO.getInstance();
    BaiGiangDAOService BG_SERVICE = BaiGiangDAO.getInstance();
    SlideDAOService SLIDE_SERVICE = SlideDAO.getInstance();
    DeCuongDAOService DC_SERVICE = DeCuongDAO.getInstance();

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
        String action = request.getParameter("do");
        if (action != null) {
            switch (action) {
                case "details":
                    showDetail(request, response);
                    break;
            }
        }
    }

    private void showDetail(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String GVHS = request.getParameter("maGV");
        String DC = request.getParameter("maDC");
        String BG = request.getParameter("maBG");
        String SL = request.getParameter("maSL");
        DeCuong dc = null;
        BaiGiang bg = null;
        Slide sl = null;
        GiangVienHocSinh gvhs = null;
        if (GVHS != null) {
            int maGVHS = Integer.parseInt(GVHS);
            gvhs = GVHS_SERVICE.getGiangVienHocSinhByMa(maGVHS);
            if (DC != null) {
                int maDC = Integer.parseInt(DC);
                dc = DC_SERVICE.getDeCuongByMa(maDC);
            }
            if (BG != null) {
                int maBG = Integer.parseInt(BG);
                bg = BG_SERVICE.getBaiGiangByMa(maBG);
            }
            if (SL != null) {
                int maSL = Integer.parseInt(SL);
                sl = SLIDE_SERVICE.getSlideByMa(maSL);
            }
        }
        request.setAttribute("currentDC", dc);
        request.setAttribute("currentBG", bg);
        request.setAttribute("currentSL", sl);
        request.setAttribute("currentGVHS", gvhs);
        request.setAttribute(util.Constants.PAGE, "search-cb");
        request.removeAttribute(util.Constants.MSG_RESULT);
        request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
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
        List<GiangVienHocSinh> gvhsList = GVHS_SERVICE.timkiemGiangVienHocSinhByTen(tenGVHS);
        request.setAttribute("gvhsList", gvhsList);
        request.setAttribute(util.Constants.PAGE, "search-cb");
        request.removeAttribute(util.Constants.MSG_RESULT);
        request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
    }

    private void searchNC(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String noiDung;
        String nguoiThucHien;
        int nam;
        noiDung = request.getParameter("tenTT");
        String loaiTT = request.getParameter("loaiTT");
        String strNam = request.getParameter("nam");
        nguoiThucHien = request.getParameter("nguoiThucHien");
        nam = Integer.parseInt(strNam);
        List<GiangVienHocSinh> gvhsList = GVHS_SERVICE.timkiemGiangVienHocSinhByTen(nguoiThucHien);
        switch (loaiTT) {
            case "baiGiang":
                request.setAttribute("type", "baiGiang");
                request.setAttribute("gvhsList", gvhsList);
                request.setAttribute("noiDung", noiDung);
                request.setAttribute("nam", nam);
                request.setAttribute(util.Constants.PAGE, "search-nc");
                request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                break;
            case "slide":
                request.setAttribute("type", "slide");
                request.setAttribute("gvhsList", gvhsList);
                request.setAttribute("noiDung", noiDung);
                request.setAttribute("nam", nam);
                request.setAttribute(util.Constants.PAGE, "search-nc");
                request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                break;
            case "deCuong":
                request.setAttribute("type", "deCuong");
                request.setAttribute("gvhsList", gvhsList);
                request.setAttribute("noiDung", noiDung);
                request.setAttribute("nam", nam);
                request.setAttribute(util.Constants.PAGE, "search-nc");
                request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                break;
            case "all":
                request.setAttribute("type", "all");
                request.setAttribute("gvhsList", gvhsList);
                request.setAttribute("noiDung", noiDung);
                request.setAttribute("nam", nam);
                request.setAttribute(util.Constants.PAGE, "search-nc");
                request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
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
