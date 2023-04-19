/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.QEducation;
import java.util.List;


public interface IQEducationService {
    
    public List<QEducation> getAllQEducation();
    
    public QEducation newQEducation(QEducation quali);
    
    public void deleteQEducation(Long id);
    
    public QEducation getQEducation(Long id);
    
    public QEducation updateQEducation(Long id, QEducation quali);

}
