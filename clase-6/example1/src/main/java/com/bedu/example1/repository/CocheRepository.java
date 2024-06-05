package com.bedu.example1.repository;

import com.bedu.example1.model.Coche;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


/*
* La base del CRUD se realiza aquí.
* Crear, Leer, Actualizar y Eliminar
**/

@Repository
public class CocheRepository {

    List<Coche> coches = new ArrayList<Coche>();

    public Coche agregarCoche(Coche coche){
        coches.add(coche);
        return coche;
    }

    public List<Coche> obtenerCoches(){
        return coches;
    }

    public Coche eliminarCoche(String placas){
        Coche coche = obtenerCoche(placas);
        if (coche != null){
            coches.remove(coche);
        }
        return coche;
    }

    public Coche actualizarCoche(Coche coche){
        Coche cocheActual = obtenerCoche(coche.getPlacas());
        if (cocheActual != null){
            cocheActual.setMarca(coche.getMarca());
            cocheActual.setModelo(coche.getModelo());
            cocheActual.setColor(coche.getColor());
            cocheActual.setAnio(coche.getAnio());
            cocheActual.setPropietario(coche.getPropietario());
            cocheActual.setAseguradora(coche.getAseguradora());
            cocheActual.setTipoSeguro(coche.getTipoSeguro());
            cocheActual.setPoliza(coche.getPoliza());
            cocheActual.setCobertura(coche.getCobertura());
            cocheActual.setTipoCobertura(coche.getTipoCobertura());
            cocheActual.setObservaciones(coche.getObservaciones());
        }
        return cocheActual;
    }

    public Coche obtenerCoche(String placas){
        for (Coche coche : coches){
            if (coche.getPlacas().equals(placas)){
                return coche;
            }
        }
        return null;
    }
}
