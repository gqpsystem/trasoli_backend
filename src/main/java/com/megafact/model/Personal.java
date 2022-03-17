package com.megafact.model;

import javax.persistence.*;

@Entity
@Table(name = "personal")
public class Personal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonal;

    @OneToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;

}
