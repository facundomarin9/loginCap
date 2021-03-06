/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LoginCap.LoginCap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author rauux1
 */
@Entity
@Table(name ="usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name ="idusuario")
    private Long id;
    
    @Getter @Setter @Column(name ="nick")
    private String nick;
    
    @Getter @Setter @Column(name ="correo")
    private String correo;
    
    @Getter @Setter @Column(name ="password")
    private String password;
    
    @Getter @Setter @Column(name ="persona_idpersona")
    private Long persona_idpersona;
    
    @Getter @Setter @Column(name ="rol_idrol")
    private Long rol_idrol;
//    @Getter @Setter @Column(name ="usernick")
//    private String usernick;

   
    
    
}
