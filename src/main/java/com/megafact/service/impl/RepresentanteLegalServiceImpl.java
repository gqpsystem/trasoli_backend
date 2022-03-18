package com.megafact.service.impl;

import com.megafact.model.RepresentanteLegal;
import com.megafact.repository.IRepresentanteLegalDAO;
import com.megafact.service.IRepresentanteLegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepresentanteLegalServiceImpl implements IRepresentanteLegalService {

    @Autowired
    private IRepresentanteLegalDAO dao;

    @Override
    public List<RepresentanteLegal> listar() {
        return dao.findAll();
    }

    @Override
    public RepresentanteLegal listarId(Long idRepresentanteLegal) {
        return dao.findById(idRepresentanteLegal).get();
    }

    @Override
    public RepresentanteLegal registrar(RepresentanteLegal representanteLegal) {
        return dao.save(representanteLegal);
    }

    @Override
    public RepresentanteLegal modificar(RepresentanteLegal representanteLegal) {
        return dao.save(representanteLegal);
    }

    @Override
    public void eliminar(Long idRepresentanteLegal) {
        dao.deleteById(idRepresentanteLegal);
    }
}
