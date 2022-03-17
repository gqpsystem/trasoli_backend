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
    Long idRepresentanteLegal;

    @Column(name = "num_partida", length = 50)
    String num_partida;

    @OneToOne
            @JoinColumn(name = "id_persona", nullable = false )
    Persona persona;
}
