package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
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
