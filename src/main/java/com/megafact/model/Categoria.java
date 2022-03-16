package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcategotia;

    @Column(name = "codcategotia", nullable = false, length = 8)
    private String codcategotia;

    @Column(name = "desccategotia", nullable = false, length = 30)
    private String desccategotia;

    @Column(name = "factorcategoria", nullable = false)
    private float factorcategoria;



}
