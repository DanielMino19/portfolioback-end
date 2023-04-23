/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.Controller;

import com.clporfoliobackend.democl.Controller.model.QEducation;
import com.clporfoliobackend.democl.service.IQEducationService;
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
@RequestMapping("/api/qeducation")
public class QEducationController {
   
    @Autowired
    private IQEducationService qeduService;
    
    @GetMapping("/{id}")
    @PreAuthorize("permitAll()")
    public QEducation getQEducation(@PathVariable Long id) {
        return qeduService.getQEducation(id);
    }
    
    @PostMapping
    public QEducation createQEducation(@RequestBody QEducation quali) {
        return qeduService.newQEducation(quali);
    }
 
    @PutMapping("/{id}")
    public QEducation updateQEducation(@PathVariable Long id, @RequestBody QEducation quali) {
        return qeduService.updateQEducation(id, quali);
    }
    
    @DeleteMapping("/{id}")
    public void deleteQEducation(@PathVariable Long id) {
        qeduService.deleteQEducation(id);
    }
    
    @GetMapping
    @PreAuthorize("permitAll()")
    public List<QEducation> getAllQEducation() {
        return qeduService.getAllQEducation();
    }
    
}
