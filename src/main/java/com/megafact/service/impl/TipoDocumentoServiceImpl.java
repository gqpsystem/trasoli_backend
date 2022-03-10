package com.megafact.service.impl;

import com.megafact.model.TipoDocumento;
import com.megafact.repository.ITipoDocumentoDAO;
import com.megafact.service.ITipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoServiceImpl implements ITipoDocumentoService {

    @Autowired
    private ITipoDocumentoDAO dao;

    @Override
    public List<TipoDocumento> listar() {
        return dao.findAll();
    }

    @Override
    public TipoDocumento listarId(Long idTipoDocumento) {
        return dao.findById(idTipoDocumento).get();
    }

    @Override
    public TipoDocumento registrar(TipoDocumento tipoDocumento) {
        return dao.save(tipoDocumento);
    }

    @Override
    public TipoDocumento modificar(TipoDocumento tipoDocumento) {
        return dao.save(tipoDocumento);
    }

    @Override
    public void eliminar(Long idTipoDocumento) {
        dao.deleteById(idTipoDocumento);
    }
}
