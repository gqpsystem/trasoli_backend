package com.megafact.service;

import com.megafact.model.Personal;

import java.util.List;
import java.util.Optional;

public interface IPersonalService {

    List<Personal> listar();

    Optional<Personal> listId(Long idPersonal);

    Optional<Personal> listarPorId(Long idPersonal);

    Personal crearPersonal(Personal personal);

    Personal actualizarPersonal(Personal personal);

    void eliminarPersonal(Personal personal);

}
