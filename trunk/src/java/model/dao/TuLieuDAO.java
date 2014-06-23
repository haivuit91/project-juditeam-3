/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.dao.service.TuLieuDAOService;
import model.entities.TuLieu;

/**
 *
 * @author HAI VU
 */
public class TuLieuDAO implements TuLieuDAOService {

    private static TuLieuDAO tulieuDAO;

    public static TuLieuDAO getInstance() {
        if (tulieuDAO == null) {
            tulieuDAO = new TuLieuDAO();
        }
        return tulieuDAO;
    }

    @Override
    public List<TuLieu> getAllTuLieu() {
        List<TuLieu> tulieuList = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_tulieu";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                TuLieu tulieu = new TuLieu();
                tulieu.setMaTL(rs.getInt("maTL"));
                tulieu.setTenTL(rs.getString("tenTL"));
                tulieu.setNoidung(rs.getString("noidung"));
                tulieu.setLoaiTL(rs.getString("loaiTL"));
                tulieu.setNguonTL(rs.getString("nguonTL"));
                tulieu.setNam(rs.getInt("nam"));
                tulieu.setTlThamkhao(rs.getString("tlThamkhao"));
                tulieuList.add(tulieu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tulieuList;
    }

    @Override
    public TuLieu getTuLieuByMaTL(int maTL) {
        TuLieu tulieu = new TuLieu();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_tulieu where MaTL = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, maTL);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                tulieu.setMaTL(rs.getInt("maTL"));
                tulieu.setTenTL(rs.getString("tenTL"));
                tulieu.setNoidung(rs.getString("noidung"));
                tulieu.setLoaiTL(rs.getString("loaiTL"));
                tulieu.setNguonTL(rs.getString("nguonTL"));
                tulieu.setNam(rs.getInt("nam"));
                tulieu.setTlThamkhao(rs.getString("tlThamkhao"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tulieu;
    }

    @Override
    public TuLieu getTuLieuByTenTL(String tenTL) {
        TuLieu tulieu = new TuLieu();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_tulieu where tenTL = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tenTL);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                tulieu.setMaTL(rs.getInt("maTL"));
                tulieu.setTenTL(rs.getString("tenTL"));
                tulieu.setNoidung(rs.getString("noidung"));
                tulieu.setLoaiTL(rs.getString("loaiTL"));
                tulieu.setNguonTL(rs.getString("nguonTL"));
                tulieu.setNam(rs.getInt("nam"));
                tulieu.setTlThamkhao(rs.getString("tlThamkhao"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tulieu;
    }

    @Override
    public List<TuLieu> timkiemTuLieu(String tukhoa) {
        String sql = "";
        List<TuLieu> listTuLieu = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            sql = "select * from tbl_tulieu where tenTL like '" + "%" + tukhoa + "%" + "' or noidung like '" + "%" + tukhoa + "%" + "'"
                        + "or loaiTL like '" + "%" + tukhoa + "%" + "' or nguonTL like '" + "%" + tukhoa + "%" + "' or nam like '" + "%" + tukhoa + "%" + "'";
            PreparedStatement sm = conn.prepareStatement(sql);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                TuLieu tulieu = new TuLieu();
                tulieu.setMaTL(rs.getInt("maTL"));
                tulieu.setTenTL(rs.getString("tenTL"));
                tulieu.setNoidung(rs.getString("noidung"));
                tulieu.setLoaiTL(rs.getString("loaiTL"));
                tulieu.setNguonTL(rs.getString("nguonTL"));
                tulieu.setNam(rs.getInt("nam"));
                tulieu.setTlThamkhao(rs.getString("tlThamkhao"));
                listTuLieu.add(tulieu);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listTuLieu;
    }

    @Override
    public boolean themTuLieu(TuLieu tulieu) {
        boolean isCheck = false;
        String sql = "insert into tbl_tulieu (tenTL, noidung, loaiTL, nguonTL, nam, trangthai) values(?,?,?,?,?,?,?)";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tulieu.getTenTL());
            pstmt.setString(2, tulieu.getNoidung());
            pstmt.setString(3, tulieu.getLoaiTL());
            pstmt.setString(4, tulieu.getNguonTL());
            pstmt.setInt(5, tulieu.getNam());
            pstmt.setString(6, tulieu.getTlThamkhao());
            pstmt.setInt(7, tulieu.getTrangthai());
            return pstmt.executeUpdate() == 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return isCheck;
    }

    @Override
    public boolean chinhsuaTuLieu(TuLieu tulieu) {
        boolean isCheck = false;
        String sql = "update tbl_tulieu set tenTl=?,noidung=?,loaiTL=?,nguonTL=?,nam=?, tlThamkhao=?,trangthai=? where maTL = ?";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tulieu.getTenTL());
            pstmt.setString(2, tulieu.getNoidung());
            pstmt.setString(3, tulieu.getLoaiTL());
            pstmt.setString(4, tulieu.getNguonTL());
            pstmt.setInt(5, tulieu.getNam());
            pstmt.setString(6, tulieu.getTlThamkhao());
            pstmt.setInt(7, tulieu.getTrangthai());
            pstmt.setInt(8, tulieu.getMaTL());
            return pstmt.executeUpdate() == 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return isCheck;
    }

    @Override
    public boolean xoaTuLieu(int maTL) {
        boolean isCheck = false;
        String sql = "delete from tbl_tulieu where maTL =?";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement sm = conn.prepareStatement(sql);
            sm.setInt(1, maTL);
            return sm.executeUpdate() == 1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return isCheck;
    }

}
