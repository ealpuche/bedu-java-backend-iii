package com.bedu.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Perro implements Serializable {
    private String nombre;
    private int edad;
    private String raza;

    @Override
    public String toString() {
        return "Hola soy " + nombre + ", tengo " + edad + " años y soy de raza " + raza;
    }

}
