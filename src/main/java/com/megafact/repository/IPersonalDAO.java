package com.megafact.repository;

import com.megafact.model.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonalDAO extends JpaRepository<Personal,Long> {

}
