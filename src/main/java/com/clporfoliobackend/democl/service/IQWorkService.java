/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clporfoliobackend.democl.service;


import com.clporfoliobackend.democl.Controller.model.QWork;
import java.util.List;



public interface IQWorkService {
     public List<QWork> getAllQWork();
    
    public QWork newQWork(QWork quali);
    
    public void deleteQWork(Long id);
    
    public QWork getQWork(Long id);
    
    public QWork updateQWork(Long id, QWork quali);
}
