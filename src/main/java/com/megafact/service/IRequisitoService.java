package com.megafact.service;


import com.megafact.model.Requisito;

import java.util.List;

public interface IRequisitoService {
    List<Requisito> listar();
    Requisito listarId(Long idRequisito);
    Requisito registrar(Requisito requisito);
    Requisito modificar(Requisito requisito);

    void eliminar(Long idRequisito);
}
