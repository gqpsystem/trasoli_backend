package com.megafact.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.megafact.model.Empresa;
import com.megafact.repository.IEmpresaDAO;
import com.megafact.service.IEmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Autowired
    private IEmpresaDAO dao;

    @Override
    public List<Empresa> listar() {
        return dao.findAll();
    }

    @Override
    public Optional<Empresa> listarId(Long idEmpresa) {
        return dao.findById(idEmpresa);
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
    public ArrayList<Empresa> obtenerPorRL(Long representanteLegal) {
        return dao.findByRepresentanteLegal(representanteLegal);
    }

    @Override
    public boolean eliminar(Long idEmpresa) {

        try {
            dao.deleteById(idEmpresa);
            return true;
        } catch(Exception err){
            return false;
        }
    }
}
