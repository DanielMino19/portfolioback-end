/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.Services;
import java.util.List;



public interface IServiceService {
    public Services createService(Services serv) ;
        
    public Services getService(Long id) ;
        
    public Services updateService(Long id, Services serv) ;

    public void deleteService(Long id) ;
       
    public List<Services> getAllService() ;
}
