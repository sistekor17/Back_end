/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolio.backEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author JAMES
 */
@Entity
@Getter @Setter 
public class Users {
    @Id
    @GeneratedValue
    private long id;
    
    private String name;
    private String lastName;
    private String telephone;
    private String email;
    private String aboutMe;
    private String urlPicture;
}
