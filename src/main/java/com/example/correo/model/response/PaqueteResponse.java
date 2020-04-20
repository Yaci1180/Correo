package com.example.correo.model.response;

import lombok.Builder;

@Builder
public class PaqueteResponse {
    private double peso;
    private double ancho;
    private double alto;
    private PersonaResponse destinatario;
    private PersonaResponse remitente;
}
