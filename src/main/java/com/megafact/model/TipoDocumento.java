package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "tipo_documento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTipoDocumento;

    @Column(name = "codTipoDocumento", nullable = true, length = 20)
    private String codTipoDocumento;

    @Column(name = "abreviatura", nullable = true, length = 20)
    private String abreviatura;

    @Column(name = "denominacion", nullable = true, length = 50)
    private String denominacion;

}
