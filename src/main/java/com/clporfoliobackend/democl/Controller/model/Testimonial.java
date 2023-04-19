/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.Controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Testimonial {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
       
    @Column(name = "name")
    private String name;
    
    @Column(name = "img")
    private String img;
    
    @Column(name = "parrafo")
    private String parrafo;
    
    
    // getters y setters
    public Testimonial(){
    }
    
    public Testimonial(Long id,String name, String img,String parrafo){
        this.id = id;
        this.img = img;
        this.parrafo = parrafo;

    }
}
