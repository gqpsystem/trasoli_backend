package com.megafact.service;


import com.megafact.model.Requisito;

import java.util.List;

public interface IRequisitoService {
    Requisito registrar(Requisito requisito);
    Requisito modificar(Requisito requisito);
    void eliminar(int idRequisito);
    Requisito listarId(int idRequisito);
    List<Requisito> listar();


}
