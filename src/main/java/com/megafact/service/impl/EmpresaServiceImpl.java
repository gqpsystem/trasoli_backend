package com.megafact.service.impl;

import com.megafact.model.Empresa;
import com.megafact.repository.IEmpresaDAO;
import com.megafact.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl extends CRUDImpl<Empresa,Long>  implements IEmpresaService {

    @Autowired
    private IEmpresaDAO dao;

    @Override
    protected JpaRepository<Empresa, Long> getDao() {
        return dao;
    }
}
