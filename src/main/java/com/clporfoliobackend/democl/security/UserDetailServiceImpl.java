/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.security;

import com.clporfoliobackend.democl.Controller.model.Usuario;
import com.clporfoliobackend.democl.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailServiceImpl implements UserDetailsService {
    
    @Autowired
    private UsuarioRepository usuarioRepository ;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
      Usuario usuario = usuarioRepository
              .findOneByEmail(email)
              .orElseThrow(()-> new UsernameNotFoundException("El usuario con email"+ email +"no existe."));
              
      return new UserDetailsImpl(usuario);
              
    }
    
    
 
}
