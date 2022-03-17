package com.megafact.service.impl;

import com.megafact.model.Personal;
import com.megafact.repository.IPersonalDAO;
import com.megafact.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalServiceImpl implements IPersonalService {

    @Autowired
    private IPersonalDAO dao;

    @Override
    public List<Personal> listar() {
        return dao.findAll();
    }
}
