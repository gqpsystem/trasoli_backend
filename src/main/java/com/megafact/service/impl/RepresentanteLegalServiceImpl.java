package com.megafact.service.impl;

import com.megafact.model.RepresentanteLegal;
import com.megafact.repository.IRepresentanteLegalDAO;
import com.megafact.service.IRepresentanteLegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RepresentanteLegalServiceImpl implements IRepresentanteLegalService {

    @Autowired
    private IRepresentanteLegalDAO dao;

    @Override
    public List<RepresentanteLegal> listar() {
        return dao.findAll();
    }

    @Override
    public Optional<RepresentanteLegal> listarId(Long idRepresentanteLegal) {
        return dao.findById(idRepresentanteLegal);
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
    public ArrayList<RepresentanteLegal> obtenerPorNumPartida(String num_partida) {
        return dao.findByNum_partida(num_partida);
    }

    @Override
    public boolean eliminar(Long idRepresentanteLegal) {
        try {
            dao.deleteById(idRepresentanteLegal);
            return true;
        } catch(Exception err){
            return false;
        }
    }
}
