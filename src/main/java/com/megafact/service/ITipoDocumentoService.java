package com.megafact.service;

import com.megafact.model.TipoDocumento;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ITipoDocumentoService {

    List<TipoDocumento> listar();

    TipoDocumento listarId(Long idTipoDocumento);

    TipoDocumento registrar(TipoDocumento tipoDocumento);

    TipoDocumento modificar(TipoDocumento tipoDocumento);

    void eliminar(Long idTipoDocumento);

}
