package com.megafact.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "licencia_requisito")
public class LicenciaRequisito {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_licencia_requisito", unique = true, nullable = false)
    private long idLicenciaRequisito;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_licencia", nullable = false)
    private Licencia licencia;

    @ManyToOne
    @JoinColumn(name = "id_requisito", nullable = false)
    private Requisito requisito;

}
