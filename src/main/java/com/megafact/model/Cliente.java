package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.swing.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(name = "nombreCliente",nullable = false,length = 100)
    private String nombreCliente;

}
