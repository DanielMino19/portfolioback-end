/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.Skills;
import java.util.List;


public interface ISkillsService {

    public Skills createSkill(Skills skill) ;
        
    public Skills getSkill(Long id) ;
        
    public Skills updateSkill(Long id, Skills skill) ;

    public void deleteSkill(Long id) ;
       
    public List<Skills> getAllSkills() ;
        
   
}
