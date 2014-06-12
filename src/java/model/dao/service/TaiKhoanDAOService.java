/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.service;

import java.util.List;
import model.entities.TaiKhoan;

/**
 *
 * @author HAI VU
 */
public interface TaiKhoanDAOService {

    /**
     * Get TaiKhoan
     *
     * @return TaiKhoan
     */
    public List<TaiKhoan> getAllTaiKhoan();

    /**
     * Get TaiKhoan by maTK
     *
     * @param maTK
     * @return TaiKhoan
     */
    public TaiKhoan getTaiKhoanByMa(int maTK);

    /**
     * Get TaiKhoan by tenTK
     *
     * @param tenTK
     * @return TaiKhoan
     */
    public TaiKhoan getTaiKhoanByTenTK(String tenTK);
    
    /**
     * CheckLogin
     *
     * @param tenTK
     * @param matkhau
     * @return TaiKhoan
     */
    public boolean kiemTraDangNhap(String tenTK, String matkhau);

    /**
     * update TaiKhoan
     *
     * @param taikhoan
     * @return TaiKhoan
     */
    public boolean chinhsuaTaiKhoan(TaiKhoan taikhoan);

    /**
     * delete TaiKhoan
     *
     * @param maTK
     * @return TaiKhoan
     */
    public boolean xoaTaiKhoan(int maTK);
}
