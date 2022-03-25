package com.megafact.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "licencia")
public class Licencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_licencia", nullable = false, length = 11)
    private long idLicencia; //no acepta null

    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaEmision;

    @Column(name = "numero_resolucion", nullable = false, length = 50)
    private String numeroResolucion;

    @OneToMany(mappedBy = "licencia", cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REMOVE}, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<LicenciaRequisito> licenciaRequisitos;



}
