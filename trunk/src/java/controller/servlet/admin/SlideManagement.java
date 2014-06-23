/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.servlet.admin;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import org.apache.tomcat.util.http.fileupload.FileItemIterator;
import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import util.FileUpload;
import util.Support;

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
        request.setCharacterEncoding("UTF-8");
        String action = null;
        String maSlide = null;
        String tenSlide = null;
        String noiDung = null;
        String nam = null;
        String gvhs = null;
        String tl = null;
        String fileName = "";
        String file = "";
        boolean isUploadSuccess = false;
        ServletFileUpload fileUpload = new ServletFileUpload();
        try {
            FileItemIterator itr = fileUpload.getItemIterator(request);
            while (itr.hasNext()) {
                FileItemStream fileItemStream = itr.next();
                if (fileItemStream.isFormField()) {
                    String fieldName = fileItemStream.getFieldName();
                    InputStream is = fileItemStream.openStream();

                    byte[] b = new byte[is.available()];
                    is.read(b);
                    String value = new String(b, "UTF-8");

                    if (fieldName.equals("submit")) {
                        action = value;
                    }
                    if (fieldName.equals("maSlide")) {
                        maSlide = value;
                    }
                    if (fieldName.equals("tenSlide")) {
                        tenSlide = value;
                    }
                    if (fieldName.equals("noidung")) {
                        noiDung = value;
                    }
                    if (fieldName.equals("nam")) {
                        nam = value;
                    }
                    if (fieldName.equals("gvhs")) {
                        gvhs = value;
                    }
                    if (fieldName.equals("tulieu")) {
                        tl = value;
                    }
                    if (fieldName.equals("fileName")) {
                        file = value;
                    }
                } else {
                    String realPath = getServletContext().getRealPath("/");
                    String filePath = realPath.replace("\\build\\web", "\\web\\files");//Duong dan luu file
                    fileName = fileItemStream.getName();
                    StringTokenizer token = new StringTokenizer(fileName, ".");
                    String fileNameExtension = "";
                    while (token.hasMoreElements()) {
                        fileNameExtension = token.nextElement().toString();
                    }
                    if (!fileName.equals("")) {
                        fileName = Support.toUrlFriendly(fileName);
                        isUploadSuccess = FileUpload.processFile(filePath, fileItemStream, fileName);
                    }
                }
                if (action != null) {
                    switch (action) {
                        case "Sửa":
                            if (fileName.equals("")) {
                                editSlide(request, response, maSlide, tenSlide, noiDung, nam, gvhs, tl, file);
                            } else {
                                editSlide(request, response, maSlide, tenSlide, noiDung, nam, gvhs, tl, fileName);
                            }
                            break;
                        case "Thêm mới":
                            addSlide(request, response, tenSlide, noiDung, nam, gvhs, tl, fileName);
                            break;
                        case "Tìm kiếm":
                            search(request, response);
                            break;
                    }
                }
            }
        } catch (FileUploadException ex) {
            Logger.getLogger(BGManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void doAddnew(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<TuLieu> tl = TL_SERVICE.getAllTuLieu();
        request.setAttribute("tl", tl);
        List<GiangVienHocSinh> GV = GVHS_SERVICE.getAllGVHS();
        request.setAttribute("GV", GV);
        request.setAttribute(util.Constants.PAGE, "manage-add-edit-sl");
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void addSlide(HttpServletRequest request, HttpServletResponse response, String tenSlide, String noidung,
            String nam, String gvhs, String tulieu, String fileName) throws ServletException, IOException {
        int namxb = Integer.parseInt(nam);
        int maGVHS = Integer.parseInt(gvhs);
        int maTL = Integer.parseInt(tulieu);
        GiangVienHocSinh gvhsSL = GVHS_SERVICE.getGiangVienHocSinhByMa(maGVHS);
        TuLieu tl = TL_SERVICE.getTuLieuByMaTL(maTL);

        Slide sl = new Slide(1, tenSlide, noidung, namxb, gvhsSL, tl, fileName, 1);
        if (SL_SERVICE.themSlide(sl)) {
            List<Slide> slList = SL_SERVICE.getAllSlide();
            request.setAttribute("slideList", slList);
            request.setAttribute(util.Constants.PAGE, "manage-sl");
            request.setAttribute("msgResult", "Bạn đã thêm Slide thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute("msgResult", "Có lỗi xảy ra, thêm slide thất bại!");
            request.setAttribute(util.Constants.PAGE, "manage-add-edit-sl");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void doEdit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maSlide = Integer.parseInt(request.getParameter("id"));
        Slide sl = SL_SERVICE.getSlideByMa(maSlide);
        request.setAttribute("sl", sl);
        List<TuLieu> tl = TL_SERVICE.getAllTuLieu();
        request.setAttribute("tl", tl);
        List<GiangVienHocSinh> GV = GVHS_SERVICE.getAllGVHS();
        request.setAttribute("GV", GV);
        request.setAttribute(util.Constants.PAGE, "manage-add-edit-sl");
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void editSlide(HttpServletRequest request, HttpServletResponse response, String maSlide, String tenSlide,
            String noidung, String nam, String gvhs, String tulieu, String fileName) throws ServletException, IOException {
        int ma = Integer.parseInt(maSlide);
        int namxb = Integer.parseInt(nam);
        int maGVHS = Integer.parseInt(gvhs);
        int maTL = Integer.parseInt(tulieu);
        GiangVienHocSinh gvhsSL = GVHS_SERVICE.getGiangVienHocSinhByMa(maGVHS);
        TuLieu tl = TL_SERVICE.getTuLieuByMaTL(maTL);

        Slide sl = new Slide(ma, tenSlide, noidung, namxb, gvhsSL, tl, fileName, 1);
        if (SL_SERVICE.chinhsuaSlide(sl)) {
            List<Slide> slList = SL_SERVICE.getAllSlide();
            request.setAttribute("slideList", slList);
            request.setAttribute(util.Constants.PAGE, "manage-sl");
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
            List<Slide> slideList = SL_SERVICE.getAllSlide();
            request.setAttribute(util.Constants.SL_LIST, slideList);
            request.setAttribute(util.Constants.PAGE, "manage-sl");
            request.setAttribute("msgResult", "Bạn đã xóa Slide thành công");
            request.removeAttribute(util.Constants.MSG_RESULT);
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute(util.Constants.PAGE, "manage-slide");
            request.setAttribute("msgResult", "Có lỗi xảy ra, xóa Slide thất bại");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tukhoa = request.getParameter("tukhoa");
        List<Slide> slideList = SL_SERVICE.timkiemAllSlide(tukhoa);
        request.setAttribute(util.Constants.SL_LIST, slideList);
        request.setAttribute(util.Constants.PAGE, "manage-sl");
        request.removeAttribute(util.Constants.MSG_RESULT);
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
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
