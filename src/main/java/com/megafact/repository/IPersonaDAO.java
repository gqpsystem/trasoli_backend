package com.megafact.repository;

import com.megafact.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaDAO extends JpaRepository<Persona,Long> {

}
