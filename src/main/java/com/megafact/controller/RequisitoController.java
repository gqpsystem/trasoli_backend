package com.megafact.controller;

import com.megafact.service.IRequisitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/requisito")
public class RequisitoController {

    @Autowired
    private IRequisitoService service;

    @GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
    public String getHealthCheck() {
        return "{ \"todoOk\" : true }";
    }

}
