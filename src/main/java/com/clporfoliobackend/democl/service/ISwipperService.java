/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clporfoliobackend.democl.service;


import com.clporfoliobackend.democl.Controller.model.Swipper;
import java.util.List;



public interface ISwipperService {
    public Swipper createSwipper(Swipper swip) ;
        
    public Swipper getSwipper(Long id) ;
        
    public Swipper updateSwipper(Long id, Swipper swip) ;

    public void deleteSwipper(Long id) ;
       
    public List<Swipper> getAllSwippers();
    
}
