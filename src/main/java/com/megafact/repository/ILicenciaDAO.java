package com.megafact.repository;

import com.megafact.model.Licencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

    public interface ILicenciaDAO extends JpaRepository<Licencia,Long> {

        }
