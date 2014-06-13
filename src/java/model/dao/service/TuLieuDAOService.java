/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.dao.service;

import java.util.List;
import model.entities.TuLieu;

/**
 *
 * @author HAI VU
 */
public interface TuLieuDAOService {
    
    /**
     * Get AllTuLieu
     *
     * @return Tulieu
     */
    public List<TuLieu> getAllTuLieu();

    /**
     * Get TuLieu by maTL
     * @param maTL is name of user
     * @return TuLieu
     */
    public TuLieu getTuLieuByMaTL(int maTL);

    /**
     * Get TuLieu by tenTL
     * @param tenTL
     * @return TuLieu
     */
    public TuLieu getTuLieuByTenTL(String tenTL);

    /**
     * find TuLieu
     * @param tukhoa
     * @return TuLieu
     */
    public List<TuLieu> timkiemTuLieu(String tukhoa);

    /**
     * create TuLieu
     * @param tulieu
     * @return TuLieu
     */
    public boolean themTuLieu(TuLieu tulieu);

    /**
     * update TuLieu
     * @param tulieu
     * @return TuLieu
     */
    public boolean chinhsuaTuLieu(TuLieu tulieu);

    /**
     * delete TuLieu by maTL
     * @param maTL
     * @return TuLieu
     */
    public boolean xoaTuLieu(int maTL);
}
