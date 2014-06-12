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
import model.dao.service.TaiKhoanDAOService;
import model.entities.TaiKhoan;

/**
 *
 * @author HAI VU
 */
public class TaiKhoanDAO implements TaiKhoanDAOService {

    private static TaiKhoanDAO tkDAO;

    public static TaiKhoanDAO getInstance() {
        if (tkDAO == null) {
            tkDAO = new TaiKhoanDAO();
        }
        return tkDAO;
    }

    @Override
    public List<TaiKhoan> getAllTaiKhoan() {
        List<TaiKhoan> tkList = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_taikhoan";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setMaTK(rs.getInt("maTK"));
                tk.setTenTK(rs.getString("tenTK"));
                tk.setMatkhau(rs.getString("matkhau"));
                tk.setHoten(rs.getString("hoTen"));
                tk.setEmail(rs.getString("email"));
                tk.setDienthoai(rs.getString("dienthoai"));
                tk.setTrangthai(rs.getInt("trangThai"));
                tkList.add(tk);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return tkList;
    }

    @Override
    public TaiKhoan getTaiKhoanByMa(int maTK) {
        TaiKhoan tk = new TaiKhoan();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_taikhoan where maTK = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, maTK);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                tk.setMaTK(rs.getInt("maTK"));
                tk.setTenTK(rs.getString("tenTK"));
                tk.setMatkhau(rs.getString("matkhau"));
                tk.setHoten(rs.getString("hoTen"));
                tk.setEmail(rs.getString("email"));
                tk.setDienthoai(rs.getString("dienthoai"));
                tk.setTrangthai(rs.getInt("trangThai"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tk;
    }

    @Override
    public TaiKhoan getTaiKhoanByTenTK(String tenTK) {
        TaiKhoan tk = new TaiKhoan();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_taikhoan where tenTK = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tenTK);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                tk.setMaTK(rs.getInt("maTK"));
                tk.setTenTK(rs.getString("tenTK"));
                tk.setMatkhau(rs.getString("matkhau"));
                tk.setHoten(rs.getString("hoTen"));
                tk.setEmail(rs.getString("email"));
                tk.setDienthoai(rs.getString("dienthoai"));
                tk.setTrangthai(rs.getInt("trangThai"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tk;
    }

    @Override
    public boolean kiemTraDangNhap(String tenTK, String matkhau) {
        boolean isCheck = false;
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_taikhoan where tenTK = ? and matkhau = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tenTK);
            pstmt.setString(2, matkhau);
            ResultSet rs = pstmt.executeQuery();
            if (rs != null) {
                isCheck = rs.next();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return isCheck;
    }

    @Override
    public boolean chinhsuaTaiKhoan(TaiKhoan taikhoan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean xoaTaiKhoan(int maTK) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
