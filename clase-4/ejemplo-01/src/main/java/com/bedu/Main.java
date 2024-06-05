package com.bedu;

import com.bedu.model.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Pérez", 25, "Calle 123");
        p1.setApellido("Mendez");
        System.out.println(p1);
    }
}
