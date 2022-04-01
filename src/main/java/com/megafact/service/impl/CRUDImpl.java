package com.megafact.service.impl;

import com.megafact.service.ICRUD;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class CRUDImpl <T,ID> implements ICRUD<T,ID> {

   protected abstract JpaRepository<T,ID> getDao();

    @Override
    public T registrar(T t) {
        return getDao().save(t);
    }

    @Override
    public T modificar(T t) {
        return getDao().save(t);
    }

    @Override
    public List<T> listar() {
        return getDao().findAll();
    }

    @Override
    public T listarPorId(ID id) {
        return getDao().findById(id).orElse(null);
    }

    @Override
    public void eliminar(ID id) {
        getDao().deleteById(id);
    }
}
