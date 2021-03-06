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
@Table(name="persona")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idpersona")
    private Long id;
    
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    
    @Getter @Setter @Column (name = "apellido")
    private String apellido;
    
    @Getter @Setter @Column (name = "telefono")
    private String telefono;
    
    @Getter @Setter @Column (name = "pais_idpais")
    private Long pais_idpais;
    
    
}
