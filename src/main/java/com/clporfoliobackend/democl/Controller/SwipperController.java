/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.Controller;


import com.clporfoliobackend.democl.Controller.model.Swipper;

import com.clporfoliobackend.democl.service.ISwipperService;
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
@RequestMapping("/api/swipper")
public class SwipperController {
          @Autowired
    private ISwipperService swipperService;
    
    @GetMapping("/{id}")
    @PreAuthorize("permitAll()")
    public Swipper getSwipper(@PathVariable Long id) {
        return swipperService.getSwipper(id);
    }
    
    @PostMapping
    public Swipper createSwipper(@RequestBody Swipper swip) {
        return swipperService.createSwipper(swip);
    }
    
    @PutMapping("/{id}")
    public Swipper updateSwipper(@PathVariable Long id, @RequestBody Swipper swip) {
        return swipperService.updateSwipper(id, swip);
    }
    
    @DeleteMapping("/{id}")
    public void deleteSwipper(@PathVariable Long id) {
        swipperService.deleteSwipper(id);
    }
    
    @GetMapping
    @PreAuthorize("permitAll()")
    public List<Swipper> getAllSwippers() {
        return swipperService.getAllSwippers();
    }
}
