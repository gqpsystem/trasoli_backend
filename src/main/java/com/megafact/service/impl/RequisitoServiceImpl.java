package com.megafact.service.impl;


import com.megafact.model.Requisito;
import com.megafact.repository.IRequisitoDAO;
import com.megafact.service.IRequisitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequisitoServiceImpl implements IRequisitoService {
    @Autowired
    private IRequisitoDAO dao;

    @Override
    public List<Requisito> listar() {
        return dao.findAll();
    }

    @Override
    public Requisito listarId(Long idRequisito){return dao.findById(idRequisito).get();}

    @Override
    public Requisito registrar(Requisito requisito){return dao.save(requisito);}

    @Override
    public Requisito modificar(Requisito requisito){return dao.save(requisito);}

    @Override
    public void eliminar(Long idRequisito)  {
        dao.deleteById(idRequisito);}



}
