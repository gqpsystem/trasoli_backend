package com.megafact.model;

import com.sun.tools.javac.comp.Resolve;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="requisito")
public class Requisito {
@Id
    private long id;
}
