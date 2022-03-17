package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "establecimiento")
public class Establecimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEstablecimiento;

    @Column(name = "codigo_establecimiento")
    private String codigoEstablecimiento;

    @Column(name = "nombre_establecimiento")
    private String nombreEstablecimiento;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "zona")
    private String zona;




}
