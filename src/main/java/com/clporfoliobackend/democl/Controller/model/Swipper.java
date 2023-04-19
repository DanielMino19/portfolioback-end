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
public class Swipper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
       
    @Column(name = "img")
    private String img;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "parrafo")
    private String parrafo;
    
    
    // getters y setters
    public Swipper(){
    }
    
    public Swipper(Long id,String img, String title,String parrafo){
        this.id = id;
        this.img = img;
        this.title = title;
        this.parrafo = parrafo;

    }
    
}
