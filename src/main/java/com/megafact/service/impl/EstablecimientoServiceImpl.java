package com.megafact.service.impl;

import com.megafact.model.Establecimiento;
import com.megafact.repository.IEstablecimientoDAO;
import com.megafact.service.IEstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstablecimientoServiceImpl extends CRUDImpl<Establecimiento, Long> implements IEstablecimientoService {

    @Autowired
    private IEstablecimientoDAO dao;

    @Override
    protected JpaRepository<Establecimiento, Long> getDao() {
        return dao;
    }
}
