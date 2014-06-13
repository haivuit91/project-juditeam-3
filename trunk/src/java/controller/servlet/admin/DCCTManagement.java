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
import model.dao.DeCuongDAO;
import model.dao.GiangVienHocSinhDAO;
import model.dao.service.DeCuongDAOService;
import model.dao.service.GiangVienHocSinhDAOService;
import model.entities.DeCuong;
import model.entities.GiangVienHocSinh;

/**
 *
 * @author HAI VU
 */
public class DCCTManagement extends HttpServlet {

    private final DeCuongDAOService DCCT_SERVICE = DeCuongDAO.getInstance();
    private final GiangVienHocSinhDAOService GVHS_SERVICE = GiangVienHocSinhDAO.getInstance();

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
                case "manage-dcct":
                    request.setAttribute(util.Constants.PAGE, "manage-dcct");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
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
    }

    private void doAddnew(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute(util.Constants.PAGE, "addDCCT");
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void addDCCT(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tenDC = request.getParameter("tenDC");
        int dvhoctrinh = Integer.parseInt(request.getParameter("dvhoctrinh"));
        String thoigian = request.getParameter("thoigian");
        String dieukien = request.getParameter("dieukien");
        String muctieu = request.getParameter("muctieu");
        String noiDung = request.getParameter("noidung");
        String tieuchuan = request.getParameter("tieuchuan");
        int nam = Integer.parseInt(request.getParameter("nam"));
        String GVHS = request.getParameter("gvhs");

        String[] arrGVHS = GVHS.split("-");
        int maGVHS = Integer.parseInt(arrGVHS[0]);
        GiangVienHocSinh gvhs = GVHS_SERVICE.getGiangVienHocSinhByMa(maGVHS);
        int trangThai = 1;

        DeCuong dcct = new DeCuong(1, tenDC, dvhoctrinh, thoigian, dieukien, muctieu, noiDung, tieuchuan, nam, gvhs, trangThai);
        if (DCCT_SERVICE.themDeCuong(dcct)) {
            List<DeCuong> dcctList = DCCT_SERVICE.getAllDeCuong();
            request.setAttribute("dcctList", dcctList);
            request.setAttribute(util.Constants.PAGE, "manage-dcct");
            request.setAttribute("msgResult", "Bạn đã thêm đề cương chi tiết thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute("msgResult", "Có lỗi xảy ra, thêm đề cương chi tiết thất bại!");
            request.setAttribute(util.Constants.PAGE, "addDCCT");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void doEdit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maDC = Integer.parseInt(request.getParameter("id"));
        DeCuong dcct = DCCT_SERVICE.getDeCuongByMa(maDC);
        request.setAttribute("dcct", dcct);
        request.setAttribute(util.Constants.PAGE, "editDCCT");
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void editDCCT(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maDC = Integer.parseInt(request.getParameter("id"));
        String tenDC = request.getParameter("tenDC");
        int dvhoctrinh = Integer.parseInt(request.getParameter("dvhoctrinh"));
        String thoigian = request.getParameter("thoigian");
        String dieukien = request.getParameter("dieukien");
        String muctieu = request.getParameter("muctieu");
        String noiDung = request.getParameter("noidung");
        String tieuchuan = request.getParameter("tieuchuan");
        int nam = Integer.parseInt(request.getParameter("nam"));
        String GVHS = request.getParameter("gvhs");

        String[] arrGVHS = GVHS.split("-");
        int maGVHS = Integer.parseInt(arrGVHS[0]);
        GiangVienHocSinh gvhs = GVHS_SERVICE.getGiangVienHocSinhByMa(maGVHS);
        int trangThai = 1;

        DeCuong dcct = new DeCuong(maDC, tenDC, dvhoctrinh, thoigian, dieukien, muctieu, noiDung, tieuchuan, nam, gvhs, trangThai);
        if (DCCT_SERVICE.chinhsuaDeCuong(dcct)) {
            List<DeCuong> dcctList = DCCT_SERVICE.getAllDeCuong();
            request.setAttribute("dcctList", dcctList);
            request.setAttribute(util.Constants.PAGE, "manage-dcct");
            request.setAttribute("msgResult", "Bạn đã sửa đề cương chi tiết thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute("msgResult", "Có lỗi xảy ra, sửa đề cương chi tiết thất bại!");
            request.setAttribute(util.Constants.PAGE, "editDCCT");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void doDel(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maDC = Integer.parseInt(request.getParameter("id"));
        if (DCCT_SERVICE.xoaDeCuong(maDC)) {
            List<DeCuong> dcctList = DCCT_SERVICE.getAllDeCuong();
            request.setAttribute("dcctList", dcctList);
            request.setAttribute(util.Constants.PAGE, "manage-dcct");
            request.setAttribute("msgResult", "Bạn đã sửa đề cương chi tiết thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute(util.Constants.PAGE, "manage-dcct");
            request.setAttribute("msgResult", "Có lỗi xảy ra, sửa đề cương chi tiết thất bại");
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
    }// </editor-fold>

}
