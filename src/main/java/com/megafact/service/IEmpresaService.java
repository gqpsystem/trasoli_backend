package com.megafact.service;

import java.util.List;

import com.megafact.model.Empresa;
import com.megafact.model.TipoDocumento;

public interface IEmpresaService {

    List<Empresa> listar();

    Empresa listarId(Long idEmpresa);

    Empresa registrar(Empresa empresa);

    Empresa modificar(Empresa empresa);

    void eliminar(Long idEmpresa);
    
}
