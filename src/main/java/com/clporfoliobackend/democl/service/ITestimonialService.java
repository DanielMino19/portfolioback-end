/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.Swipper;
import com.clporfoliobackend.democl.Controller.model.Testimonial;
import java.util.List;

/**
 *
 * @author Ella no te ama
 */
public interface ITestimonialService {
        public Testimonial createTestimonial(Testimonial testi) ;
        
    public Testimonial getTestimonial(Long id) ;
        
    public Testimonial updateTestimonial(Long id, Testimonial testi) ;

    public void deleteTestimonial(Long id) ;
       
    public List<Testimonial> getAllTestimonial();
    
}
