package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Licencia")
public class Licencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLicencia;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "resolucion", nullable = false, length = 20)
    private String resolucion;

    @Column(name = "id_requisicto", nullable = false, length = 8)
    private long id_requisicto;
}
