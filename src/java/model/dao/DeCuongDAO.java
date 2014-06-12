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
import model.dao.service.DeCuongDAOService;
import model.entities.DeCuong;
import model.entities.GiangVienHocSinh;

/**
 *
 * @author Khoa
 */
public class DeCuongDAO implements DeCuongDAOService {

    @Override
    public List<DeCuong> getAllDeCuong() {
        List<DeCuong> listDC = new ArrayList<DeCuong>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_dcct";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                DeCuong decuong = new DeCuong();
                decuong.setMaDC(rs.getInt("maDC"));
                decuong.setTenDC(rs.getString("tenDC"));
                decuong.setDvhoctrinh(rs.getInt("dvhoctrinh"));
                decuong.setThoigian(rs.getString("thoigian"));
                decuong.setDieukien(rs.getString("dieukien"));
                decuong.setMuctieu(rs.getString("muctieu"));
                decuong.setNoidung(rs.getString("noidung"));
                decuong.setTieuchuan(rs.getString("tieuchuan"));
                decuong.setNam(rs.getInt("nam"));
                GiangVienHocSinh giangvienhocsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                decuong.setGiangvienhocsinh(giangvienhocsinh);
                decuong.setTrangthai(rs.getInt("trangthai"));
                listDC.add(decuong);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listDC;
    }

