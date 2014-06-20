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
import model.dao.BaiGiangDAO;
import model.dao.GiangVienHocSinhDAO;
import model.dao.service.BaiGiangDAOService;
import model.dao.service.GiangVienHocSinhDAOService;
import model.entities.BaiGiang;
import model.entities.GiangVienHocSinh;

/**
 *
 * @author Admin
 */
public class BGManagement extends HttpServlet {

    private final BaiGiangDAOService BG_SERVICE = BaiGiangDAO.getInstance();
    private final GiangVienHocSinhDAOService GVHS_SERVICE = GiangVienHocSinhDAO.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String page = request.getParameter("page");
        if (page != null) {
            switch (page) {
                case "manage-bg":
                    List<BaiGiang> bgList = BG_SERVICE.getAllBaiGiang();
                    List<GiangVienHocSinh> gvhsListBG = GVHS_SERVICE.getAllGiangVienHocSinh();
                    request.setAttribute(util.Constants.GVHS_LIST, gvhsListBG);
                    request.setAttribute("bgList", bgList);
                    request.setAttribute(util.Constants.PAGE, "manage-bg");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
                    break;
                case "manage":
                    request.setAttribute(util.Constants.PAGE, "manage");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
                    break;
                case "add":
                    request.setAttribute(util.Constants.PAGE, "addbg");
                    List<GiangVienHocSinh> gvhsList = GVHS_SERVICE.getAllGiangVienHocSinh();
                    request.setAttribute(util.Constants.GVHS_LIST, gvhsList);
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
                    break;
                case "edit":
                    List<GiangVienHocSinh> gvhsListGVHS = GVHS_SERVICE.getAllGiangVienHocSinh();
                    request.setAttribute(util.Constants.GVHS_LIST, gvhsListGVHS);
                    int maBG = Integer.parseInt(request.getParameter("maBG"));
                    BaiGiang bg = BG_SERVICE.getBaiGiangByMa(maBG);
                    request.setAttribute(util.Constants.PAGE, "addbg");
                    request.setAttribute("bg", bg);
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
                    break;
                case "delete":
                    delete(request, response);
                    break;
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String submit = request.getParameter("submit");
        switch (submit) {
            case "Sửa":
                updateBG(request, response);
                break;
            case "Thêm mới":
                addNew(request, response);
                break;
            case "Xóa":
                delete(request, response);
                break;
            case "Tìm kiếm":
                search(request, response);
                break;
        }
    }

    private void addNew(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String tenBG = request.getParameter("tenBG");
        String noiDung = request.getParameter("noiDung");
        int nam = Integer.parseInt(request.getParameter("nam"));
        String strGVHS = request.getParameter("gvhs");
        String[] arr = strGVHS.split("-");
        int maGV = Integer.parseInt(arr[0]);
        GiangVienHocSinh gvhs = GVHS_SERVICE.getGiangVienHocSinhByMa(maGV);
        int trangThai = 1;

        BaiGiang bg = new BaiGiang(1, tenBG, noiDung, nam, gvhs, trangThai);
        if (BG_SERVICE.themBaiGiang(bg)) {
            List<BaiGiang> bgList = BG_SERVICE.getAllBaiGiang();
            request.setAttribute(util.Constants.BG_LIST, bgList);
            request.setAttribute(util.Constants.PAGE, "manage-bg");
            request.setAttribute("msgResult", "Bạn đã thêm Bài giảng thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            List<GiangVienHocSinh> gvhsList = GVHS_SERVICE.getAllGiangVienHocSinh();
            request.setAttribute(util.Constants.GVHS_LIST, gvhsList);
            request.setAttribute("msgResult", "Có lỗi xảy ra, thêm bài giảng thất bại!");
            request.setAttribute(util.Constants.PAGE, "addbg");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
//        List<BaiGiang> bgList = BG_SERVICE.getAllBaiGiang();
//        List<GiangVienHocSinh> gvhsListBG = GVHS_SERVICE.getAllGiangVienHocSinh();
//        request.setAttribute(util.Constants.GVHS_LIST, gvhsListBG);
//        request.setAttribute("bgList", bgList);
//        request.setAttribute(util.Constants.PAGE, "manage-bg");
//        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void updateBG(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maBG = Integer.parseInt(request.getParameter("maBG"));
        String tenBG = request.getParameter("tenBG");
        String noiDung = request.getParameter("noiDung");
        int nam = Integer.parseInt(request.getParameter("nam"));
        int maGVHS = Integer.parseInt(request.getParameter("gvhs"));
        GiangVienHocSinh gvhs = GVHS_SERVICE.getGiangVienHocSinhByMa(maGVHS);
        int trangThai = 1;

        BaiGiang bg = new BaiGiang(maBG, tenBG, noiDung, nam, gvhs, trangThai);
        if (BG_SERVICE.chinhsuaBaiGiang(bg)) {
            List<BaiGiang> bgList = BG_SERVICE.getAllBaiGiang();
            request.setAttribute("bgList", bgList);
            request.setAttribute(util.Constants.PAGE, "manage-bg");
            request.setAttribute("msgResult", "Bạn đã sửa bài giảng thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute("msgResult", "Có lỗi xảy ra, sửa bài giảng thất bại!");
            request.setAttribute(util.Constants.PAGE, "addbg");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maBG = Integer.parseInt(request.getParameter("maBG"));
        if (BG_SERVICE.xoaBaiGiang(maBG)) {
            List<BaiGiang> bgList = BG_SERVICE.getAllBaiGiang();
            List<GiangVienHocSinh> gvhsListBG = GVHS_SERVICE.getAllGiangVienHocSinh();
            request.setAttribute(util.Constants.GVHS_LIST, gvhsListBG);
            request.setAttribute("bgList", bgList);
            request.setAttribute(util.Constants.PAGE, "manage-bg");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute(util.Constants.PAGE, "manage-bg");
            request.setAttribute("msgResult", "Bạn đã sửa bài giảng thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tenBG = request.getParameter("tenBG");
        List<BaiGiang> bgList = BG_SERVICE.timBaiGiangByTen(tenBG);
        request.setAttribute(util.Constants.BG_LIST, bgList);
        request.setAttribute(util.Constants.PAGE, "manage-bg");
        request.removeAttribute(util.Constants.MSG_RESULT);
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
