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
public class TaiLieu {
    
    private int maTL;
    private String tenTL;
    private String noidung;
    private String loaiTL;
    private String nguonTL;
    private int nam;
    private boolean trangthai;
    
    public TaiLieu() {
        
    }

    public TaiLieu(int maTL, String tenTL, String noidung, String loaiTL, String nguonTL, int nam, boolean trangthai) {
        this.maTL = maTL;
        this.tenTL = tenTL;
        this.noidung = noidung;
        this.loaiTL = loaiTL;
        this.nguonTL = nguonTL;
        this.nam = nam;
        this.trangthai = trangthai;
    }

    public int getMaTL() {
        return maTL;
    }

    public void setMaTL(int maTL) {
        this.maTL = maTL;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getLoaiTL() {
        return loaiTL;
    }

    public void setLoaiTL(String loaiTL) {
        this.loaiTL = loaiTL;
    }

    public String getNguonTL() {
        return nguonTL;
    }

    public void setNguonTL(String nguonTL) {
        this.nguonTL = nguonTL;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
}
