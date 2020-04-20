package com.example.correo.controllers;

import com.example.correo.model.Envio;
import com.example.correo.model.response.EnvioResponse;
import com.example.correo.model.response.PersonaResponse;
import com.example.correo.services.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvioController {

    private final EnvioService envioService;

    @Autowired
    public EnvioController(EnvioService envioService) {
        this.envioService = envioService;

    }
    /*Me gustaria tener un ejemplo del put mapping*/
    @PostMapping(value = "/saveCarta")
    public ResponseEntity<Envio> saveCarta(Long remitenteId, Long destinatarioId) {

        return ResponseEntity.ok(envioService.saveCarta(remitenteId, destinatarioId));
    }

    @PostMapping(value = "/savePaquete")
    public ResponseEntity<Envio> savePaquete(double peso, double alto, double ancho, Long remitenteId, Long destinatarioId) {

        Envio envio = envioService.savePaquete(peso, alto, ancho, remitenteId, destinatarioId);

        PersonaResponse remitente = PersonaResponse.builder()
                .nombre(envio.getRemitente().getNombre())
                .apellido(envio.getRemitente().getApellido())
                .direccion(envio.getRemitente().getDireccion())
                .build();

        PersonaResponse destinatario = PersonaResponse.builder()
                .nombre(envio.getDestinatario().getNombre())
                .apellido(envio.getDestinatario().getApellido())
                .direccion(envio.getDestinatario().getDireccion())
                .build();

        EnvioResponse response = EnvioResponse.builder()
                .peso(envio.getPeso())
                .ancho(envio.getAncho())
                .alto(envio.getAlto())
                .destinatario(destinatario)
                .remitente(remitente)
                .build();

        return ResponseEntity.ok(response);
    }
}
