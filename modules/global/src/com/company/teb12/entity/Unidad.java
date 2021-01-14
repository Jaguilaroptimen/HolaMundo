package com.company.teb12.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "TEB12_UNIDAD")
@Entity(name = "teb12_Unidad")
@NamePattern("%s|unidad")
public class Unidad extends StandardEntity {
    private static final long serialVersionUID = 7160488936970143139L;

    @NotNull
    @Column(name = "UNIDAD", nullable = false, unique = true, length = 12)
    private String unidad;

    @NotNull
    @Column(name = "MATRICULA", nullable = false, unique = true, length = 13)
    private String matricula;

    @NotNull
    @Column(name = "TIPO", nullable = false)
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}