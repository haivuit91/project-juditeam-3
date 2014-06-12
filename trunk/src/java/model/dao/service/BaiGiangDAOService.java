/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.service;

import java.util.List;
import model.entities.BaiGiang;
import model.entities.GiangVienHocSinh;

/**
 *
 * @author HAI VU
 */
public interface BaiGiangDAOService {

    /**
     * Get BaiGiangList by maBG
     *
     * @return BaiGiang
     */
    public List<BaiGiang> getAllBaiGiang();

    /**
     * Get BaiGiangList by maBG
     * @param maBG is name of user
     * @return BaiGiang by maBG
     */
    public BaiGiang getBaiGiangByMa(int maBG);

    /**
     * Get BaiGiangList by tenBG
     * @param tenBG
     * @return BaiGiang by tenBG
     */
    public BaiGiang getBaiGiangByTenBG(String tenBG);

    /**
     * find BaiGiang
     * @param noidung
     * @param nam
     * @param gvhs
     * @return BaiGiang
     */
    public List<BaiGiang> timkiemBaiGiang(String noidung, int nam, GiangVienHocSinh gvhs);

    /**
     * create BaiGiang
     * @param baigiang
     * @return BaiGiang
     */
    public boolean themBaiGiang(BaiGiang baigiang);

    /**
     * update BaiGiang
     * @param baigiang
     * @return BaiGiang
     */
    public boolean chinhsuaBaiGiang(BaiGiang baigiang);


    /**
     * delete BaiGiang by maTK
     * @param maTK
     * @return BaiGiang
     */
    public boolean xoaBaiGiang(int maBG);
    
    /**
     * find BaiGiang by tenBG
     * @param tenBG
     * @return BaiGiang by tenBG
     */
    public List<BaiGiang> timkiemBaiGiangByMaGVHS(String key);
}
