package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPersona;

    @Column(name = "nombre", nullable = false, length = 200)
    private String nombre;

    @Column(name = "numeroDocumento", nullable = false, length = 11)
    private String numeroDocumento;
}
