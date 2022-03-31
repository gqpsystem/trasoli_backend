package com.megafact.repository;

import com.megafact.model.LicenciaRequisito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILicenciaRequisitoDAO extends JpaRepository<LicenciaRequisito,Long> {

}
