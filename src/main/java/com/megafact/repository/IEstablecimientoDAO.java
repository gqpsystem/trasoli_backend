package com.megafact.repository;

import com.megafact.model.Establecimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstablecimientoDAO extends JpaRepository<Establecimiento,Long> {

}
