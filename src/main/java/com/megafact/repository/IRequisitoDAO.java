package com.megafact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.megafact.model.Requisito;

public interface IRequisitoDAO extends JpaRepository<Requisito,Long> {

}
