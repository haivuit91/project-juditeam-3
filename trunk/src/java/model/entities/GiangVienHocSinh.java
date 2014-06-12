/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author HAI VU
 */
public class GiangVienHocSinh {
    
    private int maGVHS;
    private String tenGVHS;
    private String diachi;
    private String dienthoai;
    private Date ngaysinh;
    private String donvi;
    private int trinhdo;
    private int trangthai;
    
    private List<BaiGiang> baigiangList = null;
    private List<Slide> slideList = null;
    private List<DeCuong> decuongList = null;
    
    
    public GiangVienHocSinh() {
        
    }

    public int getTrangthai() {
        return trangthai;
    }

    public GiangVienHocSinh(int maGVHS, String tenGVHS, String diachi, String dienthoai, Date ngaysinh, String donvi, int trinhdo, int trangthai) {
        this.maGVHS = maGVHS;
        this.tenGVHS = tenGVHS;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.ngaysinh = ngaysinh;
        this.donvi = donvi;
        this.trinhdo = trinhdo;
        this.trangthai = trangthai;
    }

    public int getMaGVHS() {
        return maGVHS;
    }

    public void setMaGVHS(int maGVHS) {
        this.maGVHS = maGVHS;
    }

    public String getTenGVHS() {
        return tenGVHS;
    }

    public void setTenGVHS(String tenGVHS) {
        this.tenGVHS = tenGVHS;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public int getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(int trinhdo) {
        this.trinhdo = trinhdo;
    }

 

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public List<BaiGiang> getBaigiangList() {
        return baigiangList;
    }

    public void setBaigiangList(List<BaiGiang> baigiangList) {
        this.baigiangList = baigiangList;
    }

    public List<Slide> getSlideList() {
        return slideList;
    }

    public void setSlideList(List<Slide> slideList) {
        this.slideList = slideList;
    }
    
}
