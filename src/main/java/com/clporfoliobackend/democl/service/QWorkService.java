/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clporfoliobackend.democl.service;

import com.clporfoliobackend.democl.Controller.model.QEducation;
import com.clporfoliobackend.democl.Controller.model.QWork;
import com.clporfoliobackend.democl.repository.QWorkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QWorkService implements IQWorkService{
    @Autowired
    public QWorkRepository  QWorRepository;
    
    @Override
    public QWork newQWork(QWork quali) {
        return QWorRepository.save(quali);
    }
    
    @Override
    public QWork getQWork(Long id) {
        return QWorRepository.findById(id).orElse(null);
    }
    
    @Override
    public  QWork updateQWork(Long id,QWork quali){
        QWork existingQWork = QWorRepository.findById(id).orElse(null);
        if (existingQWork != null) {
            existingQWork.setTitle(quali.getTitle());
            existingQWork.setSubtitle(quali.getSubtitle());
            existingQWork.setDate(quali.getDate());
            return QWorRepository.save(existingQWork);
        }
        return null;
    }
    
    @Override
    public void deleteQWork(Long id) {
        QWorRepository.deleteById(id);
    }
    
    @Override
    public List<QWork> getAllQWork() {
        return QWorRepository.findAll();
    }
    
}
