package com.megafact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.megafact.model.Empresa;
import com.megafact.model.RepresentanteLegal;
import com.megafact.model.TipoDocumento;

public interface IEmpresaService {

    List<Empresa> listar();

    //Mostrar por ID
    Optional<Empresa> listarId(Long idEmpresa);

    //Crear
    Empresa registrar(Empresa empresa);

    //Actualizar
    Empresa modificar(Empresa empresa);

    ArrayList<Empresa> obtenerPorRL(Long representanteLegal);

    boolean eliminar(Long idEmpresa);
    
}
