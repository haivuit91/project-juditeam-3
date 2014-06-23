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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.service.BaiGiangDAOService;
import model.entities.BaiGiang;
import model.entities.GiangVienHocSinh;

/**
 *
 * @author Khoa
 */
public class BaiGiangDAO implements BaiGiangDAOService {

    private static BaiGiangDAO baigiangDAO;

    public static BaiGiangDAO getInstance() {
        if (baigiangDAO == null) {
            baigiangDAO = new BaiGiangDAO();
        }
        return baigiangDAO;
    }

    @Override
    public List<BaiGiang> getAllBaiGiang() {
        List<BaiGiang> listBaiGiang = new ArrayList<BaiGiang>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_baigiang ORDER BY maBG DESC";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                BaiGiang baigiang = new BaiGiang();
                baigiang.setMaBG(rs.getInt("maBG"));
                baigiang.setTenBG(rs.getString("tenBG"));
                baigiang.setNoidung(rs.getString("noidung"));
                baigiang.setNam(rs.getInt("nam"));
                GiangVienHocSinh gvienhsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                baigiang.setGiangVienHocSinh(gvienhsinh);
                baigiang.setTlThamkhao(rs.getString("tlThamkhao"));
                baigiang.setTrangthai(rs.getInt("trangthai"));

                listBaiGiang.add(baigiang);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listBaiGiang;
    }

    @Override
    public BaiGiang getBaiGiangByMa(int maBG) {
        BaiGiang baigiang = new BaiGiang();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_baigiang where maBG = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, maBG);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                baigiang.setMaBG(rs.getInt("maBG"));
                baigiang.setTenBG(rs.getString("tenBG"));
                baigiang.setNoidung(rs.getString("noidung"));
                baigiang.setNam(rs.getInt("nam"));
                GiangVienHocSinh gvienhsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                baigiang.setGiangVienHocSinh(gvienhsinh);
                baigiang.setTlThamkhao(rs.getString("tlThamkhao"));
                baigiang.setTrangthai(rs.getInt("trangthai"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return baigiang;
    }

    @Override
    public BaiGiang getBaiGiangByTenBG(String tenBG) {
        BaiGiang baigiang = new BaiGiang();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_baigiang where tenBG = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tenBG);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                baigiang.setMaBG(rs.getInt("maBG"));
                baigiang.setTenBG(rs.getString("tenBG"));
                baigiang.setNoidung(rs.getString("noidung"));
                baigiang.setNam(rs.getInt("nam"));
                GiangVienHocSinh gvienhsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                baigiang.setGiangVienHocSinh(gvienhsinh);
                baigiang.setTlThamkhao(rs.getString("tlThamkhao"));
                baigiang.setTrangthai(rs.getInt("trangthai"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return baigiang;
    }

    @Override
    public List<BaiGiang> timkiemBaiGiang(String noidung, int nam, GiangVienHocSinh gvhs) {
        String sql = "";
        List<BaiGiang> listBaiGiang = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            sql = "select * from tbl_baigiang where nam = ? and maGVHS = ? and noidung like '%" + noidung + "%' ";
            PreparedStatement sm = conn.prepareStatement(sql);
            sm.setInt(1, nam);
            sm.setInt(2, gvhs.getMaGVHS());
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                BaiGiang baigiang = new BaiGiang();
                baigiang.setMaBG(rs.getInt("maBG"));
                baigiang.setTenBG(rs.getString("tenBG"));
                baigiang.setNoidung(rs.getString("noidung"));
                baigiang.setNam(rs.getInt("nam"));
                GiangVienHocSinh giangvienhocsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                baigiang.setGiangVienHocSinh(giangvienhocsinh);
                baigiang.setTlThamkhao(rs.getString("tlThamkhao"));
                baigiang.setTrangthai(rs.getInt("trangthai"));
                listBaiGiang.add(baigiang);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listBaiGiang;
    }

    @Override
    public boolean themBaiGiang(BaiGiang bg) {
        boolean isCheck = false;
        String sql = "insert into tbl_baigiang (tenBG, noidung, nam, maGVHS, tlThamkhao, trangthai) values(?,?,?,?,?,?)";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, bg.getTenBG());
            pstmt.setString(2, bg.getNoidung());
            pstmt.setInt(3, bg.getNam());
            pstmt.setInt(4, bg.getGiangVienHocSinh().getMaGVHS());
            pstmt.setString(5, bg.getTlThamkhao());
            pstmt.setInt(6, bg.getTrangthai());
//            return pstmt.executeUpdate() == 1;
            pstmt.executeUpdate();
            isCheck = true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return isCheck;
    }

    @Override
    public boolean chinhsuaBaiGiang(BaiGiang baigiang) {
        boolean isCheck = false;
        String sql = "update tbl_baigiang set tenBG=?,noidung=?,nam=?,maGVHS=?, tlThamkhao=?, trangthai=? where maBG = ?";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, baigiang.getTenBG());
            pstmt.setString(2, baigiang.getNoidung());
            pstmt.setInt(3, baigiang.getNam());
            pstmt.setInt(4, baigiang.getGiangVienHocSinh().getMaGVHS());
            pstmt.setInt(5, baigiang.getTrangthai());
            pstmt.setString(6, baigiang.getTlThamkhao());
            pstmt.setInt(7, baigiang.getMaBG());
            pstmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return isCheck;
    }

    @Override
    public boolean xoaBaiGiang(int maBG) {
        boolean isCheck = false;
        String sql = "delete from tbl_baigiang where maBG =?";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement sm = conn.prepareStatement(sql);
            sm.setInt(1, maBG);
            sm.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return isCheck;
    }

    @Override
    public List<BaiGiang> timkiemBaiGiangByMaGVHS(int maGVHS) {
        List<BaiGiang> listBaiGiang = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_baigiang where maGVHS = ? ";
            PreparedStatement sm = conn.prepareStatement(sql);
            sm.setInt(1, maGVHS);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                BaiGiang baigiang = new BaiGiang();
                baigiang.setMaBG(rs.getInt("maBG"));
                baigiang.setTenBG(rs.getString("tenBG"));
                baigiang.setNoidung(rs.getString("noidung"));
                baigiang.setNam(rs.getInt("nam"));
                baigiang.setTlThamkhao(rs.getString("tlThamkhao"));
                baigiang.setTrangthai(rs.getInt("trangthai"));
                listBaiGiang.add(baigiang);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return listBaiGiang;

    }

    @Override
    public List<BaiGiang> timBaiGiangByTen(String tenBG) {
        List<BaiGiang> listBaiGiang = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_baigiang where tenBG like '" + "%" + tenBG + "%" + "' or noidung like '" + "%" + tenBG + "%" + "' or nam like '" + "%" + tenBG + "%" + "'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                BaiGiang baigiang = new BaiGiang();
                baigiang.setMaBG(rs.getInt("maBG"));
                baigiang.setTenBG(rs.getString("tenBG"));
                baigiang.setNoidung(rs.getString("noidung"));
                baigiang.setNam(rs.getInt("nam"));
                GiangVienHocSinh giangvienhocsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                baigiang.setGiangVienHocSinh(giangvienhocsinh);
                baigiang.setTlThamkhao(rs.getString("tlThamkhao"));
                baigiang.setTrangthai(rs.getInt("trangthai"));
                listBaiGiang.add(baigiang);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listBaiGiang;
    }

    @Override
    public List<BaiGiang> timkiemBaiGiangByMaGVHS(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
