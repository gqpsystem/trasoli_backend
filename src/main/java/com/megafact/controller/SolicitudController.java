package com.megafact.controller;

import com.megafact.service.ISolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/api/solicitudes")
public class SolicitudController {

    @Autowired
    private ISolicitudService service;

    @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHealthCheck() {
        return "{ \"todoOk\" : true }";
    }

}