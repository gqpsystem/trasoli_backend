package com.megafact.model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "Licencia")
public class Licencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_licencia", unique = true, nullable = false)
    private long idlicencia;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "resolucion", nullable = false, length = 20)
    private String resolucion;

    
    @OneToMany( targetEntity=Solicitud.class )
    @JoinColumn(name = "id_solicitud", nullable = false)   
     private Solicitud solicitud;

    @OneToMany( targetEntity=LicenciaRequisito.class )
    @JoinColumn(name = "id_licencia_requisito", nullable = false)   
     private LicenciaRequisito licenciaRequisito;

    public Long getIdLicencia() {
        return idlicencia;
    }

}
