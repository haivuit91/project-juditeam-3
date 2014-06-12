/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.servlet.admin;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.GiangVienHocSinhDAO;
import model.dao.service.GiangVienHocSinhDAOService;
import model.entities.GiangVienHocSinh;

/**
 *
 * @author Admin
 */
public class GVHSManagement extends HttpServlet {

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
        request.setAttribute(util.Constants.PAGE, "addGVHS");
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void addGVHS(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tenGVHS = request.getParameter("tenGVHS");
        String diaChi = request.getParameter("diaChi");
        String dienThoai = request.getParameter("dienThoai");
        String ngaySinh = request.getParameter("ngaySinh");
        String donVi = request.getParameter("donVi");
        String[] birthDay = ngaySinh.split("-");
        Date ns = util.Support.convertToDate(birthDay[0], birthDay[1], birthDay[2]);
        int trinhDo = Integer.parseInt(request.getParameter("trinhDo"));
        int trangThai = 1;

        GiangVienHocSinh gvhs = new GiangVienHocSinh(1, tenGVHS, diaChi, dienThoai, ns, donVi, trinhDo, trangThai);
        if (GVHS_SERVICE.themGiangVienHocSinh(gvhs)) {
            List<GiangVienHocSinh> gvhsList = GVHS_SERVICE.getAllGiangVienHocSinh();
            request.setAttribute("gvhsList", gvhsList);
            request.setAttribute(util.Constants.PAGE, "manage-gvhs");
            request.setAttribute("msgResult", "Bạn đã thêm GVHS thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute("msgResult", "Có lỗi xảy ra, thêm GVHS thất bại!");
            request.setAttribute(util.Constants.PAGE, "addGVHS");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void doEdit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maGVHS = Integer.parseInt(request.getParameter("id"));
        GiangVienHocSinh gvhs = GVHS_SERVICE.getGiangVienHocSinhByMa(maGVHS);
        request.setAttribute("gvhs", gvhs);
        request.setAttribute(util.Constants.PAGE, "addGVHS");
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void editGVHS(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maGVHS = Integer.parseInt(request.getParameter("id"));
        String tenGVHS = request.getParameter("tenGVHS");
        String diaChi = request.getParameter("diaChi");
        String dienThoai = request.getParameter("dienThoai");
        String ngaySinh = request.getParameter("ngaySinh");
        String donVi = request.getParameter("donVi");
        String[] birthDay = ngaySinh.split("-");
        Date ns = util.Support.convertToDate(birthDay[0], birthDay[1], birthDay[2]);
        int trinhDo = Integer.parseInt(request.getParameter("trinhDo"));
        int trangThai = 1;

        GiangVienHocSinh gvhs = new GiangVienHocSinh(maGVHS, tenGVHS, diaChi, dienThoai, ns, donVi, trinhDo, trangThai);
        if (GVHS_SERVICE.chinhsuaGiangVienHocSinh(gvhs)) {
            List<GiangVienHocSinh> gvhsList = GVHS_SERVICE.getAllGiangVienHocSinh();
            request.setAttribute("gvhsList", gvhsList);
            request.setAttribute(util.Constants.PAGE, "manage-gvhs");
            request.setAttribute("msgResult", "Bạn đã sửa GVHS thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute("msgResult", "Có lỗi xảy ra, sửa GVHS thất bại!");
            request.setAttribute(util.Constants.PAGE, "addGVHS");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void doDel(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maGVHS = Integer.parseInt(request.getParameter("id"));
        if (GVHS_SERVICE.xoaGiangVienHocSinh(maGVHS)) {
            List<GiangVienHocSinh> gvhsList = GVHS_SERVICE.getAllGiangVienHocSinh();
            request.setAttribute("gvhsList", gvhsList);
            request.setAttribute(util.Constants.PAGE, "manage-gvhs");
            request.setAttribute("msgResult", "Bạn đã xóa GVHS thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute(util.Constants.PAGE, "manage-gvhs");
            request.setAttribute("msgResult", "Có lỗi xảy ra, xóa GVHS thất bại");
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
