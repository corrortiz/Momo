package com.aohys.Datos;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Datos {
    @Id
    @GeneratedValue
    private Long datosId;
    private String piso;
    private String nombrePaciente;
    private String rfcPaciente;
    private String servicioResponsable;
    private String numeroDeCama;
    private String tipoDeEstudio;
    private String servicioSolicitante;
    private String personalSolicitanteDeEstudios;

    private boolean estudioFueAtendido;
    private String personalQueAtendioElEstudio;

    @Column(columnDefinition = "TEXT")
    private String notasAdicionales;
    private Timestamp fecha;


    public Datos() {
    }

    public Long getDatosId() {
        return datosId;
    }

    public void setDatosId(Long datosId) {
        this.datosId = datosId;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getRfcPaciente() {
        return rfcPaciente;
    }

    public void setRfcPaciente(String rfcPaciente) {
        this.rfcPaciente = rfcPaciente;
    }

    public String getTipoDeEstudio() {
        return tipoDeEstudio;
    }

    public void setTipoDeEstudio(String tipoDeEstudio) {
        this.tipoDeEstudio = tipoDeEstudio;
    }

    public String getServicioSolicitante() {
        return servicioSolicitante;
    }

    public void setServicioSolicitante(String servicioSolicitante) {
        this.servicioSolicitante = servicioSolicitante;
    }

    public String getPersonalSolicitanteDeEstudios() {
        return personalSolicitanteDeEstudios;
    }

    public void setPersonalSolicitanteDeEstudios(String personalSolicitanteDeEstudios) {
        this.personalSolicitanteDeEstudios = personalSolicitanteDeEstudios;
    }

    public String getNotasAdicionales() {
        return notasAdicionales;
    }

    public void setNotasAdicionales(String notasAdicionales) {
        this.notasAdicionales = notasAdicionales;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getServicioResponsable() {
        return servicioResponsable;
    }

    public void setServicioResponsable(String servicioResponsable) {
        this.servicioResponsable = servicioResponsable;
    }

    public String getNumeroDeCama() {
        return numeroDeCama;
    }

    public void setNumeroDeCama(String numeroDeCama) {
        this.numeroDeCama = numeroDeCama;
    }

    public boolean isEstudioFueAtendido() {
        return estudioFueAtendido;
    }

    public void setEstudioFueAtendido(boolean estudioFueAtendido) {
        this.estudioFueAtendido = estudioFueAtendido;
    }

    public String getPersonalQueAtendioElEstudio() {
        return personalQueAtendioElEstudio;
    }

    public void setPersonalQueAtendioElEstudio(String personalQueAtendioElEstudio) {
        this.personalQueAtendioElEstudio = personalQueAtendioElEstudio;
    }
}
