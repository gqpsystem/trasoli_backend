package com.megafact.controller;

import com.megafact.model.Establecimiento;
import com.megafact.service.IEstablecimientoService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/establecimientos")
public class EstablecimientoController {

    private IEstablecimientoService establecimientoService;

    @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHealthCheck() {
        return "{ \"todoOk\" : true }";
    }


}
