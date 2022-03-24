package com.megafact.service;


import com.megafact.model.Establecimiento;

import java.util.List;

public interface IEstablecimientoService {
    List<Establecimiento> listarEstablecimiento();
    Establecimiento crearEstablecimiento(Establecimiento establecimiento);
    Establecimiento mostrarEstablecimientoPorId(Long id);
    Establecimiento actualizarEstablecimiento(Establecimiento establecimiento);
    void eliminarEstablecimiento(Long id);

}
