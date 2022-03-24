package com.megafact.service;

import com.megafact.model.Solicitud;

import java.util.List;

public interface ISolicitudService {

    List<Solicitud> listar();

    Solicitud crearSolicitud(Solicitud solicitud);

    Solicitud mostrarSolicitudPorId(long idSolicitud);

    Solicitud actualizarSolicitud(Solicitud solicitud);

    void eliminarSolicitud(Solicitud solicitud);
}
