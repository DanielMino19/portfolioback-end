/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.Controller;


import com.clporfoliobackend.democl.Controller.model.QWork;

import com.clporfoliobackend.democl.service.IQWorkService;
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
@RequestMapping("/api/qwork")
public class QWorkController {
      
    @Autowired
    private IQWorkService qworService;
    
    @GetMapping("/{id}")
    public QWork getQWork(@PathVariable Long id) {
        return qworService.getQWork(id);
    }
    
    @PostMapping
    public QWork createQWork(@RequestBody QWork quali) {
        return qworService.newQWork(quali);
    }
 
    @PutMapping("/{id}")
    public QWork updateQWork(@PathVariable Long id, @RequestBody QWork quali) {
        return qworService.updateQWork(id, quali);
    }
    
    @DeleteMapping("/{id}")
    public void deleteQWork(@PathVariable Long id) {
        qworService.deleteQWork(id);
    }
    
    @GetMapping
    public List<QWork> getAllQWork() {
        return qworService.getAllQWork();
    }
}
