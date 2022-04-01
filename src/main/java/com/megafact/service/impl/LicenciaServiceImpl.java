package com.megafact.service.impl;

import com.megafact.model.Licencia;
import com.megafact.repository.ILicenciaDAO;
import com.megafact.service.ILicenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LicenciaServiceImpl extends CRUDImpl<Licencia,Long>  implements ILicenciaService {

    @Autowired
    private ILicenciaDAO dao;


    @Override
    protected JpaRepository<Licencia, Long> getDao() {
        return dao;
    }

    @Override
    public Licencia registrar(Licencia licencia) {
        licencia.getDetalle().forEach(x->x.setLicencia(licencia));
        return dao.save(licencia);
    }

}
