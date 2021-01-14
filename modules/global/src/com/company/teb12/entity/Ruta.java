package com.company.teb12.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "TEB12_RUTA")
@Entity(name = "teb12_Ruta")
@NamePattern("%s %s|nombre,fecha_inicio")
public class Ruta extends StandardEntity {
    private static final long serialVersionUID = 858062226330565263L;

    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PUNTO_INICIO_ID")
    private Localizacion punto_inicio;

    @JoinColumn(name = "PUNTO_FIN_ID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private Localizacion punto_fin;

    @NotNull
    @Column(name = "FECHA_INICIO", nullable = false)
    private LocalDateTime fecha_inicio;

    @NotNull
    @Column(name = "FECHA_FIN", nullable = false)
    private LocalDateTime fecha_fin;

    public void setPunto_fin(Localizacion punto_fin) {
        this.punto_fin = punto_fin;
    }

    public Localizacion getPunto_fin() {
        return punto_fin;
    }

    public LocalDateTime getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDateTime fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public LocalDateTime getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDateTime fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Localizacion getPunto_inicio() {
        return punto_inicio;
    }

    public void setPunto_inicio(Localizacion punto_inicio) {
        this.punto_inicio = punto_inicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}