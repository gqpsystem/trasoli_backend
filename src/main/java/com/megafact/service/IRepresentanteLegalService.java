package com.megafact.service;

import com.megafact.model.RepresentanteLegal;

import java.util.List;

public interface IRepresentanteLegalService {

    List<RepresentanteLegal> listar();

    RepresentanteLegal listarId(Long idRepresentanteLegal);

    RepresentanteLegal registrar(RepresentanteLegal representanteLegal);

    RepresentanteLegal modificar(RepresentanteLegal representanteLegal);

    void eliminar(Long idRepresentanteLegal);

}
