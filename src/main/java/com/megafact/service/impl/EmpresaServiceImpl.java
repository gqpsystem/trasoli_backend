package com.megafact.service.impl;

import java.util.List;

import com.megafact.model.Empresa;
import com.megafact.repository.IEmpresaDAO;
import com.megafact.service.IEmpresaService;

import org.springframework.beans.factory.annotation.Autowired;

public class EmpresaServiceImpl implements IEmpresaService {

    @Autowired
    private IEmpresaDAO dao;

    @Override
    public List<Empresa> listar() {
        return dao.findAll();
    }

    @Override
    public Empresa listarId(Long idEmpresa) {
        return dao.findById(idEmpresa).get();
    }

    @Override
    public Empresa registrar(Empresa empresa) {
        return dao.save(empresa);
    }

    @Override
    public Empresa modificar(Empresa empresa) {
        return dao.save(empresa);
    }

    @Override
    public void eliminar(Long idEmpresa) {
        dao.deleteById(idEmpresa);
    }
}
