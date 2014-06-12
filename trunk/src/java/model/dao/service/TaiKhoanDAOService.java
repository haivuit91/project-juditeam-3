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
     * find TaiKhoan by maTK
     *
     * @param maTK
     * @return TaiKhoan
     */
    public List<TaiKhoan> timkiemTaiKhoanByMaTK(int maTK);

    /**
     * find TaiKhoan by tenTK
     *
     * @param tenTK
     * @return TaiKhoan
     */
    public List<TaiKhoan> timkiemTaiKhoanByTenTK(int tenTK);

    /**
     * find TaiKhoan by hoten
     *
     * @param hoten
     * @return TaiKhoan
     */
    public List<TaiKhoan> timkiemTaiKhoan(String hoten);

    /**
     * create TaiKhoan
     *
     * @param taikhoan
     * @return TaiKhoan
     */
    public boolean themTaiKhoan(TaiKhoan taikhoan);

    /**
     * update TaiKhoan
     *
     * @param taikhoan
     * @return TaiKhoan
     */
    public boolean chinhsuaTaiKhoan(TaiKhoan taikhoan);

    /**
     * remove TaiKhoan
     *
     * @param taikhoan
     * @return TaiKhoan
     */
    public boolean removeTaiKhoan(TaiKhoan taikhoan);

    /**
     * restore TaiKhoan
     *
     * @param taikhoan
     * @return TaiKhoan
     */
    public boolean restoreTaiKhoan(TaiKhoan taikhoan);

    /**
     * delete TaiKhoan
     *
     * @param maTK
     * @return TaiKhoan
     */
    public boolean removeTaiKhoan(int maTK);
}
