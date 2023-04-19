/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.Usuario;
import java.util.List;
import java.util.Optional;



public interface IUsuarioService {
     public List<Usuario> verUsuarios ();
    
    public void crearUsuario (Usuario user);
    
    public void borrarUsuario (Integer id);
    
    public Usuario buscarUsuario (Integer id);
    
    public void modificarUsuario (Usuario user);
}
