package com.megafact.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Licencia")
public class Licencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLicencia;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "resolucion", nullable = false, length = 20)
    private String resolucion;

       
    @OneToMany( targetEntity=Solicitud.class )
     private List solicitudList;

     public List getSolicitudlist() 
     {
        return solicitudList;
     }
  
     public void setSolicitudlist(List solicitudList) 
     {
        this.solicitudList = solicitudList;
     }

   @OneToMany( targetEntity=LicenciaRequisito.class )
     private long licenciaRequisitoList;



}
