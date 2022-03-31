
package com.megafact.repository;
import com.megafact.model.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IEmpresaDAO extends JpaRepository<Empresa,Long> {
    ArrayList<Empresa> findByRepresentanteLegal(Long idRepresentantelegal);
}
