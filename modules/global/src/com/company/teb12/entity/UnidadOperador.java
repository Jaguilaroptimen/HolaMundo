package com.company.teb12.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TEB12_UNIDAD_OPERADOR")
@Entity(name = "teb12_UnidadOperador")
@NamePattern("%s %s|operador,unidad")
public class UnidadOperador extends StandardEntity {
    private static final long serialVersionUID = 8600747423930864986L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OPERADOR_ID")
    @NotNull
    private Operador operador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UNIDAD_ID")
    private Unidad unidad;

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public Operador getOperador() {
        return operador;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

}