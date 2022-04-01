package com.megafact.service.impl;

import com.megafact.model.Persona;
import com.megafact.repository.IPersonaDAO;
import com.megafact.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends CRUDImpl<Persona,Long>  implements IPersonaService {

    @Autowired
    private IPersonaDAO dao;

    @Override
    protected JpaRepository<Persona, Long> getDao() {
        return dao;
    }
}
