/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.Usuario;
import com.clporfoliobackend.democl.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    public UsuarioRepository userRepo;
    
    
    @Override
    public List<Usuario> verUsuarios() {
        return userRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario user) {
        userRepo.save(user);
    }

    @Override
    public void borrarUsuario(Integer id) {
       userRepo.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Integer id) {
     return userRepo.findById(id).orElse(null);
    }


    @Override
    public void modificarUsuario(Usuario user) {
        userRepo.save(user);
    }
    
}
