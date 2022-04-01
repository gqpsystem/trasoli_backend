package com.megafact.controller;

import com.megafact.model.Solicitud;
import com.megafact.service.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/solicitudes")
public class SolicitudController {

    @Autowired
    private ISolicitudService service;

    @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHealthCheck() {
        return "{ \"todoOk\" : true }";
    }


    //@GetMapping(value = "/list-solicitud",produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping
    public ResponseEntity<?> listar() {
        List<Solicitud> list = new ArrayList<>();
        try {
            list = service.listar();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    /*
    {
    "asunto":"Solicito nueva licencia de funcionamiento",
    "estado":true,
    "fechaRecepcion":"2022-03-31",
    "numExpediente":"001-2022",
    "establecimiento":{
        "idEstablecimiento":2
        },
    "licencia":{
        "idLicencia":1
        }
    }
     */
    //@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping
    public ResponseEntity<Object> registrar(@RequestBody Solicitud solicitud) {
        try {
            Solicitud solicitud1 = service.crearSolicitud(solicitud);
            return new ResponseEntity<>(solicitud1, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping( path = "/{id}")
    public Solicitud obtenerEmpresaPorId(@PathVariable("id") Long id) {
        return this.service.mostrarSolicitudPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        Solicitud solicitud= new Solicitud();
        solicitud.setIdSolicitud(id);
        this.service.eliminarSolicitud(solicitud);
        return "Eliminado";
    }
}