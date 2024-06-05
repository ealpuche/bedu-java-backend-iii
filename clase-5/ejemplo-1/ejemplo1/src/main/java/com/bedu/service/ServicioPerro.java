package com.bedu.service;

import com.bedu.model.Perro;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioPerro implements Serializable {
    List<Perro> perros = new ArrayList<Perro>();

    public ServicioPerro() {
        perros.add(new Perro("Firulais", 3, "Pastor Alemán"));
        perros.add(new Perro("Firulais", 5, "Cooker"));
        perros.add(new Perro("Rex", 5, "Labrador"));
        perros.add(new Perro("Bobby", 2, "Chihuahua"));
    }


    public List<Perro> getPerros() {
        return perros;
    }

    public Perro addPerro(Perro p) {
        perros.add(p);
        return p;
    }

    public List<Perro> getPerros(String nombre) {
        return perros.stream().filter(p -> p.getNombre().equals(nombre)).toList();
    }

}
