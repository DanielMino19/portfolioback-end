/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.Persona;
import com.clporfoliobackend.democl.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ella no te ama
 */
@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;
    
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
         persoRepo.save(per);
    }

    @Override
    public void borrarPersona(long id) {
       persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarPersona(long id,Persona per){
        Persona persona = persoRepo.findById(id).orElse(null);
           if(persona != null) {
        persona.setTitulo(per.getTitulo());
        persona.setParrafo(per.getParrafo());
        // Y así con el resto de propiedades de Persona
        persoRepo.save(persona);
    }
        
    }
    
}
