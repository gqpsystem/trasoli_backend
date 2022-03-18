package com.megafact.service.impl;


import com.megafact.model.Requisito;
import com.megafact.repository.IRequisitoDAO;
import com.megafact.service.IRequisitoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RequisitoServiceImpl implements IRequisitoService {
    @Autowired
    private IRequisitoDAO dao;

    @Override
    public List<Requisito> listar() {
        return dao.findAll();
    }
}
