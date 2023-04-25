package com.porfolio.backEnd.security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author JAMES
 */
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nickname;
    @Column(unique = true)
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;
//    Cardinalidad de tablas: ROl - Ususario relacion de muchos a muchos.
    @ManyToMany(fetch = FetchType.EAGER)
//  Este es el codigo de la tabla intermedia que va a tener el nombre  "user_rol", la cual contiene dos columnas
    // relacion usuario-rol: un usuario puede tener varios roles y un rol lo pueden terner varios usuarios.
    @JoinTable(name = "user_rol", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();
}
