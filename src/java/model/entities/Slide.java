/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.entities;

import java.util.List;

/**
 *
 * @author HAI VU
 */
public class Slide {
    
    private int maSlide;
    private String tenSilde;
    private String noidung;
    private int nam;
    private GiangVienHocSinh giangvienhocsinh;
    private TuLieu tulieu;
    private int trangthai;
    
    private  List<GiangVienHocSinh> gvhsList = null;
    private List<TuLieu> tulieuList = null;
    
    public Slide() {
        
    }

    public Slide(int maSlide, String tenSilde, String noidung, int nam, GiangVienHocSinh giangvienhocsinh, TuLieu maTL, int trangthai) {
        this.maSlide = maSlide;
        this.tenSilde = tenSilde;
        this.noidung = noidung;
        this.nam = nam;
        this.giangvienhocsinh = giangvienhocsinh;
        this.tulieu = tulieu;
        this.trangthai = trangthai;
    }

    public int getMaSlide() {
        return maSlide;
    }

    public void setMaSlide(int maSlide) {
        this.maSlide = maSlide;
    }

    public String getTenSilde() {
        return tenSilde;
    }

    public void setTenSilde(String tenSilde) {
        this.tenSilde = tenSilde;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public GiangVienHocSinh getGiangvienhocsinh() {
        return giangvienhocsinh;
    }

    public void setGiangvienhocsinh(GiangVienHocSinh giangvienhocsinh) {
        this.giangvienhocsinh = giangvienhocsinh;
    }

    public TuLieu getTulieu() {
        return tulieu;
    }

    public void setTulieu(TuLieu tulieu) {
        this.tulieu = tulieu;
    }

    public List<TuLieu> getTulieuList() {
        return tulieuList;
    }

    public void setTulieuList(List<TuLieu> tulieuList) {
        this.tulieuList = tulieuList;
    }

    public List<GiangVienHocSinh> getGvhsList() {
        return gvhsList;
    }

    public void setGvhsList(List<GiangVienHocSinh> gvhsList) {
        this.gvhsList = gvhsList;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
}
