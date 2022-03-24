package com.megafact.service.impl;

import com.megafact.model.Establecimiento;
import com.megafact.repository.IEstablecimientoDAO;
import com.megafact.service.IEstablecimientoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstablecimientoServiceImpl implements IEstablecimientoService {
    private IEstablecimientoDAO iEstablecimientoDAO;

    @Override
    public List<Establecimiento> listarEstablecimiento() {
        return iEstablecimientoDAO.findAll();
    }

    @Override
    public Establecimiento crearEstablecimiento(Establecimiento establecimiento) {
        return iEstablecimientoDAO.save(establecimiento);
    }

    @Override
    public Establecimiento mostrarEstablecimientoPorId(Long id) {
        if(id==null){
            return null;
                    }else{
            return iEstablecimientoDAO.findById(id).get();
        }

    }

    @Override
    public Establecimiento actualizarEstablecimiento(Establecimiento establecimiento) {
        return null;
    }

    @Override
    public void eliminarEstablecimiento(Long id) {

    }
}
