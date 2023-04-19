/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.service;


import com.clporfoliobackend.democl.Controller.model.Swipper;
import com.clporfoliobackend.democl.repository.SwipperRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SwipperService implements ISwipperService {

   
    @Autowired
    public SwipperRepository  skillRepository;
    
    public Swipper createSwipper(Swipper swip) {
        return skillRepository.save(swip);
    }
    
    public Swipper getSwipper(Long id) {
        return skillRepository.findById(id).orElse(null);
    }
    
    public Swipper updateSwipper(Long id, Swipper swip) {
        Swipper existingSwipper = skillRepository.findById(id).orElse(null);
        if (existingSwipper != null) {
            existingSwipper.setImg(swip.getImg());
            existingSwipper.setTitle(swip.getTitle());
            existingSwipper.setParrafo(swip.getParrafo());
            return skillRepository.save(existingSwipper);
        }
        return null;
    }
    
    public void deleteSwipper(Long id) {
        skillRepository.deleteById(id);
    }
    
    public List<Swipper> getAllSwippers() {
        return skillRepository.findAll();
    }
    
}
