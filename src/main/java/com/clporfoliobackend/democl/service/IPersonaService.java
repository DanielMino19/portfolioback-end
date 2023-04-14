/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (long id);
    
    public Persona buscarPersona (long id);
    
    public void modificarPersona (long id,Persona per);
}
