/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.Controller;

import com.clporfoliobackend.democl.Controller.model.Aboutme;
import com.clporfoliobackend.democl.service.IAboutmeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class AboutmeController {
    @Autowired
    private IAboutmeService AboutmeServ;
    
    @PostMapping("api/new/aboutme")
    @PreAuthorize("permitAll()")
    public void agregarAboutme(@RequestBody Aboutme pers){
       AboutmeServ.crearAboutme(pers);
    
    }
    
    @GetMapping("api/ver/aboutme/{id}")
    @ResponseBody
    @PreAuthorize("permitAll()")
    public Aboutme buscarAboutme(@PathVariable long id){
     return AboutmeServ.buscarAboutme(id);
    }
    
   
    @GetMapping("/api/ver/aboutme")
    @ResponseBody
    @PreAuthorize("permitAll()")
    public List<Aboutme> verAboutme (){
     return AboutmeServ.verAboutme();
    }
    
    @DeleteMapping("/deleteee/{id}")
    public void borrarAboutme (@PathVariable long id){
        AboutmeServ.borrarAboutme(id);
    }
    
    @PutMapping("api/put/aboutme/{id}")
    public void actualizarAboutme (@PathVariable Long id,@RequestBody Aboutme pers){
               AboutmeServ.modificarAboutme(id, pers);
        
    }
}
