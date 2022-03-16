package com.megafact.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "tipoLicencia")
public class TipoLicencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoLic;

    @Column(name = "desctipolic", nullable = false, length = 60)
    private String desctipolic;

    
    @Column(name = "requisitostipolic", nullable = false, length = 500)
    private String requisitostipolic;


    @Column(name = "vigenciatipolic", nullable = false, length = 100)
    private boolean vigenciatipolic;

    @Column(name = "indicaciontipolic", nullable = false, length = 50)
    private String indicaciones;

    public Long getIdTipoLic() {
        return this.idTipoLic;
    }

    public void setIdTipoLic(Long idTipoLic) {
        this.idTipoLic = idTipoLic;
    }

    public Object getDesctipolic() {
        return this.desctipolic;
    }

    public void setDesctipolic(String desctipolic) {
        this.desctipolic = desctipolic;
    }

}
