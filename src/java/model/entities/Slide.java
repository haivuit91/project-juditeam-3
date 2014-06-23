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
    private GiangVienHocSinh giangVienHocSinh;
    private TuLieu tuLieu;
    private String tlThamkhao;
    private int trangthai;
    
    private  List<GiangVienHocSinh> gvhsList = null;
    private List<TuLieu> tulieuList = null;
    
    public Slide() {
        
    }

    public Slide(int maSlide, String tenSilde, String noidung, int nam, GiangVienHocSinh giangVienHocSinh, TuLieu tuLieu, String tlThamkhao, int trangthai) {
        this.maSlide = maSlide;
        this.tenSilde = tenSilde;
        this.noidung = noidung;
        this.nam = nam;
        this.giangVienHocSinh = giangVienHocSinh;
        this.tuLieu = tuLieu;
        this.tlThamkhao = tlThamkhao;
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

    public GiangVienHocSinh getGiangVienHocSinh() {
        return giangVienHocSinh;
    }

    public void setGiangVienHocSinh(GiangVienHocSinh giangVienHocSinh) {
        this.giangVienHocSinh = giangVienHocSinh;
    }

    public TuLieu getTuLieu() {
        return tuLieu;
    }

    public void setTuLieu(TuLieu tuLieu) {
        this.tuLieu = tuLieu;
    }

    public String getTlThamkhao() {
        return tlThamkhao;
    }

    public void setTlThamkhao(String tlThamkhao) {
        this.tlThamkhao = tlThamkhao;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public List<GiangVienHocSinh> getGvhsList() {
        return gvhsList;
    }

    public void setGvhsList(List<GiangVienHocSinh> gvhsList) {
        this.gvhsList = gvhsList;
    }

    public List<TuLieu> getTulieuList() {
        return tulieuList;
    }

    public void setTulieuList(List<TuLieu> tulieuList) {
        this.tulieuList = tulieuList;
    }

}
