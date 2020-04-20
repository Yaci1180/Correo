package com.example.correo.model.response;

import lombok.Builder;

@Builder
public class CartaResponse {
    private PersonaResponse destinatario;
    private PersonaResponse remitente;
}