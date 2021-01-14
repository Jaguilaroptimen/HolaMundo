package com.company.teb12.entity;

import com.haulmont.addon.maps.gis.Geometry;
import com.haulmont.addon.maps.gis.converters.wkt.CubaPointWKTConverter;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.locationtech.jts.geom.Point;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "TEB12_OPERADOR")
@Entity(name = "teb12_Operador")
@NamePattern("%s %s|nombre,apellidos")
public class Operador extends StandardEntity {
    private static final long serialVersionUID = -1217644855107715647L;

    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @NotNull
    @Column(name = "APELLIDOS", nullable = false)
    private String apellidos;

    @NotNull
    @Column(name = "MUNICIPIO", nullable = false)
    private String municipio;

    @NotNull
    @Column(name = "COLONIA", nullable = false)
    private String colonia;

    @NotNull
    @Column(name = "CALLE", nullable = false)
    private String calle;

    @NotNull
    @Column(name = "NUMERO", nullable = false)
    private String numero;

    @NotNull
    @MetaProperty(datatype = "GeoPoint", mandatory = true)
    @Column(name = "LOCALIZACION", nullable = false)
    @Geometry
    @Convert(converter = CubaPointWKTConverter.class)
    private Point localizacion;

    public Point getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Point localizacion) {
        this.localizacion = localizacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}