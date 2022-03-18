package com.megafact.controller;

import com.megafact.model.Personal;
import com.megafact.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/personales")
public class PersonalController {

    @Autowired
    private IPersonalService service;

   /* @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHealthCheck() {
        return "{ \"todoOk\" : true }";
    } */

    @GetMapping("/lista")
    public List<Personal> listar(){
        return service.listar();
    }

    @PostMapping("/crear")
    public Personal crearPersonal(@RequestBody Personal personal){
        return service.crearPersonal(personal);
    }




}
