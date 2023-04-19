/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.Aboutme;
import java.util.List;




public interface IAboutmeService {
    public List<Aboutme> verAboutme ();
    
    public void crearAboutme (Aboutme per);
    
    public void borrarAboutme (Long id);
    
    public Aboutme buscarAboutme (Long  id);
    
    public void modificarAboutme (Long  id,Aboutme per);
}
