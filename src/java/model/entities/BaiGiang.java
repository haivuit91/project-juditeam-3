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
    private String tlThamkhao;
    private int trangthai;
    
    private List<GiangVienHocSinh> gvhsList = null;
    
    public BaiGiang(){
        
    }    

    public BaiGiang(int maBG, String tenBG, String noidung, int nam, GiangVienHocSinh giangVienHocSinh, String tlThamkhao, int trangthai) {
        this.maBG = maBG;
        this.tenBG = tenBG;
        this.noidung = noidung;
        this.nam = nam;
        this.giangVienHocSinh = giangVienHocSinh;
        this.tlThamkhao = tlThamkhao;
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
    
}
