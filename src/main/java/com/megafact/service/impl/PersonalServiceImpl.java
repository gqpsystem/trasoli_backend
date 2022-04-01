package com.megafact.service.impl;

import com.megafact.model.Personal;
import com.megafact.repository.IPersonalDAO;
import com.megafact.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalServiceImpl extends CRUDImpl<Personal,Long>  implements IPersonalService {

    @Autowired
    private IPersonalDAO dao;

    @Override
    protected JpaRepository<Personal, Long> getDao() {
        return dao;
    }
}
