/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.service.GiangVienHocSinhDAOService;
import model.entities.GiangVienHocSinh;

/**
 *
 * @author Khoa
 */
public class GiangVienHocSinhDAO implements GiangVienHocSinhDAOService{
    public static GiangVienHocSinhDAO giangvienhocsinhDAO;
    
    public static GiangVienHocSinhDAO getInstance(){
        if(giangvienhocsinhDAO == null){
            giangvienhocsinhDAO = new GiangVienHocSinhDAO();
        }
        return giangvienhocsinhDAO;
    }

    @Override
    public List<GiangVienHocSinh> getAllGiangVienHocSinh() {
        List<GiangVienHocSinh> listGVHS = new ArrayList<GiangVienHocSinh>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_giangvien_hocsinh";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {                
                GiangVienHocSinh giangvienhocsinh = new GiangVienHocSinh();
                giangvienhocsinh.setMaGVHS(rs.getInt("maGVHS"));
                giangvienhocsinh.setTenGVHS(rs.getString("tenGVHS"));
                giangvienhocsinh.setDiachi(rs.getString("diachi"));
                giangvienhocsinh.setDienthoai(rs.getString("dienthoai"));
                giangvienhocsinh.setNgaysinh(rs.getDate("ngaysinh"));
                giangvienhocsinh.setDonvi(rs.getString("donvi"));
                giangvienhocsinh.setTrinhdo(rs.getInt("trinhdo"));
                giangvienhocsinh.setTrangthai(rs.getInt("trinhdo"));
                
                listGVHS.add(giangvienhocsinh);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listGVHS;
    }

    @Override
    public GiangVienHocSinh getGiangVienHocSinhByMa(int maGVHS) {
        GiangVienHocSinh gVienHS = new GiangVienHocSinh();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_giangvien_hocsinh where maGVHS = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, maGVHS);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {                
                GiangVienHocSinh giangvienhocsinh = new GiangVienHocSinh();
                giangvienhocsinh.setMaGVHS(rs.getInt("maGVHS"));
                giangvienhocsinh.setTenGVHS(rs.getString("tenGVHS"));
                giangvienhocsinh.setDiachi(rs.getString("diachi"));
                giangvienhocsinh.setDienthoai(rs.getString("dienthoai"));
                giangvienhocsinh.setNgaysinh(rs.getDate("ngaysinh"));
                giangvienhocsinh.setDonvi(rs.getString("donvi"));
                giangvienhocsinh.setTrinhdo(rs.getInt("trinhdo"));
                giangvienhocsinh.setTrangthai(rs.getInt("trangthai"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return gVienHS;
    }

    @Override
    public GiangVienHocSinh getGiangVienHocSinhByTen(String tenGVHS) {
        GiangVienHocSinh gVienHS = new GiangVienHocSinh();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_giangvien_hocsinh where tenGVHS = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tenGVHS);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {                
                GiangVienHocSinh giangvienhocsinh = new GiangVienHocSinh();
                giangvienhocsinh.setMaGVHS(rs.getInt("maGVHS"));
                giangvienhocsinh.setTenGVHS(rs.getString("tenGVHS"));
                giangvienhocsinh.setDiachi(rs.getString("diachi"));
                giangvienhocsinh.setDienthoai(rs.getString("dienthoai"));
                giangvienhocsinh.setNgaysinh(rs.getDate("ngaysinh"));
                giangvienhocsinh.setDonvi(rs.getString("donvi"));
                giangvienhocsinh.setTrinhdo(rs.getInt("trinhdo"));
                giangvienhocsinh.setTrangthai(rs.getInt("trinhdo"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return gVienHS;
    }

    @Override
    public List<GiangVienHocSinh> timkiemGiangVienHocSinh(String tukhoa, String dieukien) {
        return null;
    }

    @Override
    public List<GiangVienHocSinh> timkiemGiangVienHocSinhByTen(String tenGVHS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean themGiangVienHocSinh(GiangVienHocSinh gvhs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean chinhsuaGiangVienHocSinh(GiangVienHocSinh gvhs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeGiangVienHocSinh(GiangVienHocSinh gvhs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean restoreGiangVienHocSinh(GiangVienHocSinh gvhs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean xoaGiangVienHocSinh(GiangVienHocSinh gvhs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
