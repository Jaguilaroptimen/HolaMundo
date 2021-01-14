package com.company.teb12.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "TEB12_ROSTER")
@Entity(name = "teb12_Roster")
public class Roster extends StandardEntity {
    private static final long serialVersionUID = -8315367079356756989L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OPERADOR_ID")
    private UnidadOperador operador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RUTA_ID")
    private Ruta ruta;

    public void setOperador(UnidadOperador operador) {
        this.operador = operador;
    }

    public UnidadOperador getOperador() {
        return operador;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

}