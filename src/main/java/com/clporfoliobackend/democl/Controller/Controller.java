/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.Controller;



import java.util.List;
import com.clporfoliobackend.democl.Controller.model.Persona;
import com.clporfoliobackend.democl.service.IPersonaService;
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

/**
 *
 * @author Ella no te ama
 */
@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("api/new/persona")
    @PreAuthorize("permitAll()")
    public void agregarPersona(@RequestBody Persona pers){
       persoServ.crearPersona(pers);
    
    }
    
    @GetMapping("api/ver/persona/{id}")
    @ResponseBody
    @PreAuthorize("permitAll()")
    public Persona buscarPersona(@PathVariable long id){
     return persoServ.buscarPersona(id);
    }
    
   
    @GetMapping("/api/ver/personas")
    @ResponseBody
    @PreAuthorize("permitAll()")
    public List<Persona> verPersonas (){
     return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("api/put/persona/{id}")
    public void actualizarPersona (@PathVariable Long id,@RequestBody Persona pers){
               persoServ.modificarPersona(id, pers);
        
    }
    
}
