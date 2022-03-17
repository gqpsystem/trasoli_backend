package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "establecimiento")
public class Establecimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEstablecimiento;
}
