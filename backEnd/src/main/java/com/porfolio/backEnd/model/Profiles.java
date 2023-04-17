
package com.porfolio.backEnd.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author JAMES
 */
@Entity
@Getter @Setter
public class Profiles {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    
    @Basic
    private String fullName;
    private String profession;
    private String imgeProfile;
}
