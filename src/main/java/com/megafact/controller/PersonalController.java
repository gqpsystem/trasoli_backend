package com.megafact.controller;

import com.megafact.dto.PersonalDTO;
import com.megafact.model.Persona;
import com.megafact.model.Personal;
import com.megafact.model.TipoDocumento;
import com.megafact.service.IPersonaService;
import com.megafact.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;


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

    @GetMapping(value = "/list-personal",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> listar() {
        List<Personal> list = new ArrayList<>();
        try {
            list = service.listar();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

   @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> registrar(@RequestBody PersonalDTO rep) {

       try {
           Persona persona = personaService.registrar(rep.getPersona());
           rep.getPersonal().setPersona(persona);
           Personal personal = service.crearPersonal(rep.getPersonal());
           return new ResponseEntity<>(personal, HttpStatus.OK);
       } catch (Exception e) {
           return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

}
