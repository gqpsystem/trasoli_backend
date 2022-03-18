package com.megafact.service;

import com.megafact.model.Personal;

import java.util.List;

public interface IPersonalService {

    List<Personal> listar();

    Personal crearPersonal(Personal personal);

    Personal mostrarPersonalPorId(long idPersonal);

    Personal actualizarPersonal(Personal personal);

    void eliminarPersonal(Personal personal);

}
