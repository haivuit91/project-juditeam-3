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
import model.dao.service.SlideDAOService;
import model.entities.GiangVienHocSinh;
import model.entities.Slide;
import model.entities.TuLieu;

/**
 *
 * @author HAI VU
 */
public class SlideDAO implements SlideDAOService {

    @Override
    public List<Slide> getAllSlide() {
        List<Slide> slideList = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_slide";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Slide slide = new Slide();
                slide.setMaSlide(rs.getInt("maSlide"));
                slide.setTenSilde(rs.getString("tenSlide"));
                slide.setNoidung(rs.getString("noidung"));
                slide.setNam(rs.getInt("nam"));
                GiangVienHocSinh gvienhsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                TuLieu tulieu = TuLieuDAO.getInstance().getTuLieuByMaTL(rs.getInt("maTL"));
                slideList.add(slide);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return slideList;
    }

    @Override
    public Slide getSlideByMa(int maSlide) {
        Slide slide = new Slide();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_slide where maSlide = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, maSlide);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                slide.setMaSlide(rs.getInt("maSlide"));
                slide.setTenSilde(rs.getString("tenSlide"));
                slide.setNoidung(rs.getString("noidung"));
                slide.setNam(rs.getInt("nam"));
                GiangVienHocSinh gvienhsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                TuLieu tulieu = TuLieuDAO.getInstance().getTuLieuByMaTL(rs.getInt("maTL"));
                slide.setTrangthai(rs.getInt("trangthai"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return slide;
    }

    @Override
    public Slide getSlideByTenSlide(String tenSlide) {
        Slide slide = new Slide();
        try {
            Connection conn = ConnectionFactory.getConnection();
            String sql = "select * from tbl_slide where tenSlide = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tenSlide);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                slide.setMaSlide(rs.getInt("maSlide"));
                slide.setTenSilde(rs.getString("tenSlide"));
                slide.setNoidung(rs.getString("noidung"));
                slide.setNam(rs.getInt("nam"));
                GiangVienHocSinh gvienhsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                TuLieu tulieu = TuLieuDAO.getInstance().getTuLieuByMaTL(rs.getInt("maTL"));
                slide.setTrangthai(rs.getInt("trangthai"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return slide;
    }

    @Override
    public List<Slide> timkiemSlide(int nam, String noidung, GiangVienHocSinh gvhs) {
        String sql = "";
        List<Slide> listSlide = new ArrayList<>();
        try {
            Connection conn = ConnectionFactory.getConnection();
            sql = "select * from tbl_slide where nam = ? and maGVHS = ? and noidung  like '%" + noidung + "%' ";
            PreparedStatement sm = conn.prepareStatement(sql);
            sm.setInt(1, nam);
            sm.setString(2, noidung);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                Slide slide = new Slide();
                slide.setMaSlide(rs.getInt("maSlide"));
                slide.setTenSilde(rs.getString("tenSlide"));
                slide.setNoidung(rs.getString("noidung"));
                slide.setNam(rs.getInt("nam"));
                GiangVienHocSinh gvienhsinh = GiangVienHocSinhDAO.getInstance().getGiangVienHocSinhByMa(rs.getInt("maGVHS"));
                TuLieu tulieu = TuLieuDAO.getInstance().getTuLieuByMaTL(rs.getInt("maTL"));
                slide.setTrangthai(rs.getInt("trangthai"));
                listSlide.add(slide);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listSlide;
    }

    @Override
    public boolean themSlide(Slide slide) {
        boolean isCheck = false;
        String sql = "insert into tbl_slide (tenSlide, noidung, nam, maGVHS, maTL, trangthai) values(?,?,?,?,?,?)";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, slide.getTenSilde());
            pstmt.setString(2, slide.getNoidung());
            pstmt.setInt(3, slide.getNam());
            pstmt.setInt(4, slide.getGiangvienhocsinh().getMaGVHS());
            pstmt.setInt(5, slide.getTulieu().getMaTL());
            pstmt.setInt(6, slide.getTrangthai());
            return pstmt.executeUpdate() == 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return isCheck;
    }

    @Override
    public boolean chinhsuaSlide(Slide slide) {
        boolean isCheck = false;
        String sql = "update tbl_slide set tenSlide=?,noidung=?,nam=?,maGVHS=?,maTL=?,trangthai=?";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, slide.getTenSilde());
            pstmt.setString(2, slide.getNoidung());
            pstmt.setInt(3, slide.getNam());
            pstmt.setInt(4, slide.getGiangvienhocsinh().getMaGVHS());
            pstmt.setInt(5, slide.getTulieu().getMaTL());
            pstmt.setInt(6, slide.getTrangthai());
            return pstmt.executeUpdate() == 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return isCheck;
    }

    @Override
    public boolean xoaSlide(int maSlide) {
        boolean isCheck = false;
        String sql = "delete from tbl_slide where maSlide =?";
        try {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement sm = conn.prepareStatement(sql);
            sm.setInt(1, maSlide);
            return sm.executeUpdate() == 1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return isCheck;
    }

}
