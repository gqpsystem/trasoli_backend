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

    @Column(name = "razon_social", nullable = false, length = 50)
    private String razonSocial;

    @Column(name = "numeroDocumento", nullable = false, length = 11)
    private String numeroDocumento;

    @Column(name = "direccion", nullable = false, length = 150)
    private String direccion;

    @Column(name = "correo", nullable = false, length = 100)
    private String correo;

    @Column(name = "telefoMovil", nullable = false, length = 21)
    private String telefoMovil;

    @OneToOne
    @JoinColumn(name = "id_tipo_documento", nullable = false)
    private TipoDocumento tipoDocumento;
}
