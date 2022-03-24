package com.megafact.repository;

import com.megafact.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISolicitudDAO extends JpaRepository<Solicitud,Long> {
}
