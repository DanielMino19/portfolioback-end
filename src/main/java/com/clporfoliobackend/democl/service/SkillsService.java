/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.Skills;
import com.clporfoliobackend.democl.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService{
    
    @Autowired
    public SkillsRepository  skillRepository;
    
    public Skills createSkill(Skills skill) {
        return skillRepository.save(skill);
    }
    
    public Skills getSkill(Long id) {
        return skillRepository.findById(id).orElse(null);
    }
    
    public Skills updateSkill(Long id, Skills skill) {
        Skills existingSkill = skillRepository.findById(id).orElse(null);
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
    
    public List<Skills> getAllSkills() {
        return skillRepository.findAll();
    }
}
