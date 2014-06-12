/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.service;

import java.util.List;
import model.entities.GiangVienHocSinh;

/**
 *
 * @author HAI VU
 */
public interface GiangVienHocSinhDAOService {

    /**
     * Get GiangVienHocSinh
     *
     * @return GiangVienHocSinh
     */
    public List<GiangVienHocSinh> getAllGiangVienHocSinh();

    /**
     * Get GiangVienHocSinh
     *
     * @param maGVHS
     * @return GiangVienHocSinh
     */
    public GiangVienHocSinh getGiangVienHocSinhByMa(int maGVHS);

    /**
     * Get GiangVienHocSinh
     *
     * @param tenGVHS
     * @return GiangVienHocSinh
     */
    public GiangVienHocSinh getGiangVienHocSinhByTen(String tenGVHS);

    /**
     * find GiangVienDeCuong
     *
     * @param tukhoa
     * @param dieukien
     * @return GiangVienDeCuong
     */
    public List<GiangVienHocSinh> timkiemGiangVienHocSinh(String tukhoa, String dieukien);

    /**
     * find GiangVienDeCuong
     *
     * @param tenGVHS
     * @return GiangVienDeCuong
     */
    public List<GiangVienHocSinh> timkiemGiangVienHocSinhByTen(String key);

    /**
     * create GiangVienHocSinh
     *
     * @param gvhs
     * @return GiangVienHocSinh
     */
    public boolean themGiangVienHocSinh(GiangVienHocSinh gvhs);

    /**
     * update GiangVienHocSinh
     *
     * @param gvhs
     * @return GiangVienHocSinh
     */
    public boolean chinhsuaGiangVienHocSinh(GiangVienHocSinh gvhs);

    /**
     * remove GiangVienHocSinh
     *
     * @param gvhs
     * @return GiangVienHocSinh
     */
    public boolean removeGiangVienHocSinh(GiangVienHocSinh gvhs);

    /**
     * restore GiangVienHocSinh
     *
     * @param gvhs
     * @return GiangVienHocSinh
     */
    public boolean restoreGiangVienHocSinh(GiangVienHocSinh gvhs);

    /**
     * delete GiangVienHocSinh
     *
     * @param gvhs
     * @return GiangVienHocSinh
     */
    public boolean xoaGiangVienHocSinh(GiangVienHocSinh gvhs);
    
    /**
     * Get GiangVienHocSinh
     *
     * @param tenGVHS
     * @return GiangVienHocSinh
     */
    public GiangVienHocSinh getGiangVienHocSinhByMaGVHS(String key);
}
