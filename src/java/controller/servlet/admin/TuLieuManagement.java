/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.servlet.admin;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.TuLieuDAO;
import model.dao.service.TuLieuDAOService;
import model.entities.TuLieu;
import org.apache.tomcat.util.http.fileupload.FileItemIterator;
import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import util.FileUpload;
import util.Support;

/**
 *
 * @author HAI VU
 */
public class TuLieuManagement extends HttpServlet {

    private final TuLieuDAOService TL_SERVICE = TuLieuDAO.getInstance();

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
        try (PrintWriter out = response.getWriter()) {
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
        response.setContentType("text/html;charset=UTF-8");
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
        String p = request.getParameter("p");
        if (p != null) {
            switch (p) {
                case "manage-tl":
                    List<TuLieu> tulieuList = TL_SERVICE.getAllTuLieu();
                    request.setAttribute(util.Constants.TL_LIST, tulieuList);
                    request.setAttribute(util.Constants.PAGE, "manage-tl");
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
        request.setCharacterEncoding("UTF-8");
        String action = null;
        String maTL = null;
        String tenTL = null;
        String noidung = null;
        String loaiTL = null;
        String nguonTL = null;
        String nam = null;
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
                    if (fieldName.equals("maTL")) {
                        maTL = value;
                    }
                    if (fieldName.equals("tenTL")) {
                        tenTL = value;
                    }
                    if (fieldName.equals("noidung")) {
                        noidung = value;
                    }
                    if (fieldName.equals("loaiTL")) {
                        loaiTL = value;
                    }
                    if (fieldName.equals("nguonTL")) {
                        nguonTL = value;
                    }
                    if (fieldName.equals("nam")) {
                        nam = value;
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
                                editTL(request, response, maTL, tenTL, noidung, loaiTL, nguonTL, nam, file);
                            } else {
                                editTL(request, response, maTL, tenTL, noidung, loaiTL, nguonTL, nam, fileName);
                            }
                            break;
                        case "Thêm mới":
                            addTL(request, response, tenTL, noidung, loaiTL, nguonTL, nam, fileName);
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
        request.setAttribute(util.Constants.PAGE, "manage-add-edit-tl");
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void addTL(HttpServletRequest request, HttpServletResponse response, String tenTL, String noidung, String loaiTL,
            String nguonTL, String nam, String fileName) throws ServletException, IOException {
        int namxb = Integer.parseInt(nam);

        TuLieu tl = new TuLieu(1, tenTL, noidung, loaiTL, nguonTL, namxb, fileName, 1);
        if (TL_SERVICE.themTuLieu(tl)) {
            List<TuLieu> tulieu = TL_SERVICE.getAllTuLieu();
            request.setAttribute("tulieuList", tulieu);
            request.setAttribute(util.Constants.PAGE, "manage-tl");
            request.setAttribute("msgResult", "Bạn đã thêm tư liệu thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute("msgResult", "Có lỗi xảy ra, thêm tư liệu thất bại!");
            request.setAttribute(util.Constants.PAGE, "manage-add-edit-tl");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void doEdit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maTL = Integer.parseInt(request.getParameter("id"));
        TuLieu tl = TL_SERVICE.getTuLieuByMaTL(maTL);
        request.setAttribute("tl", tl);
        request.setAttribute(util.Constants.PAGE, "manage-add-edit-tl");
        request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
    }

    private void editTL(HttpServletRequest request, HttpServletResponse response, String maTL, String tenTL, String noidung,
            String loaiTL, String nguonTL, String nam, String fileName) throws ServletException, IOException {
        int ma = Integer.parseInt(maTL);
        int namxb = Integer.parseInt(nam);

        TuLieu tl = new TuLieu(ma, tenTL, noidung, loaiTL, nguonTL, namxb, fileName, 1);
        if (TL_SERVICE.chinhsuaTuLieu(tl)) {
            List<TuLieu> tulieuList = TL_SERVICE.getAllTuLieu();
            request.setAttribute("tulieuList", tulieuList);
            request.setAttribute(util.Constants.PAGE, "manage-tl");
            request.setAttribute("msgResult", "Bạn đã sửa tư liệu thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute("msgResult", "Có lỗi xảy ra, sửa tư liệu thất bại!");
            request.setAttribute(util.Constants.PAGE, "manage-add-edit-tl");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void doDel(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maTL = Integer.parseInt(request.getParameter("id"));
        if (TL_SERVICE.xoaTuLieu(maTL)) {
            List<TuLieu> tulieuList = TL_SERVICE.getAllTuLieu();
            request.setAttribute("tulieuList", tulieuList);
            request.setAttribute(util.Constants.PAGE, "manage-tl");
            request.setAttribute("msgResult", "Bạn đã xóa tư liệu thành công");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        } else {
            request.setAttribute(util.Constants.PAGE, "manage-tl");
            request.setAttribute("msgResult", "Có lỗi xảy ra, xóa tư liệu thất bại");
            request.getRequestDispatcher(util.Constants.URL_ADMIN).forward(request, response);
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tukhoa = request.getParameter("tukhoa");
        List<TuLieu> tulieuList = TL_SERVICE.timkiemTuLieu(tukhoa);
        request.setAttribute(util.Constants.TL_LIST, tulieuList);
        request.setAttribute(util.Constants.PAGE, "manage-tl");
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
    }// </editor-fold>

}
