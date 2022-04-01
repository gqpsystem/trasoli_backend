package com.megafact.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Entity
@Table(name = "licencia_requisito")
public class LicenciaRequisito {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLicenciaRequisito;

    @ManyToOne
    @JoinColumn(name = "id_requisito", nullable = false)
    private Requisito requisito;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_licencia", nullable = false)
    private Licencia licencia;

//    @JsonBackReference
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_licencia", nullable = false)
//    private Licencia licencia;

    public long getIdLicenciaRequisito() {
        return idLicenciaRequisito;
    }

    public void setIdLicenciaRequisito(long idLicenciaRequisito) {
        this.idLicenciaRequisito = idLicenciaRequisito;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public Requisito getRequisito() {
        return requisito;
    }

    public void setRequisito(Requisito requisito) {
        this.requisito = requisito;
    }
}
