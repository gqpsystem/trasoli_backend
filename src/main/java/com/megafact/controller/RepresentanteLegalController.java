package com.megafact.controller;

import com.megafact.model.RepresentanteLegal;
import com.megafact.service.IRepresentanteLegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/representantes")
public class RepresentanteLegalController {

    @Autowired
    private IRepresentanteLegalService service;

    @GetMapping(value = "/apicheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getApiCheck() {
        return "{ \"Ok\" : true }";
    }

    //@GetMapping("/lista")
    public List<RepresentanteLegal> listar(){
        return service.listar();
    }

    //@PostMapping("/crear")
    //public RepresentanteLegal crearRL(@RequestBody RepresentanteLegal representanteLegal){
    //    return service.registrar(representanteLegal);
    //}

    @PostMapping()
    public RepresentanteLegal guardarRepresentante(@RequestBody RepresentanteLegal representanteLegal){
        return this.service.registrar(representanteLegal);
    }

    @GetMapping( path = "/{id}")
    public Optional<RepresentanteLegal> obtenerRepresentantePorId(@PathVariable("id") Long id) {
        return this.service.listarId(id);
    }

    @GetMapping("/query")
    public ArrayList<RepresentanteLegal> obtenerUsuarioPorPrioridad(@RequestParam("num_partida") String num_partida){
        return this.service.obtenerPorNumPartida(num_partida);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.service.eliminar(id);
        if (ok){
            return "Se eliminó el representante con id " + id;
        }else{
            return "No pudo eliminar el representante con id" + id;
        }
    }


}
