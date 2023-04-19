/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.Controller;

import com.clporfoliobackend.democl.Controller.model.Skills;
import com.clporfoliobackend.democl.service.ISkillsBackendService;
import com.clporfoliobackend.democl.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/skills")
public class SkillsController {
    @Autowired
    private ISkillsService skillService;
    
    @GetMapping("/{id}")
    @PreAuthorize("permitAll()")
    public Skills getSkill(@PathVariable Long id) {
        return skillService.getSkill(id);
    }
    
    @PostMapping
    public Skills createSkill(@RequestBody Skills skill) {
        return skillService.createSkill(skill);
    }
    
    @PutMapping("/{id}")
    public Skills updateSkill(@PathVariable Long id, @RequestBody Skills skill) {
        return skillService.updateSkill(id, skill);
    }
    
    @DeleteMapping("/{id}")
    public void deleteSkill(@PathVariable Long id) {
        skillService.deleteSkill(id);
    }
    
    @GetMapping
    @PreAuthorize("permitAll()")
    public List<Skills> getAllSkills() {
        return skillService.getAllSkills();
    }
}