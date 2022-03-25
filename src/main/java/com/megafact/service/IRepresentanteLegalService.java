package com.megafact.service;

import com.megafact.model.RepresentanteLegal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface IRepresentanteLegalService {

        List<RepresentanteLegal> listar();

        RepresentanteLegal crearRepresentanteLegal(RepresentanteLegal representanteLegal);

        Optional<RepresentanteLegal> mostrarRepresentanteLegalPorId(long idRepresentantelegal);

        RepresentanteLegal actualizarRepresentanteLegal(RepresentanteLegal representanteLegal);

        ArrayList<RepresentanteLegal> obtenerPorNumPartida(String num_partida);

        boolean eliminarRepresentanteLegal(Long idRepresentanteLegal);

    }
