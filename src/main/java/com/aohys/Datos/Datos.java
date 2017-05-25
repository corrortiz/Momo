package com.aohys.Datos;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Datos {
    @Id
    @GeneratedValue
    private Long datosId;

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Datos(String nombre, String apellidoPaterno, String apellidoMaterno, Date fecha) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fecha = fecha;
    }

    public Datos() {
    }

    public Long getDatosId() {
        return datosId;
    }

    public void setDatosId(Long datosId) {
        this.datosId = datosId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
