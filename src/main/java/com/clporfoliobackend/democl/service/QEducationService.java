/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.QEducation;
import com.clporfoliobackend.democl.repository.QEducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QEducationService implements IQEducationService {
    
    @Autowired
    public QEducationRepository  QEduRepository;
    
    @Override
    public QEducation newQEducation(QEducation quali) {
        return QEduRepository.save(quali);
    }
    
    @Override
    public QEducation getQEducation(Long id) {
        return QEduRepository.findById(id).orElse(null);
    }
    
    @Override
    public  QEducation updateQEducation(Long id,QEducation quali){
        QEducation existingQEducation = QEduRepository.findById(id).orElse(null);
        if (existingQEducation != null) {
            existingQEducation.setTitle(quali.getTitle());
            existingQEducation.setSubtitle(quali.getSubtitle());
            existingQEducation.setDate(quali.getDate());
            return QEduRepository.save(existingQEducation);
        }
        return null;
    }
    
    @Override
    public void deleteQEducation(Long id) {
        QEduRepository.deleteById(id);
    }
    
    @Override
    public List<QEducation> getAllQEducation() {
        return QEduRepository.findAll();
    }
    
}
