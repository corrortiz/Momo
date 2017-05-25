package com.aohys.Datos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
