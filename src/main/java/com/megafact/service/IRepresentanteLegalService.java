package com.megafact.service;

import com.megafact.model.RepresentanteLegal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface IRepresentanteLegalService {

    List<RepresentanteLegal> listar();

    Optional<RepresentanteLegal> listarId(Long idRepresentanteLegal);

    RepresentanteLegal registrar(RepresentanteLegal representanteLegal);

    RepresentanteLegal modificar(RepresentanteLegal representanteLegal);

    ArrayList<RepresentanteLegal> obtenerPorNumPartida(String num_partida);

    boolean eliminar(Long idRepresentanteLegal);

}
