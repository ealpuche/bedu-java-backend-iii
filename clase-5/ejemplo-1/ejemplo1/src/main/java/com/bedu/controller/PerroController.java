package com.bedu.controller;

import com.bedu.model.Perro;
import com.bedu.service.ServicioPerro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PerroController {

    @Autowired
    ServicioPerro servicioPerro;

    @GetMapping("/perros")
    public List<Perro> getPerros() {
        return servicioPerro.getPerros();
    }

    @GetMapping("/perros/{nombre}")
    public List<Perro> getPerros(@PathVariable String nombre) {
        return servicioPerro.getPerros(nombre);
    }

}
