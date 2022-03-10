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

    @Column(name = "cod_tipo_documento",nullable = false,length = 10)
    private String codTipoDocumento;

    @Column(name = "denominacion",nullable = false,length = 50)
    private String denominacion;

}
