/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.service;



import com.clporfoliobackend.democl.Controller.model.Testimonial;
import com.clporfoliobackend.democl.repository.TestimonialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestimonialService implements ITestimonialService {
      
    @Autowired
    public TestimonialRepository  TestiRepository;
    
    public Testimonial createTestimonial(Testimonial testi) {
        return TestiRepository.save(testi);
    }
    
    public Testimonial getTestimonial(Long id) {
        return TestiRepository.findById(id).orElse(null);
    }
    
    public Testimonial updateTestimonial(Long id, Testimonial testi) {
        Testimonial existingTestimonial = TestiRepository.findById(id).orElse(null);
        if (existingTestimonial != null) {
            existingTestimonial.setImg(testi.getImg());
            existingTestimonial.setName(testi.getName());
            existingTestimonial.setParrafo(testi.getParrafo());
            return TestiRepository.save(existingTestimonial);
        }
        return null;
    }
    
    public void deleteTestimonial(Long id) {
        TestiRepository.deleteById(id);
    }
    
    public List<Testimonial> getAllTestimonial() {
        return TestiRepository.findAll();
    }
}
