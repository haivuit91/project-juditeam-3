/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.Date;
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
public class GiangVienHocSinhDAO implements GiangVienHocSinhDAOService {

    public static GiangVienHocSinhDAO giangvienhocsinhDAO;

    public static GiangVienHocSinhDAO getInstance() {
        if (giangvienhocsinhDAO == null) {
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
    public List<GiangVienHocSinh> timkiemGiangVienHocSinhByTen(String key) {
        String sql;
        List<GiangVienHocSinh> listGVHS = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            sql = "select * from tbl_giangvien_hocsinh where tenGVHS like '%" + key + "%' ";
            PreparedStatement sm = conn.prepareStatement(sql);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                GiangVienHocSinh giangVienHocSinh = new GiangVienHocSinh();
                giangVienHocSinh.setTenGVHS(rs.getString("tenGVHS"));
                giangVienHocSinh.setDiachi(rs.getString("diachi"));
                giangVienHocSinh.setDienthoai(rs.getString("dienthoai"));
                giangVienHocSinh.setNgaysinh(rs.getDate("ngaysinh"));
                giangVienHocSinh.setDonvi(rs.getString("donvi"));
                giangVienHocSinh.setTrinhdo(rs.getInt("trinhdo"));
                giangVienHocSinh.setTrangthai(rs.getInt("trangthai"));
                listGVHS.add(giangVienHocSinh);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listGVHS;
    }

    @Override
    public boolean themGiangVienHocSinh(GiangVienHocSinh gvhs) {
        boolean isCheck = false;
        String sql = "insert into tbl_giangvien_hocsinh (tenGVHS, diachi, dienthoai, ngaysinh, donvi, trinhdo, trangthai) values(?,?,?,?,?,?,?)";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, gvhs.getTenGVHS());
            pstmt.setString(2, gvhs.getDiachi());
            pstmt.setString(3, gvhs.getDienthoai());
            pstmt.setDate(4, (Date) gvhs.getNgaysinh());
            pstmt.setString(5, gvhs.getDonvi());
            pstmt.setInt(6, gvhs.getTrinhdo());
            pstmt.setInt(7, gvhs.getTrangthai());
            return pstmt.executeUpdate() == 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return isCheck;
    }

    @Override
    public boolean chinhsuaGiangVienHocSinh(GiangVienHocSinh gvhs) {
        boolean isCheck = false;
        String sql = "update tbl_giangvien_hocsinh set tenGVHS = ?, diachi = ?, dienthoai = ?, ngaysinh = ?, donvi = ?, trinhdo = ?, trangthai = ?";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, gvhs.getTenGVHS());
            pstmt.setString(2, gvhs.getDiachi());
            pstmt.setString(3, gvhs.getDienthoai());
            pstmt.setDate(4, (Date) gvhs.getNgaysinh());
            pstmt.setString(5, gvhs.getDonvi());
            pstmt.setInt(6, gvhs.getTrinhdo());
            pstmt.setInt(7, gvhs.getTrangthai());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return isCheck;
    }

    @Override
    public boolean xoaGiangVienHocSinh(int maGVHS) {
        boolean isCheck = false;
        String sql = "delete from tbl_giangvien_hocsinh where maGVHS =?";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement sm = conn.prepareStatement(sql);
            sm.setInt(1, maGVHS);
            return sm.executeUpdate() == 1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return isCheck;
    }
}
