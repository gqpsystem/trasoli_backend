package com.megafact.model;

import com.sun.tools.javac.comp.Resolve;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="requisito")
public class Requisito {
@Id
    private long id;
}
