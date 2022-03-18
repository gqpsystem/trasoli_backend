package com.megafact.repository;

import com.megafact.model.Requisito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRequisitoDAO extends JpaRepository<Requisito,Long> {
}
