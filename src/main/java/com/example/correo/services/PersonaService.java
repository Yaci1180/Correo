package com.example.correo.services;
import com.example.correo.model.Persona;

import java.util.List;

public interface PersonaService {

    Persona createPersona(String nombre, String apellido, String direccion);
    List<Persona> verPersonas();
}
