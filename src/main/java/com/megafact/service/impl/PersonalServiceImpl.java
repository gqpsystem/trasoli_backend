package com.megafact.service.impl;

import com.megafact.model.Personal;
import com.megafact.repository.IPersonalDAO;
import com.megafact.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalServiceImpl implements IPersonalService {

    @Autowired
    private IPersonalDAO dao;

    @Override
    public List<Personal> listar() {
        return dao.findAll();
    }

    @Override
    public Personal crearPersonal(Personal personal) {
        return dao.save(personal);
    }

    @Override
    public Personal mostrarPersonalPorId(long idPersonal) {
        return dao.findById(idPersonal).orElse(null);
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
