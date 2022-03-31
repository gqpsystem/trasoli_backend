package com.megafact.service;

import com.megafact.model.Licencia;

import java.util.List;

public interface ILicenciaService {

    List<Licencia> listar();

    Licencia listarId(Long idLicencia);

    Licencia registrar(Licencia licencia);

    Licencia modificar(Licencia licencia);

    void eliminar(Long idLicencia);

}
