/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Persona;
import com.portfolio.yoProgramo.repository.PersonaRepository;
import java.util.List;
import java.util.NoSuchElementException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService implements IPersonaService {
    @Autowired PersonaRepository rPersona;
    
    
    
   public List<Persona> list(){
        return rPersona.findAll();
    }
    
    public Persona getOne(Long id){
        Persona perso = rPersona.findById(id).orElse(null);
        return perso;
    }    
   
    
    public void save(Persona pers){
        rPersona.save(pers);
    }      
    
   
     public void delete(Long id){
        rPersona.deleteById(id);
    }    
     


    @Override
    public List<Persona> getPersona() {
        return rPersona.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
         rPersona.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
       rPersona.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = rPersona.findById(id).orElse(null);
        return perso;
    }
    
    @Override
     public void edit(Long id, Persona updatePersona){
        Persona persona = rPersona.findById(id).orElseThrow(()-> new NoSuchElementException("No se encuentra el perfil con el id: "+ id ));
        persona.setNombre(updatePersona.getNombre());
        persona.setTitulo(updatePersona.getTitulo());
        persona.setSobreMi(updatePersona.getSobreMi());
        persona.setBanner(updatePersona.getBanner());
        persona.setImg(updatePersona.getImg());
        persona.setEmail(updatePersona.getEmail());
        persona.setCurriculum(updatePersona.getCurriculum());
       
        rPersona.save(persona);
    }  
       
}