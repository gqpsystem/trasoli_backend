package com.megafact.repository;

import com.megafact.model.RepresentanteLegal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IRepresentanteLegalDAO extends JpaRepository<RepresentanteLegal,Long> {

    ArrayList<RepresentanteLegal> findByNum_partida(String num_partida);
}
