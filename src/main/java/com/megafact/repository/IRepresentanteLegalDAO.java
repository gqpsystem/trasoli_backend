package com.megafact.repository;

import com.megafact.model.Persona;
import com.megafact.model.RepresentanteLegal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IRepresentanteLegalDAO extends JpaRepository<RepresentanteLegal, Long> {
    //public Persona findByPersonaId(int personaId);
    ArrayList<RepresentanteLegal> findByNumeroPartida(String num_partida);
}
