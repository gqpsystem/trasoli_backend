package com.megafact.controller;

import com.megafact.dto.PersonalDTO;
import com.megafact.model.Persona;
import com.megafact.model.Personal;
import com.megafact.service.IPersonaService;
import com.megafact.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping(value = "/api/personales")
public class PersonalController {

    @Autowired
    private IPersonalService service;

    @Autowired
    private IPersonaService personaService;

   @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHealthCheck() {
        return "{ \"todoOk\" : true }";
    }

    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> registrar(@RequestBody PersonalDTO rep) {
        Persona persona = personaService.registrar(rep.getPersona());
        rep.getPersonal().setPersona(persona);
        Personal personales = service.crearPersonal(rep.getPersonal());
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(personales.getIdPersonal()).toUri();
        return ResponseEntity.created(location).build();
    }


}
