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
import model.dao.BaiGiangDAO;
import model.dao.GiangVienHocSinhDAO;
import model.dao.service.BaiGiangDAOService;
import model.dao.service.GiangVienHocSinhDAOService;
import model.entities.BaiGiang;
import model.entities.GiangVienHocSinh;
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
        String action = null;
        String tenBG = null;
        String noiDung = null;
        String nam = null;
        String gvhs = null;
        String fileName = "";
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
                    if (fieldName.equals("tenBG")) {
                        tenBG = value;
                    }
                    if (fieldName.equals("noiDung")) {
                        noiDung = value;
                    }
                    if (fieldName.equals("nam")) {
                        nam = value;
                    }
                    if (fieldName.equals("gvhs")) {
                        gvhs = value;
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
                            updateBG(request, response);
                            break;
                        case "Thêm mới":
                            addNew(request, response, tenBG, noiDung, nam, gvhs, fileName);
                            break;
                        case "Xóa":
                            delete(request, response);
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

    private void addNew(HttpServletRequest request, HttpServletResponse response, String tenBG, String noiDung, String nam, String gvhs, String fileName) throws ServletException, IOException {
        int namxb = Integer.parseInt(nam);
        String strGVHS = gvhs;
        String[] arr = strGVHS.split("-");
        int maGV = Integer.parseInt(arr[0]);
        GiangVienHocSinh magvhs = GVHS_SERVICE.getGiangVienHocSinhByMa(maGV);
        BaiGiang bg = new BaiGiang(1, tenBG, noiDung, namxb, magvhs, fileName, 1);
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
    }

    private void updateBG(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int maBG = Integer.parseInt(request.getParameter("maBG"));
        String tenBG = request.getParameter("tenBG");
        String noiDung = request.getParameter("noiDung");
        int nam = Integer.parseInt(request.getParameter("nam"));
        int maGVHS = Integer.parseInt(request.getParameter("gvhs"));
        GiangVienHocSinh gvhs = GVHS_SERVICE.getGiangVienHocSinhByMa(maGVHS);
        String tlThamkhao = request.getParameter("tlThamkhao");
        int trangThai = 1;

        BaiGiang bg = new BaiGiang(maBG, tenBG, noiDung, nam, gvhs, tlThamkhao, trangThai);
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
