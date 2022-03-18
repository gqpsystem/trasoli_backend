package com.megafact.service.impl;

import com.megafact.model.Licencia;
import com.megafact.repository.ILicenciaDAO;
import com.megafact.service.ILicenciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenciaServiceImpl implements ILicenciaService {

    @Autowired
    private ILicenciaDAO dao;

    @Override
    public List<Licencia> listar() {
        return dao.findAll();
    }

}
