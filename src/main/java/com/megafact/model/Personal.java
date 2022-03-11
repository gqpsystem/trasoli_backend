package com.megafact.model;

import javax.persistence.*;

@Table(name = "personal")
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonal;

    @Column(name = "nombrePersonal",nullable = false,length = 100)
    private String nombreCliente;

    @Column(name = "apellidosPersonal",nullable = false,length = 100)
    private String apellidosPersonal;

}
