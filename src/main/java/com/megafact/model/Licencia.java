package com.megafact.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;


//@Getter
//@Setter
@Entity
@Table(name = "licencia")
public class Licencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLicencia; //no acepta null

    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaEmision;

    @Column(name = "numero_resolucion", nullable = false, length = 50)
    private String numeroResolucion;

    @JsonIgnore
//    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="licencia")
    @OneToMany(mappedBy = "licencia", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<LicenciaRequisito> detalle;

    public long getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(long idLicencia) {
        this.idLicencia = idLicencia;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getNumeroResolucion() {
        return numeroResolucion;
    }

    public void setNumeroResolucion(String numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }

    public List<LicenciaRequisito> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<LicenciaRequisito> detalle) {
        this.detalle = detalle;
    }
}
