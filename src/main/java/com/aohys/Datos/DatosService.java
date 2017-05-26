package com.aohys.Datos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class DatosService {
    DatosRepository datosRepository;
    @Autowired
    public DatosService(DatosRepository datosRepository) {
        this.datosRepository = datosRepository;
    }

    public Iterable<Datos> getAll() {
        return datosRepository.findAll();
    }

    public Datos addEntity(Datos datos) {
        datos.setFecha(Timestamp.valueOf(LocalDateTime.now()));
        datos.setEstudioFueAtendido(false);
        return datosRepository.save(datos);
    }

    public Datos getEntity(Long id) {
        return datosRepository.findOne(id);
    }

    public Datos updateEntity(Datos datos) {
        return datosRepository.save(datos);
    }

    public void deleteEntity(Long id) {
        datosRepository.delete(id);
    }

    public List<Datos> allOrderNoAtendidos(){
        return datosRepository.findAllByEstudioFueAtendidoFalseOrderByFechaDesc();
    }
}
