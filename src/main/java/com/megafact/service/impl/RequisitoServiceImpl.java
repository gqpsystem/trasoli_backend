package com.megafact.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.megafact.model.Requisito;
import com.megafact.repository.IRequisitoDAO;
import com.megafact.service.IRequisitoService;

public class RequisitoServiceImpl implements IRequisitoService{

	@Autowired
	private IRequisitoDAO requisitoDao; 
	
	@Override
	public List<Requisito> listar() {
		// TODO Auto-generated method stub
		return requisitoDao.findAll();
	}

	@Override
	public Requisito listarId(Long idRequisito) {
		// TODO Auto-generated method stub
		return requisitoDao.findById(idRequisito).orElse(null);
	}

	@Override
	public Requisito registrar(Requisito requisito) {
		// TODO Auto-generated method stub
		return requisitoDao.save(requisito);
	}

	@Override
	public Requisito modificar(Requisito requisito) {
		// TODO Auto-generated method stub
		return requisitoDao.save(requisito);
	}

}
