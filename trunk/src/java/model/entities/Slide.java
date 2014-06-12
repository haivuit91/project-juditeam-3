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
    private GiangVienHocSinh maGVHS;
    private TuLieu maTL;
    private int trangthai;
    
    private List<TuLieu> tulieuList = null;
    
    public Slide() {
        
    }

    public Slide(int maSlide, String tenSilde, String noidung, int nam, GiangVienHocSinh maGVHS, TuLieu maTL, int trangthai) {
        this.maSlide = maSlide;
        this.tenSilde = tenSilde;
        this.noidung = noidung;
        this.nam = nam;
        this.maGVHS = maGVHS;
        this.maTL = maTL;
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

    public GiangVienHocSinh getMaGVHS() {
        return maGVHS;
    }

    public void setMaGVHS(GiangVienHocSinh maGVHS) {
        this.maGVHS = maGVHS;
    }

    public TuLieu getMaTL() {
        return maTL;
    }

    public void setMaTL(TuLieu maTL) {
        this.maTL = maTL;
    }

    public int isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public List<TuLieu> getTulieuList() {
        return tulieuList;
    }

    public void setTulieuList(List<TuLieu> tulieuList) {
        this.tulieuList = tulieuList;
    }
    
}
