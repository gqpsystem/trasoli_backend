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

    @Column(name = "codigo_establecimiento", nullable = false,length = 20)
    private String codigoEstablecimiento;

    @Column(name = "nombre_establecimiento", nullable = false,length = 100)
    private String nombreEstablecimiento;

    @Column(name = "telefono", nullable = false,length = 50)
    private String telefono;

    @Column(name = "direccion", nullable = false,length = 100)
    private String direccion;

    @Column(name = "departamento" , nullable = false,length = 50)
    private String departamento;

    @Column(name = "provincia", nullable = false,length = 50)
    private String provincia;

    @Column(name = "distrito", nullable = false,length = 50)
    private String distrito;

    @Column(name = "zona" , nullable = false,length = 40)
    private String zona;

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa empresa;

}
