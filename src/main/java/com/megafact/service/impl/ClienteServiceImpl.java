package com.megafact.service.impl;

import com.megafact.model.Cliente;
import com.megafact.repository.IClienteDAO;
import com.megafact.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDAO dao;

    @Override
    public List<Cliente> listar() {
        return dao.findAll();
    }

    @Override
    public Cliente listarId(Long idCliente) {
        return dao.findById(idCliente).orElse(null);
    }

    @Override
    public Cliente registrar(Cliente cliente) {
        return dao.save(cliente);
    }

    @Override
    public Cliente modificar(Cliente cliente) {
        return dao.save(cliente);
    }
}
