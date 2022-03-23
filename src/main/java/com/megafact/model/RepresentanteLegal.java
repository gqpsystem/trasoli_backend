package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "representante_legal")
public class RepresentanteLegal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRepresentanteLegal;

    @Column(name = "numero_partida", nullable = true, length = 50)
    private String numeroPartida;

    @OneToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;
}
