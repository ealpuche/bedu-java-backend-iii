package com.bedu.model;


import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
}