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
public class BaiGiang {
    
    private int maBG;
    private String tenBG;
    private String noidung;
    private int nam;
    private GiangVienHocSinh giangVienHocSinh;
    private int trangthai;
    
    private List<GiangVienHocSinh> slideList = null;
    
    public BaiGiang(){
        
    }    
    public BaiGiang(int maBG, String tenBG, String noidung, int nam, GiangVienHocSinh giangVienHocSinh, int trangthai) {
        this.maBG = maBG;
        this.tenBG = tenBG;
        this.noidung = noidung;
        this.nam = nam;
        this.giangVienHocSinh = giangVienHocSinh;
        this.trangthai = trangthai;
    }

    public int getMaBG() {
        return maBG;
    }

    public void setMaBG(int maBG) {
        this.maBG = maBG;
    }

    public String getTenBG() {
        return tenBG;
    }

    public void setTenBG(String tenBG) {
        this.tenBG = tenBG;
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
    public int isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public List<GiangVienHocSinh> getSlideList() {
        return slideList;
    }

    public void setSlideList(List<GiangVienHocSinh> slideList) {
        this.slideList = slideList;
    }
    
}
