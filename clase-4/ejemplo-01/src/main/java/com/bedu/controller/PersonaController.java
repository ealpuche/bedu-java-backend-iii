package com.bedu.controller;

import com.bedu.model.Persona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @GetMapping("/persona")
    public Persona getPersona(){
        return new Persona("Juanes", "Pérez", 25, "Calle 123");
    }

    @GetMapping("/saludo")
    public String getSaludo(){
        return "Hola Mundo";
    }


}
