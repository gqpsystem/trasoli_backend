package com.megafact.service.impl;

import com.megafact.model.Solicitud;
import com.megafact.repository.ISolicitudDAO;
import com.megafact.service.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudServiceImpl extends CRUDImpl<Solicitud,Long> implements ISolicitudService {

    @Autowired
    private ISolicitudDAO dao;

    @Override
    protected JpaRepository<Solicitud, Long> getDao() {
        return dao;
    }
}
