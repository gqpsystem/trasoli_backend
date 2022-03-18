package com.megafact.service;

import com.megafact.model.Licencia;
import java.util.List;
import java.util.Optional;

public interface ILicenciaService {

    List<Licencia> listar();

    Licencia crearLicencia(Licencia licencia);

    Optional<Licencia> mostrarLicenciaPorId(long id);

    Licencia actualizarLicencia(Licencia actLicencia);

    void eliminarLicencia(long id);

}
