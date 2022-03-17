package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "solicitud")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_solicitud;

    @Column(name = "num_expediente",nullable = false,length = 10)
    private String num_expediente;

    private Date fecha_recepcion;

    private boolean estado;

    @Column(name = "asunto",nullable = false,length = 50)
    private String asunto;

    private long id_empresa;

    private long id_licencia;


}
