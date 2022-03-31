package com.megafact.controller;

import com.megafact.model.Empresa;
import com.megafact.service.IEmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/empresas")
public class EmpresaController {

    @Autowired
    private IEmpresaService service;

    @GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
    public String getHealthCheck() {
        return "{ \"todoOk\" : true }";
    }

    //@GetMapping(value = "/list-empresa",produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping
    public ResponseEntity<?> listar() {
        List<Empresa> list = new ArrayList<>();
        try {
            list = service.listar();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    //@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping
    public ResponseEntity<Object> registrar(@RequestBody Empresa empresa) {
        try {
            Empresa empresa1 = service.registrar(empresa);
            return new ResponseEntity<>(empresa1, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping( path = "/{id}")
    public Optional<Empresa> obtenerEmpresaPorId(@PathVariable("id") Long id) {
        return this.service.listarId(id);
    }

    @GetMapping("/queryRL")
    public ArrayList<Empresa> obtenerEmpresaPorRL(@RequestParam("idRepresentanteLegal") Long idRepresentanteLegal){
        return this.service.obtenerPorRL(idRepresentanteLegal);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.service.eliminar(id);
        if (ok){
            return "Se eliminó la empresa con id " + id;
        }else{
            return "No pudo eliminar la empresa con id" + id;
        }
    }
}
