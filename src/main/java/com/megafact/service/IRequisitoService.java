package com.megafact.service;

import java.util.List;

import com.megafact.model.Requisito;

public interface IRequisitoService {

	  List<Requisito> listar();

	  Requisito listarId(Long idRequisito);
	
	  Requisito registrar(Requisito requisito);
	    
	  Requisito modificar(Requisito requisito);
}
