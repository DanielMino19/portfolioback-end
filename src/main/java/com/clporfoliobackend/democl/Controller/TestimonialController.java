/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.Controller;

import com.clporfoliobackend.democl.Controller.model.Swipper;
import com.clporfoliobackend.democl.Controller.model.Testimonial;
import com.clporfoliobackend.democl.service.ISwipperService;
import com.clporfoliobackend.democl.service.ITestimonialService;
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
@RequestMapping("/api/testimonial")
public class TestimonialController {
            @Autowired
    private ITestimonialService testiService;
    
    @GetMapping("/{id}")
    @PreAuthorize("permitAll()")
    public Testimonial getTetimonial(@PathVariable Long id) {
        return testiService.getTestimonial(id);
    }
    
    @PostMapping
    public Testimonial createTestimonial(@RequestBody Testimonial testi) {
        return testiService.createTestimonial(testi);
    }
    
    @PutMapping("/{id}")
    public Testimonial updateTestimonial(@PathVariable Long id, @RequestBody Testimonial testi) {
        return testiService.updateTestimonial(id, testi);
    }
    
    @DeleteMapping("/{id}")
    public void deleteTestimonial(@PathVariable Long id) {
        testiService.deleteTestimonial(id);
    }
    
    @GetMapping
    @PreAuthorize("permitAll()")
    public List<Testimonial> getAllTestimonial() {
        return testiService.getAllTestimonial();
    }
}
