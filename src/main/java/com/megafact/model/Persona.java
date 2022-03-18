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
    private long id_persona;

    @Column(name = "razon_social", nullable = false, length = 50)
    private String razonSocial;

    @Column(name = "numero_documento", nullable = false, length = 11)
    private String numeroDocumento;

    @Column(name = "direccion", nullable = false, length = 30)
    private String direccion;

    @Column(name = "correo", nullable = false, length = 30)
    private String correo;

    @Column(name = "tel_movil", nullable = false, length = 9)
    private String tel_movil;

    @OneToOne
    @JoinColumn(name = "id_tipo_documento", nullable = false)
    private TipoDocumento tipoDocumento;
}
