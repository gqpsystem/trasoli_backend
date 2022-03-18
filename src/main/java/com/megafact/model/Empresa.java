package com.megafact.model;

import javax.persistence.*;

public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_empresa;


    @Column(name = "razon_social", nullable = false, length = 30)
    private String razon_social;

    
    @Column(name = "nombre_social", nullable = false, length = 30)
    private String nombre_comercial;

    @Column(name = "numero_ruc", nullable = false, length = 15)
    private String numero_ruc;

    @Column(name = "actividad", nullable = false, length = 25)
    private String actividad;


    @Column(name = "zonificacion", nullable = false, length = 30)
    private String zonificacion;

    
    @Column(name = "id_representante", nullable = false, length = 15)
    private Long id_representante;

    @Column(name = "id_giro", nullable = false, length = 20)
    private Long id_giro_negocio;

}
