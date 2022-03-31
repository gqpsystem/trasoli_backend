package com.megafact.controller;
import com.megafact.model.Licencia;
import com.megafact.service.ILicenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/licencias")
public class LicenciaController {

    @Autowired
    private ILicenciaService service;

    @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHealthCheck() {
        return "{ \"todoOk\" : true }";
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> listar() {
        List<Licencia> list = new ArrayList<>();
        try {
            list = service.listar();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value = "/listar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> listarId(@PathVariable("id") Long id) {
        try {
            //revisar
            Licencia licencia = service.listarId(id);
            return new ResponseEntity<>(licencia, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> registrar(@RequestBody Licencia licencias) {
        try {
            service.registrar(licencias);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(licencias, HttpStatus.OK);
    }



}
