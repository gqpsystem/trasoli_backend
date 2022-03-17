package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(
        name = "representante_legal"
)

public class RepresentanteLegal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idRepresentanteLegal;

    @Column(name = "num_partida", length = 50)
    String num_partida;


    //Long id_persona;
}
