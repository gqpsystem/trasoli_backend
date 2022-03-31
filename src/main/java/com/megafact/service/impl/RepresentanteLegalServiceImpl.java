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
    private IRepresentanteLegalDAO iRepresentanteLegalDAO;

    @Override
    public List<RepresentanteLegal> listar() {
        return iRepresentanteLegalDAO.findAll();
    }

    @Override
    public RepresentanteLegal crearRepresentanteLegal(RepresentanteLegal representanteLegal) {
        return iRepresentanteLegalDAO.save(representanteLegal);
    }

    @Override
    public Optional<RepresentanteLegal> mostrarRepresentanteLegalPorId(Long idRepresentantelegal) {
        return iRepresentanteLegalDAO.findById(idRepresentantelegal);
    }

    @Override
    public RepresentanteLegal actualizarRepresentanteLegal(RepresentanteLegal representanteLegal) {
        return iRepresentanteLegalDAO.save(representanteLegal);
    }

    @Override
    public ArrayList<RepresentanteLegal> obtenerPorNumPartida(String num_partida) {
        return iRepresentanteLegalDAO.findByNumeroPartida(num_partida);
    }

    @Override
    public boolean eliminarRepresentanteLegal(Long idRepresentanteLegal) {
        try{
            iRepresentanteLegalDAO.deleteById(idRepresentanteLegal);
            return true;
        } catch(Exception err){
            return false;
        }
    }
}
