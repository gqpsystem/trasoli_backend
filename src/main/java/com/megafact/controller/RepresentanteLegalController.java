package com.megafact.controller;

import com.megafact.model.RepresentanteLegal;
import com.megafact.service.IRepresentanteLegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/representantes")
public class RepresentanteLegalController {

    @Autowired
    private IRepresentanteLegalService service;

    @GetMapping(value = "/apicheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getApiCheck() {
        return "{ \"Ok\" : true }";
    }

    public List<RepresentanteLegal> listar(){
        return service.listar();
    }

    @PostMapping("/crear")
    public RepresentanteLegal crearRL(@RequestBody RepresentanteLegal representanteLegal){
        return service.registrar(representanteLegal);
    }
}
