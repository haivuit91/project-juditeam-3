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
import model.dao.TuLieuDAO;
import model.dao.service.BaiGiangDAOService;
import model.dao.service.DeCuongDAOService;
import model.dao.service.GiangVienHocSinhDAOService;
import model.dao.service.SlideDAOService;
import model.dao.service.TuLieuDAOService;
import model.entities.BaiGiang;
import model.entities.DeCuong;
import model.entities.GiangVienHocSinh;
import model.entities.Slide;
import model.entities.TuLieu;

/**
 *
 * @author Cong Pham Dinh
 */
public class ShowListCatelories extends HttpServlet {

    private final BaiGiangDAOService BG_SERVICE = BaiGiangDAO.getInstance();
    private final GiangVienHocSinhDAOService GVHS_SERVICE = GiangVienHocSinhDAO.getInstance();
    private final DeCuongDAOService DCCT_SERVICE = DeCuongDAO.getInstance();
    private final SlideDAOService SL_SERVICE = SlideDAO.getInstance();
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
                case "dsbg":
                    List<BaiGiang> bgList = BG_SERVICE.getAllBaiGiang();
                    request.setAttribute("bgList", bgList);
                    request.setAttribute(util.Constants.PAGE, "dsbg");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                    break;
                case "dsdcct":
                    List<DeCuong> dcList = DCCT_SERVICE.getAllDeCuong();
                    request.setAttribute("dcList", dcList);
                    request.setAttribute(util.Constants.PAGE, "dsdcct");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                    break;
                case "dsslide":
                    List<Slide> slList = SL_SERVICE.getAllSlide();
                    request.setAttribute("slList", slList);
                    request.setAttribute(util.Constants.PAGE, "dsslide");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                    break;
                case "dstl":
                    List<TuLieu> tlList = TL_SERVICE.getAllTuLieu();
                    request.setAttribute("tlList", tlList);
                    request.setAttribute(util.Constants.PAGE, "dstl");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                    break;
                case "dsgv":
                    List<GiangVienHocSinh> gvhsList = GVHS_SERVICE.getAllGiangVienHocSinh();
                    request.setAttribute("gvhsList", gvhsList);
                    request.setAttribute(util.Constants.PAGE, "dsgvhs");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                    break;
                case "dshs":
                    List<GiangVienHocSinh> hsList = GVHS_SERVICE.getAllGiangVienHocSinh();
                    request.setAttribute("hsList", hsList);
                    request.setAttribute(util.Constants.PAGE, "dshs");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                    break;
            }
        }
        String details = request.getParameter("details");
        String strID = request.getParameter("id");
        if (details != null && strID != null) {
            int id = Integer.parseInt(strID);
            switch (details) {
                case "bg":
                    BaiGiang bg = BG_SERVICE.getBaiGiangByMa(id);
                    request.setAttribute("bg", bg);
                    request.setAttribute(util.Constants.PAGE, "ct-bg");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                    break;
                case "slide":
                    Slide sl = SL_SERVICE.getSlideByMa(id);
                    request.setAttribute("sl", sl);
                    request.setAttribute(util.Constants.PAGE, "ct-slide");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                    break;
                case "dcct":
                    DeCuong dc = DCCT_SERVICE.getDeCuongByMa(id);
                    request.setAttribute("dc", dc);
                    request.setAttribute(util.Constants.PAGE, "ct-dcct");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
                    break;
                case "tl":
                    TuLieu tl = TL_SERVICE.getTuLieuByMaTL(id);
                    request.setAttribute("tl", tl);
                    request.setAttribute(util.Constants.PAGE, "ct-tl");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_HOME).forward(request, response);
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
