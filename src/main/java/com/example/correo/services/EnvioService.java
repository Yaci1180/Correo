package com.example.correo.services;

import com.example.correo.model.Envio;

public interface EnvioService {
/*Aca no podria simplemente pedir un strinf de remitente y destinatario?*/
    Envio saveCarta(Long remitenteId, Long destinatarioId);
    Envio savePaquete(double peso, double alto, double ancho, Long remitenteId, Long destinatarioId);

}
