package com.megafact.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "requisito")
public class Requisito {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_requisito", unique = true, nullable = false)
    private long idRequisito;

    @Column(name = "ficha_ruc",nullable = false,length = 12)
    private String fichaRuc;

    @Column(name = "certificado_defensacivil",nullable = false,length = 50)
    private String certificadoDefensaCivil;
    
    @Column(name = "numero_recibo",nullable = false,length = 12)
    private String numeroRecibo;
    
    @Column(name = "estado_requisito",nullable = false,length = 12)
    private Boolean estadoRequisito;
	
}
