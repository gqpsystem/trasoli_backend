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
    private long idSolicitud;

    @Column(name = "num_expediente",nullable = false,length = 10)
    private String numExpediente;

    @Column(name = "fecha_recepcion",nullable = false)
    private Date fechaRecepcion;

    @Column(name = "estado",nullable = false)
    private boolean estado;

    @Column(name = "asunto",nullable = false,length = 250)
    private String asunto;

    @ManyToOne
    @JoinColumn(name = "id_establecimiento", nullable = false)
    private Establecimiento establecimiento;

    @ManyToOne
    @JoinColumn(name = "id_licencia", nullable = false)
    private Licencia licencia;


}
