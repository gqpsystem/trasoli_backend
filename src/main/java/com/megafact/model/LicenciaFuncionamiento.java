package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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


}
