package com.megafact.controller;

import com.megafact.service.IRepresentanteLegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/replegales")
public class RepresentanteLegalController {

    @Autowired
    private IRepresentanteLegalService service;

    @GetMapping(value = "/apicheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHealthCheck() {
        return "{ \"yesOk\" : true }";
    }

}
