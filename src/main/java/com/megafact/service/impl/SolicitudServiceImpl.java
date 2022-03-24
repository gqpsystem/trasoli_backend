package com.megafact.service.impl;

import com.megafact.model.Solicitud;
import com.megafact.repository.ISolicitudDAO;
import com.megafact.service.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudServiceImpl implements ISolicitudService {

    @Autowired
    private ISolicitudDAO dao;

    @Override
    public List<Solicitud> listar() {
        return dao.findAll();
    }

    @Override
    public Solicitud crearSolicitud(Solicitud solicitud) {
        return dao.save(solicitud);
    }

    @Override
    public Solicitud mostrarSolicitudPorId(long idSolicitud) {
        return dao.findById(idSolicitud).orElse(null);
    }

    @Override
    public Solicitud actualizarSolicitud(Solicitud solicitud) {
        return dao.save(solicitud);
    }

    @Override
    public void eliminarSolicitud(Solicitud solicitud) {
        dao.save(solicitud);
    }
}
