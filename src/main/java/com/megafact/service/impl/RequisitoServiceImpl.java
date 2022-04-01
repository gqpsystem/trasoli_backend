package com.megafact.service.impl;


import com.megafact.model.Requisito;
import com.megafact.repository.IRequisitoDAO;
import com.megafact.service.IRequisitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequisitoServiceImpl extends CRUDImpl<Requisito,Long> implements IRequisitoService {

    @Autowired
    private IRequisitoDAO dao;

    @Override
    protected JpaRepository<Requisito, Long> getDao() {
        return dao;
    }
}
