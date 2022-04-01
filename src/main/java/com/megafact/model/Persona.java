package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPersona;

    @Column(name = "razon_social", nullable = false, length = 150)
    private String razonSocial;

    //@Min(value = 8,message = "Min 8")
    //@Max(value = 11,message = "Max 8")
    @Column(name = "numeroDocumento", nullable = false, length = 11)
    private String numeroDocumento;

    @Column(name = "direccion", nullable = false, length = 150)
    private String direccion;

    @Email(message = "el correo no es valido (ejemplo megafact@gmail.com)")
    @Column(name = "correo", nullable = false, length = 100)
    private String correo;

    @Column(name = "telefoMovil", nullable = false, length = 22)
    private String telefoMovil;

    @OneToOne
    @JoinColumn(name = "id_tipo_documento", nullable = false)
    private TipoDocumento tipoDocumento;
}
