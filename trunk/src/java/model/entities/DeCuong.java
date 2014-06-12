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
public class DeCuong {
    
    private int maDC;
    private String tenDC;
    private int dvhoctrinh;
    private String thoigian;
    private String dieukien;
    private String muctieu;
    private String noidung;
    private String tieuchuan;
    private int nam;
    private boolean trangthai;
    
    public DeCuong() {
        
    }

    public DeCuong(int maDC, String tenDC, int dvhoctrinh, String thoigian, String dieukien, String muctieu, String noidung, String tieuchuan, int nam, boolean trangthai) {
        this.maDC = maDC;
        this.tenDC = tenDC;
        this.dvhoctrinh = dvhoctrinh;
        this.thoigian = thoigian;
        this.dieukien = dieukien;
        this.muctieu = muctieu;
        this.noidung = noidung;
        this.tieuchuan = tieuchuan;
        this.nam = nam;
        this.trangthai = trangthai;
    }

    public int getMaDC() {
        return maDC;
    }

    public void setMaDC(int maDC) {
        this.maDC = maDC;
    }

    public String getTenDC() {
        return tenDC;
    }

    public void setTenDC(String tenDC) {
        this.tenDC = tenDC;
    }

    public int getDvhoctrinh() {
        return dvhoctrinh;
    }

    public void setDvhoctrinh(int dvhoctrinh) {
        this.dvhoctrinh = dvhoctrinh;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getDieukien() {
        return dieukien;
    }

    public void setDieukien(String dieukien) {
        this.dieukien = dieukien;
    }

    public String getMuctieu() {
        return muctieu;
    }

    public void setMuctieu(String muctieu) {
        this.muctieu = muctieu;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getTieuchuan() {
        return tieuchuan;
    }

    public void setTieuchuan(String tieuchuan) {
        this.tieuchuan = tieuchuan;
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
