package com.bedu.example1.service;

import com.bedu.example1.model.Coche;
import com.bedu.example1.repository.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCoche {

    @Autowired
    CocheRepository repositoryCoche;

    public Coche agregarCoche(Coche coche){
        return repositoryCoche.agregarCoche(coche);
    }

    public Coche eliminarCoche(String placas){
        return repositoryCoche.eliminarCoche(placas);
    }

    public Coche actualizarCoche(Coche coche){
        return repositoryCoche.actualizarCoche(coche);
    }

    public List<Coche> obtenerCoches(){
        return repositoryCoche.obtenerCoches();
    }

    public Coche obtenerCoche(String placas){
        return repositoryCoche.obtenerCoche(placas);
    }

}
