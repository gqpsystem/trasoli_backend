package com.megafact.controller;

import com.megafact.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/personales")
public class PersonalController {

    @Autowired
    private IPersonalService service;

    @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHealthCheck() {
        return "{ \"todoOk\" : true }";
    }
}
