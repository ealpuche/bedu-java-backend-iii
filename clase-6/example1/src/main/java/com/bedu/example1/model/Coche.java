package com.bedu.example1.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
/*
*
* {
*   "marca": "Nissan",
*  "modelo": "Versa",
* "color": "Blanco",
* "anio": 2019,
* "placas": "HJK-1234",
* "propietario": "Juan Perez",
* "aseguradora": "AXA",
* "tipoSeguro": "Amplia",
* "poliza": "123456789",
* "cobertura": "Daños a terceros",
* "tipoCobertura": "Amplia",
* "observaciones": "Ninguna"
* }
* */
public class Coche implements java.io.Serializable{
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    private String placas;
    private String propietario;
    private String aseguradora;
    private String tipoSeguro;
    private String poliza;
    private String cobertura;
    private String tipoCobertura;
    private String observaciones;

}
