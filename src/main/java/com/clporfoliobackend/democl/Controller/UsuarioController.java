/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.Controller;

import com.clporfoliobackend.democl.Controller.model.Usuario;
import com.clporfoliobackend.democl.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UsuarioController {
        @Autowired
    private IUsuarioService userRepo;
    
    @PostMapping("/new/usuario")
    public void agregarPersona(@RequestBody Usuario user){
       userRepo.crearUsuario(user);
    
    }
    
    @GetMapping("ver/usuario/{id}")
    @ResponseBody
    public Usuario buscarUsuario(@PathVariable Integer id){
     return userRepo.buscarUsuario(id);
    }
    
  
    @GetMapping("/ver/usaurios")
    @ResponseBody
    public List<Usuario> verUsuario (){
     return userRepo.verUsuarios();
    }
    
    @DeleteMapping("/deleteUser/{id}")
    public void borrarPersona (@PathVariable Integer id){
        userRepo.borrarUsuario(id);
    }
    
    @PutMapping("/put/usuario")
    public void actualizarPersona (@RequestBody Usuario user){
        userRepo.modificarUsuario(user);
    }
    
}
