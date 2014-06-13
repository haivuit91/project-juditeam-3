/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.SlideDAO;
import model.dao.BaiGiangDAO;
import model.dao.GiangVienHocSinhDAO;
import model.dao.TuLieuDAO;
import model.dao.service.SlideDAOService;
import model.dao.service.BaiGiangDAOService;
import model.dao.service.GiangVienHocSinhDAOService;
import model.dao.service.TuLieuDAOService;
import model.entities.Slide;
import model.entities.BaiGiang;
import model.entities.GiangVienHocSinh;
import model.entities.TuLieu;
import util.DataFile;

/**
 *
 * @author Welcomes
 */
public class Page extends HttpServlet {

    private final TuLieuDAOService TL_SERVICE = TuLieuDAO.getInstance();
    private final BaiGiangDAOService BG_SERVICE = BaiGiangDAO.getInstance();
    private final GiangVienHocSinhDAOService GVHS_SERVICE = GiangVienHocSinhDAO.getInstance();

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        ServletContext context = getServletContext();
        boolean isLoaded = false;
        if (context.getAttribute("loaded") != null) {
            isLoaded = (boolean) context.getAttribute("loaded");
        }
        if (!isLoaded) {
            DataFile.loadFile();
            context.setAttribute("loaded", true);
        }
    }

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
        if (page != null) {
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
<<<<<<< .mine
=======
                case "manage-bg":
                    List<BaiGiang> bgList = BG_SERVICE.getAllBaiGiang();
                    List<GiangVienHocSinh> gvhsListBG = GVHS_SERVICE.getAllGiangVienHocSinh();
                    request.setAttribute(util.Constants.GVHS_LIST, gvhsListBG);
                    request.setAttribute("bgList", bgList);
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
                    List<Slide> slideList = SL_SERVICE.getAllSlide();
                    List<GiangVienHocSinh> gvhsListSL = GVHS_SERVICE.getAllGiangVienHocSinh();
                    request.setAttribute(util.Constants.GVHS_LIST, gvhsListSL);
                    request.setAttribute(util.Constants.SL_LIST, slideList);
                    request.setAttribute(util.Constants.PAGE, "manage-sl");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
                    break;
                case "manage-tl":
                    List<TuLieu> tulieuList = TL_SERVICE.getAllTuLieu();
                    request.setAttribute(util.Constants.TL_LIST, tulieuList);
                    request.setAttribute(util.Constants.PAGE, "manage-tl");
                    request.removeAttribute(util.Constants.MSG_RESULT);
                    request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
                    break;
>>>>>>> .r150
            }
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