    @Override
    public DeCuong getDeCuongByMa(int maDC) {
        DeCuong decuong = new DeCuong();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_dcct where maDC = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, maDC);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                decuong.setMaDC(rs.getInt("maDC"));
                decuong.setTenDC(rs.getString("tenDC"));
                decuong.setDvhoctrinh(rs.getInt("dvhoctrinh"));
                decuong.setThoigian(rs.getString("thoigian"));
                decuong.setDieukien(rs.getString("dieukien"));
                decuong.setMuctieu(rs.getString("muctieu"));
                decuong.setNoidung(rs.getString("noidung"));
                decuong.setTieuchuan(rs.getString("tieuchuan"));
                decuong.setNam(rs.getInt("nam"));
                GiangVienHocSinh giangvienhocsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                decuong.setGiangvienhocsinh(giangvienhocsinh);
                decuong.setTrangthai(rs.getInt("trangthai"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return decuong;
    }

    @Override
    public List<DeCuong> timkiemDeCuongByTenDC(String key, int nam) {
        String sql = "";
        List<DeCuong> listDeCuong = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            sql = "select * from tbl_dcct where nam = " + nam + "& tenDC like '%" + key + "%' ";
            PreparedStatement sm = conn.prepareStatement(sql);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                DeCuong decuong = new DeCuong();
                decuong.setMaDC(rs.getInt("maDC"));
                decuong.setTenDC(rs.getString("tenDC"));
                decuong.setDvhoctrinh(rs.getInt("dvhoctrinh"));
                decuong.setThoigian(rs.getString("thoigian"));
                decuong.setDieukien(rs.getString("dieukien"));
                decuong.setMuctieu(rs.getString("muctieu"));
                decuong.setNoidung(rs.getString("noidung"));
                decuong.setTieuchuan(rs.getString("tieuchuan"));
                decuong.setNam(rs.getInt("nam"));
                GiangVienHocSinh giangvienhocsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                decuong.setGiangvienhocsinh(giangvienhocsinh);
                decuong.setTrangthai(rs.getInt("trangthai"));
                listDeCuong.add(decuong);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listDeCuong;
    }

    @Override
    public List<DeCuong> timkiemDeCuong(String noidung, int nam, GiangVienHocSinh gvhs) {
        String sql = "";
        List<DeCuong> listDeCuong = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            sql = "select * from tbl_dcct where noidung = ? and nam = ? noidung like '%" + noidung + "%' ";
            PreparedStatement sm = conn.prepareStatement(sql);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                DeCuong decuong = new DeCuong();
                decuong.setMaDC(rs.getInt("maDC"));
                decuong.setTenDC(rs.getString("tenDC"));
                decuong.setDvhoctrinh(rs.getInt("dvhoctrinh"));
                decuong.setThoigian(rs.getString("thoigian"));
                decuong.setDieukien(rs.getString("dieukien"));
                decuong.setMuctieu(rs.getString("muctieu"));
                decuong.setNoidung(rs.getString("noidung"));
                decuong.setTieuchuan(rs.getString("tieuchuan"));
                decuong.setNam(rs.getInt("nam"));
                GiangVienHocSinh giangvienhocsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                decuong.setGiangvienhocsinh(giangvienhocsinh);
                decuong.setTrangthai(rs.getInt("trangthai"));
                listDeCuong.add(decuong);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listDeCuong;
    }

    @Override
    public List<DeCuong> timkiemDeCuongByNoiDung(String noidung) {
        String sql = "";
        List<DeCuong> listDeCuong = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            sql = "select * from tbl_dcct where noidung like '%" + noidung + "%' ";
            PreparedStatement sm = conn.prepareStatement(sql);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                DeCuong decuong = new DeCuong();
                decuong.setMaDC(rs.getInt("maDC"));
                decuong.setTenDC(rs.getString("tenDC"));
                decuong.setDvhoctrinh(rs.getInt("dvhoctrinh"));
                decuong.setThoigian(rs.getString("thoigian"));
                decuong.setDieukien(rs.getString("dieukien"));
                decuong.setMuctieu(rs.getString("muctieu"));
                decuong.setNoidung(rs.getString("noidung"));
                decuong.setTieuchuan(rs.getString("tieuchuan"));
                decuong.setNam(rs.getInt("nam"));
                GiangVienHocSinh giangvienhocsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                decuong.setGiangvienhocsinh(giangvienhocsinh);
                decuong.setTrangthai(rs.getInt("trangthai"));
                listDeCuong.add(decuong);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listDeCuong;
    }

    @Override
    public List<DeCuong> timkiemDeCuongByNam(int nam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean themDeCuong(DeCuong decuong) {
         boolean isCheck = false;
        String sql = "insert into tbl_dcct (tenDC, dvhoctrinh, thoigian, dieukien, muctieu, noidung, tieuchuan, nam, maGVHS, trangthai) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, decuong.getTenDC());
            pstmt.setInt(2, decuong.getDvhoctrinh());
            pstmt.setString(3, decuong.getThoigian());
            pstmt.setString(4, decuong.getDieukien());
            pstmt.setString(5, decuong.getMuctieu());
            pstmt.setString(6, decuong.getNoidung());
            pstmt.setString(7, decuong.getTieuchuan());
            pstmt.setInt(8, decuong.getNam());
            pstmt.setInt(9, decuong.getGiangvienhocsinh().getMaGVHS());
            pstmt.setInt(10, decuong.isTrangthai());
            return pstmt.executeUpdate() == 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return isCheck;
    }

    @Override
    public boolean chinhsuaDeCuong(DeCuong decuong) {
         boolean isCheck = false;
        String sql = "update tbl_dcct set tenDC=?, dvhoctring = ?, thoigian = ?, dieukien = ?, muctieu = ?, noidung=?, tieuchuan = ?, nam=?, maGVHS=?,trangthai=?";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, decuong.getTenDC());
            pstmt.setInt(2, decuong.getDvhoctrinh());
            pstmt.setString(3, decuong.getThoigian());
            pstmt.setString(4, decuong.getDieukien());
            pstmt.setString(5, decuong.getMuctieu());
            pstmt.setString(6, decuong.getNoidung());
            pstmt.setString(7, decuong.getTieuchuan());
            pstmt.setInt(8, decuong.getNam());
            pstmt.setInt(9, decuong.getGiangvienhocsinh().getMaGVHS());
            pstmt.setInt(10, decuong.isTrangthai());
            return pstmt.executeUpdate() == 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return isCheck;
    }

    @Override
    public boolean xoaDeCuong(int maDC) {
        boolean isCheck = false;
        String sql = "delete from tbl_dcct where maDC =?";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement sm = conn.prepareStatement(sql);
            sm.setInt(1, maDC);
            return sm.executeUpdate() == 1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return isCheck;
    }

}
