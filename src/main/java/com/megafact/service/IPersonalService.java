package com.megafact.service;

import com.megafact.model.Personal;
import com.megafact.model.TipoDocumento;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface IPersonalService {

    List<Personal> listar();

    Personal crearPersonal(Personal personal);

    Personal mostrarPersonalPorId(long idPersonal);

    Personal actualizarPersonal(Personal personal);

    void eliminarPersonal(Personal personal);

}
