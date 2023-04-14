/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.Controller.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Data
public class Usuario {
  
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="ideusuario")
    private Integer id;
    private String nombre;
    private String email;
    private String password;
    

        
      public Usuario(){
    }
      
    public  Usuario(Integer idusuario, String nombre, String email, String password){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }
}
