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

    @Column(name = "fecha_recepcion",nullable = false)
    private Date fecha_recepcion;

    @Column(name = "estado",nullable = false)
    private boolean estado;

    @Column(name = "asunto",nullable = false,length = 50)
    private String asunto;

    @ManyToOne
    @JoinColumn(name = "id_establecimiento", nullable = false)
    private Establecimiento establecimiento;

    @OneToOne
    @JoinColumn(name = "id_licencia", nullable = false)
    private Licencia licencia;
}
