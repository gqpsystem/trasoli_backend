package com.megafact.service.impl;

import com.megafact.model.Personal;
import com.megafact.repository.IPersonalDAO;
import com.megafact.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

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
        Optional<Personal> guardar = dao.findById(personal.getIdPersonal());
        return dao.save(personal);
    }

    @Override
    public Optional<Personal> mostrarPersonalPorId(long id) {
        return dao.findById(id);
    }

    @Override
    public Personal actualizarPersonal(Personal actPersonal) {
        return dao.save(actPersonal);
    }

    @Override
    public void eliminarPersonal(long id) {
        dao.deleteById(id);
    }

}
