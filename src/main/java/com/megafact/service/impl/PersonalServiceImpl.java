package com.megafact.service.impl;

import com.megafact.model.Personal;
import com.megafact.repository.IPersonalDAO;
import com.megafact.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalServiceImpl implements IPersonalService {

    @Autowired
    private IPersonalDAO dao;

    @Override
    public List<Personal> listar() {
        return dao.findAll();//ll
    }

    @Override
    public Optional<Personal> listId(Long idPersonal) {
        return dao.findById(idPersonal);
    }

    @Override
    public Personal crearPersonal(Personal personal) {
        return dao.save(personal);
    }

    @Override
    public Optional<Personal> listarPorId(Long idPersonal) {
        return dao.findById(idPersonal);
    }

    @Override
    public Personal actualizarPersonal(Personal actPersonal) {
        return dao.save(actPersonal);
    }

    @Override
    public void eliminarPersonal(Personal personal) {
        dao.save(personal);
    }

}
