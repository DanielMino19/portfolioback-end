/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clporfoliobackend.democl.service;


import com.clporfoliobackend.democl.Controller.model.Skillsbackend;
import java.util.List;


public interface ISkillsBackendService {
    public Skillsbackend createSkill(Skillsbackend skill) ;
        
    public Skillsbackend getSkill(Long id) ;
        
    public Skillsbackend updateSkill(Long id, Skillsbackend skill) ;

    public void deleteSkill(Long id) ;
       
    public List<Skillsbackend> getAllSkills() ;
}
