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
     * @param maGVHS
     * @return GiangVienHocSinh
     */
    public List<GiangVienHocSinh> getGiangVienHocSinhByMa(int maGVHS);
    
    /**
     * Get GiangVienHocSinh
     * @param maGVHS
     * @return GiangVienHocSinh
     */
//    public List<GiangVienHocSinh> getGiangVienHocSinhByMa(int maGVHS);
}
