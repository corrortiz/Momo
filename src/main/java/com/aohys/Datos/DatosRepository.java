package com.aohys.Datos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DatosRepository extends CrudRepository<Datos, Long> {
    List<Datos> findAllByNombreLike (String nombre);
}
