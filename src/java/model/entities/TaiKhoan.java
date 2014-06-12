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
public class TaiKhoan {
    
    private int maTK;
    private String tenTK;
    private String matkhau;
    private String hoten;
    private String email;
    private String dienthoai;
    private int quyen;
    private int trangthai;
    
    public TaiKhoan() {
        
    }

    public TaiKhoan(int maTK, String tenTK, String matkhau, String hoten, String email, String dienthoai, int quyen, int trangthai) {
        this.maTK = maTK;
        this.tenTK = tenTK;
        this.matkhau = matkhau;
        this.hoten = hoten;
        this.email = email;
        this.dienthoai = dienthoai;
        this.quyen = quyen;
        this.trangthai = trangthai;
    }

    public int getMaTK() {
        return maTK;
    }

    public void setMaTK(int maTK) {
        this.maTK = maTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public int isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
}
