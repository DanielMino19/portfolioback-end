/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.Services;
import com.clporfoliobackend.democl.repository.ServiceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceService implements IServiceService{
    @Autowired
    public ServiceRepository  serviceRepository;
    
    public Services createService(Services serv) {
        return serviceRepository.save(serv);
    }
    
    public Services getService(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }
    
    public Services updateService(Long id, Services serv) {
        Services existingServices = serviceRepository.findById(id).orElse(null);
        if (existingServices != null) {
            existingServices.setIcono(serv.getIcono());
            existingServices.setTitle(serv.getTitle());
            existingServices.setParrafo1(serv.getParrafo1());
            existingServices.setParrafo2(serv.getParrafo2());
            existingServices.setParrafo3(serv.getParrafo3());
            return serviceRepository.save(existingServices);
        }
        return null;
    }
    
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
    
    public List<Services> getAllService() {
        return serviceRepository.findAll();
    }
}
