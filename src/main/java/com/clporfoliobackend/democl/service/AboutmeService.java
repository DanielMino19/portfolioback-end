/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.Aboutme;
import com.clporfoliobackend.democl.repository.AboutmeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AboutmeService implements IAboutmeService {

    @Autowired
    public AboutmeRepository AboutmeRepo;
    
    
    @Override
    public List<Aboutme> verAboutme() {
        return AboutmeRepo.findAll();
    }

    @Override
    public void crearAboutme(Aboutme per) {
         AboutmeRepo.save(per);
    }

    @Override
    public void borrarAboutme(Long  id) {
       AboutmeRepo.deleteById(id);
    }

    @Override
    public Aboutme buscarAboutme(Long  id) {
        return AboutmeRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarAboutme(Long id,Aboutme per){
        Aboutme aboutme = AboutmeRepo.findById(id).orElse(null);
           if(aboutme != null) {
        aboutme.setCompanies(per.getCompanies());
         aboutme.setDescription(per.getDescription());
          aboutme.setExperience(per.getExperience());
           aboutme.setImgSrc(per.getImgSrc());
            aboutme.setProjects(per.getProjects());
        // Y así con el resto de propiedades de Persona
        AboutmeRepo.save(aboutme);
    }
        
    }
    
}
