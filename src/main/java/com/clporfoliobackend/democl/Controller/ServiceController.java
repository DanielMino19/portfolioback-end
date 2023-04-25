/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.Controller;


import com.clporfoliobackend.democl.Controller.model.Services;
import com.clporfoliobackend.democl.service.IServiceService;
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
@RequestMapping("/api/service")
public class ServiceController {
   
            @Autowired
    private IServiceService servService;
    
    @GetMapping("/{id}")
    public Services getService(@PathVariable Long id) {
        return servService.getService(id);
    }
    
    @PostMapping
    public Services createService(@RequestBody Services serv) {
        return servService.createService(serv);
    }
    
    @PutMapping("/{id}")
    public Services updateService(@PathVariable Long id, @RequestBody Services serv) {
        return servService.updateService(id, serv);
    }
    
    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id) {
        servService.deleteService(id);
    }
    
    @GetMapping
    public List<Services> getAllService() {
        return servService.getAllService();
    }
}
