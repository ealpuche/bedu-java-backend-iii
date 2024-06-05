package com.bedu.example0.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Perro implements Serializable{
    private String nombre;
    private String raza;
    private int edad;
}
