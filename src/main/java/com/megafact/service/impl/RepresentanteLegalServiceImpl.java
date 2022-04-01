package com.megafact.service.impl;

import com.megafact.model.RepresentanteLegal;
import com.megafact.repository.IRepresentanteLegalDAO;
import com.megafact.service.IRepresentanteLegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RepresentanteLegalServiceImpl extends CRUDImpl<RepresentanteLegal,Long>  implements IRepresentanteLegalService {

    @Autowired
    private IRepresentanteLegalDAO dao;

    @Override
    protected JpaRepository<RepresentanteLegal, Long> getDao() {
        return dao;
    }

}
