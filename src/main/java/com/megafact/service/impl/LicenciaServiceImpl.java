package com.megafact.service.impl;

import com.megafact.model.Licencia;
import com.megafact.repository.ILicenciaDAO;
import com.megafact.service.ILicenciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class LicenciaServiceImpl implements ILicenciaService {

    @Autowired
    private ILicenciaDAO dao;

    @Override
    public List<Licencia> listar() {

        return dao.findAll();
    }

    @Override
    public Licencia crearLicencia(Licencia licencia) {
        Optional<Licencia> guardar = dao.findById(licencia.getIdLicencia());
        return dao.save(licencia);
    }

    @Override
    public Optional<Licencia> mostrarLicenciaPorId(long id) {
        return dao.findById(id);
    }

    @Override
    public Licencia actualizarLicencia(Licencia actLicencia) {
        return dao.save(actLicencia);
    }

    @Override
    public void eliminarLicencia(long id) {
        dao.deleteById(id);
    }

}
