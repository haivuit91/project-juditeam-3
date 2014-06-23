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
public class TuLieu {
    
    private int maTL;
    private String tenTL;
    private String noidung;
    private String loaiTL;
    private String nguonTL;
    private int nam;
    private String tlThamkhao;
    private int trangthai;
    
    public TuLieu() {
        
    }

    public TuLieu(int maTL, String tenTL, String noidung, String loaiTL, String nguonTL, int nam, String tlThamkhao, int trangthai) {
        this.maTL = maTL;
        this.tenTL = tenTL;
        this.noidung = noidung;
        this.loaiTL = loaiTL;
        this.nguonTL = nguonTL;
        this.nam = nam;
        this.tlThamkhao = tlThamkhao;
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

}
