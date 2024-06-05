package com.bedu.example1.controller;

import com.bedu.example1.model.Coche;
import com.bedu.example1.service.ServiceCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CocheController {

    @Autowired
    private ServiceCoche serviceCoche;

    @GetMapping("/coches")
    public List<Coche> obtenerCoches(){
        return serviceCoche.obtenerCoches();
    }

    @PutMapping("/coches")
    public Coche agregarCoche(@RequestBody Coche coche){
        return serviceCoche.agregarCoche(coche);
    }

    @DeleteMapping("/coches/{placas}")
    public Coche eliminarCoche(@PathVariable String placas){
        return serviceCoche.eliminarCoche(placas);
    }

    @GetMapping("/coches/{placas}")
    public Coche obtenerCoche(@PathVariable String placas){
        return serviceCoche.obtenerCoche(placas);
    }

    @PostMapping("/coches")
    public Coche actualizarCoche(@RequestBody Coche coche){
        return serviceCoche.actualizarCoche(coche);
    }

}
