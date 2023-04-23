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
public class QEducation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "subtitle")
    private String subtitle;
    
    @Column(name = "date")
    private String date;
    
    

    // getters y setters
    public QEducation(){
    }
    
    public QEducation(Long id, String title,String subtitle,String date){
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.date = date;
    }
    
}
