/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.entities;

/**
 *
 * @author HAI VU
 */
public class BaiGiang {
    
    private int maBG;
    private String tenBG;
    private String noidung;
    private int nam;
    private GiangVienHocSinh maGVHS;
    private boolean trangthai;
    
    public BaiGiang(){
        
    }    
    public BaiGiang(int maBG, String tenBG, String noidung, int nam, GiangVienHocSinh maGVHS, boolean trangthai) {
        this.maBG = maBG;
        this.tenBG = tenBG;
        this.noidung = noidung;
        this.nam = nam;
        this.maGVHS = maGVHS;
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

    public GiangVienHocSinh getMaGVHS() {
        return maGVHS;
    }

    public void setMaGVHS(GiangVienHocSinh maGVHS) {
        this.maGVHS = maGVHS;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
}
