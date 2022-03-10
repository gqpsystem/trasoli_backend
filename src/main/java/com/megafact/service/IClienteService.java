package com.megafact.service;

import com.megafact.model.Cliente;
import com.megafact.model.TipoDocumento;

import java.util.List;

public interface IClienteService {

    List<Cliente> listar();

    Cliente listarId(Long idCliente);

    Cliente registrar(Cliente cliente);

    Cliente modificar(Cliente cliente);
}
