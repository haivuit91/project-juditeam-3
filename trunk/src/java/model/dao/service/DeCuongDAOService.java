/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.service;

import java.util.List;
import model.entities.DeCuong;

/**
 *
 * @author HAI VU
 */
public interface DeCuongDAOService {

    /**
     * Get DeCuong
     *
     * @return DeCuong
     */
    public List<DeCuong> getAllDeCuong();

    /**
     * Get DeCuong by maDC
     *
     * @param maDC is name of user
     * @return DeCuong
     */
    public DeCuong getDeCuongByMa(int maDC);

    /**
     * find DeCuong by tenDC
     *
     * @param tenDC
     * @return DeCuong by tenDC
     */
    public List<DeCuong> timkiemDeCuongByTenDC(String tenDC);

    /**
     * find DeCuong
     *
     * @param tukhoa
     * @param dieukien
     * @return DeCuong
     */
    public List<DeCuong> timkiemDeCuong(String tukhoa, String dieukien);

    /**
     * find DeCuong
     *
     * @param noidung
     * @return DeCuong
     */
    public List<DeCuong> timkiemDeCuongByNoiDung(String noidung);

    /**
     * find DeCuong
     *
     * @param nam
     * @return DeCuong
     */
    public List<DeCuong> timkiemDeCuongByNam(int nam);

    /**
     * create DeCuong
     *
     * @param decuong
     * @return DeCuong
     */
    public boolean themDeCuong(DeCuong decuong);

    /**
     * update DeCuong
     *
     * @param decuong
     * @return DeCuong
     */
    public boolean chinhsuaDeCuong(DeCuong decuong);

    /**
     * remove DeCuong
     *
     * @param decuong
     * @return DeCuong
     */
    public boolean removeDeCuong(DeCuong decuong);

    /**
     * restore DeCuong
     *
     * @param decuong
     * @return DeCuong
     */
    public boolean restoreDeCuong(DeCuong decuong);

    /**
     * delete DeCuong by maDC
     *
     * @param maDC
     * @return DeCuong
     */
    public boolean xoaDeCuong(int maDC);
}
