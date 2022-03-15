package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "licencia_funcionamiento")
public class LicenciaFuncionamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLicencia;

    @Column(name = "nombre_razon_social", nullable = false, length = 60)
    private String nombre_razon_social;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;

    @Column(name = "ruc", nullable = false, length = 11)
    private int ruc;

    @Column(name = "categoria", nullable = false)
    private String categoria;

    @Column(name = "giro_negocio", nullable = false, length = 50)
    private String giro;

    @Column(name = "area", nullable = false, length = 7)
    private Float area;

    @Column(name = "fecha_emision_licencia", nullable = false)
    private LocalDateTime fechaEmiLic;

    @Column(name = "num_licencia", nullable = false, length = 15)
    private int numLicencia;

    @Column(name = "zona_comercio")
    private String zonificacion;

    @Column(name = "num_expediente", nullable = false, length = 20)
    private String numExpediente;

    @Column(name = "hora_cierre_negocio", nullable = false)
    private LocalTime horaAperturaNegocio;

    @Column(name = "hora_apertura_negocio", nullable = false)
    private LocalTime horaCierreNegocio;

    @Column(name = "observaciones", nullable = false, length = 200)
    private String observaciones;

    @Column(name = "indicaciones", nullable = false, length = 50)
    private String indicaciones;

    @PrePersist
    private void prePersist(){
        fechaEmiLic = LocalDateTime.now();
    }

}
