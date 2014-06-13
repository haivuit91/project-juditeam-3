/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.service;

import java.util.List;
import model.entities.GiangVienHocSinh;
import model.entities.Slide;

/**
 *
 * @author HAI VU
 */
public interface SlideDAOService {

    /**
     * Get Slide
     *
     * @return Slide
     */
    public List<Slide> getAllSlide();

    /**
     * Get Slide by maSlide
     *
     * @param maSlide is name of slide
     * @return BaiGiang by maSlide
     */
    public Slide getSlideByMa(int maSlide);

    /**
     * Get Slide by tenSlide
     *
     * @param tenSlide
     * @return Slide by tenSlide
     */
    public Slide getSlideByTenSlide(String tenSlide);

    /**
     * find Slide by tenSlide
     *
     * @param tenSlide
     * @param noidung
     * @param nam
     * @param gvhs
     * @return Slide by tenSlide
     */
    public List<Slide> timkiemSlide(int nam, String noidung, GiangVienHocSinh gvhs);

    public List<Slide> getSlideListByMaGVHS(int maGVHS);
    
    /**
     * create Slide
     *
     * @param slide
     * @return Slide
     */
    public boolean themSlide(Slide slide);

    /**
     * update Slide
     *
     * @param slide
     * @return Slide
     */
    public boolean chinhsuaSlide(Slide slide);

    /**
     * delete Slide by maSlide
     *
     * @param maSlide
     * @return Slide
     */
    public boolean xoaSlide(int maSlide);
}
