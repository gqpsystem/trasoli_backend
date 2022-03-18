package com.megafact.repository;

import com.megafact.model.RepresentanteLegal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepresentanteLegalDAO extends JpaRepository<RepresentanteLegal,Long> {

}
