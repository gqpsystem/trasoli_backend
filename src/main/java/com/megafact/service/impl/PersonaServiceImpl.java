package com.megafact.service.impl;

import com.megafact.model.Persona;
import com.megafact.repository.IPersonaDAO;
import com.megafact.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDAO dao;


    @Override
    public Persona registrar(Persona persona) {
        return dao.save(persona);
    }

    @Override
    public Persona modificar(Persona persona) {
        return null;
    }

    @Override
    public void eliminar(int idPersona) {

    }

    @Override
    public Persona listarId(int idPersona) {
        return null;
    }

    @Override
    public List<Persona> listar() {
        return null;
    }
}
