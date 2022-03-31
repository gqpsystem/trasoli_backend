package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "giro_negocio")
public class GiroNegocio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGiroNegocio;

    @Column(name = "abrivatura", nullable = true, length = 20)
    private String abrivatura;

    @Column(name = "descripcion", nullable = true, length = 200)
    private String descripcion;

    @Column(name = "cod_ciiu", nullable = true, length = 20)
    private String codCiiu;


}
