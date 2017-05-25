package com.aohys.Datos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/datos")
public class DatosController {
    DatosService datosService;
    @Autowired
    public DatosController(DatosService datosService) {
        this.datosService = datosService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Datos> list(){
        return datosService.getAll();
    }

    @RequestMapping( value = "", method = RequestMethod.POST )
    public Datos addEntity(@RequestBody Datos datos){
        return datosService.addEntity(datos);
    }
}
