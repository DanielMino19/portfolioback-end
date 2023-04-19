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
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
       
    @Column(name = "icono")
    private String icono;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "parrafo1")
    private String parrafo1;
    
    @Column(name = "parrafo2")
      private String parrafo2;

    @Column(name = "parrafo3")
      private String parrafo3;
    
    

    // getters y setters
    public Services(){
    }
    
    public Services(Long id,String icono, String title,String parrafo1,String parrafo2,String parrafo3){
        this.id = id;
        this.icono = icono;
        this.title = title;
        this.parrafo1 = parrafo1;
        this.parrafo2 = parrafo2;
        this.parrafo3 = parrafo3;
    }
    
}
