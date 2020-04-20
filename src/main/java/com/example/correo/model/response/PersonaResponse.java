package com.example.correo.model.response;


import lombok.Builder;

@Builder
public class PersonaResponse {
    private String nombre;
    private String apellido;
    private String direccion;
}