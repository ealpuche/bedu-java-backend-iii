package com.bedu.actividad1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@ToString
/*
{
    "id": 1,
    "nombre": "Juan",
    "apellido": "Perez",
    "fechaNacimiento": "1990-01-01",
    "curp": "PEMJ900101HDFRRL09",
    "direccion": "Calle 123",
    "telefono": "1234567890",
    "email": "example@example.com",
    "seguro": "Seguro Popular",
    "tipoSangre": "O+",
    "alergias": "Ninguna",
    "padecimientos": "Ninguno",
    "medicamentos": "Ninguno",
    "observaciones": "Ninguna"
}
**/
public class Paciente implements Serializable {
    private int id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String curp;
    private String direccion;
    private String telefono;
    private String email;
    private String seguro;
    private String tipoSangre;
    private String alergias;
    private String padecimientos;
    private String medicamentos;
    private String observaciones;
}
