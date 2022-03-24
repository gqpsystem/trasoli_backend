package com.megafact.service;

import com.megafact.model.Persona;

import java.util.List;

public interface IPersonaService {

    Persona registrar(Persona persona);

    Persona modificar(Persona persona);

    void eliminar(int idPersona);

    Persona listarId(int idPersona);

    List<Persona> listar();
}
