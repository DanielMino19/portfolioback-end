/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.service;


import com.clporfoliobackend.democl.Controller.model.Skillsbackend;
import com.clporfoliobackend.democl.repository.SkillsBackendRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsBackendService implements ISkillsBackendService{
      
    @Autowired
    public SkillsBackendRepository  skillRepository;
    
    public Skillsbackend createSkill(Skillsbackend skill) {
        return skillRepository.save(skill);
    }
    
    public Skillsbackend getSkill(Long id) {
        return skillRepository.findById(id).orElse(null);
    }
    
    public Skillsbackend updateSkill(Long id, Skillsbackend skill) {
        Skillsbackend existingSkill = skillRepository.findById(id).orElse(null);
        if (existingSkill != null) {
            existingSkill.setTitle(skill.getTitle());
            existingSkill.setIcono(skill.getIcono());
            return skillRepository.save(existingSkill);
        }
        return null;
    }
    
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }
    
    public List<Skillsbackend> getAllSkills() {
        return skillRepository.findAll();
    }
}
