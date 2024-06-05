package com.bedu.example0.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;



@NoArgsConstructor
@Getter
@Setter
@ToString
public class Usuario implements Serializable{
    @NotNull
    @NotEmpty
    @NotBlank

    @Email  private String nombre;
    @Size(min = 2, max = 50)
    private String apellido;
    private String email;
    private String direccion;
}
