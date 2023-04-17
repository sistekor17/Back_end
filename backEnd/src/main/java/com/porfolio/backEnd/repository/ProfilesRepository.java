/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.backEnd.repository;

import com.porfolio.backEnd.model.Profiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JAMES
 */
@Repository
public interface ProfilesRepository extends JpaRepository<Profiles, Long>{
    
} 
