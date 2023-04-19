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




@Getter @Setter
@Entity
public class Aboutme {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAboutme")
    
    private Long id;
    private String imgSrc;
    private String description;
    private Long experience;
    private Long projects;
    private Long companies;

    public Aboutme(){
    }
    
    public Aboutme(Long id, String imgSrc,String description,Long experience,Long projects,Long companies){
        this.id = id;
        this.imgSrc = imgSrc;
        this.description = description;
        this.experience = experience;
        this.projects = projects;
        this.companies = companies;
    }
}

    
    

