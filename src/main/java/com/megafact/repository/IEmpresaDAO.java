
package com.megafact.repository;
import com.megafact.model.Empresa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IEmpresaDAO extends JpaRepository<Empresa,Long> {
    
}
