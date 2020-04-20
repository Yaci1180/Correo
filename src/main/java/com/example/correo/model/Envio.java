package com.example.correo.model;

public interface Envio {

    double getPeso();
    double getAncho();
    double getAlto();
    /* el error no era que devuelve un objeto infinitamente entonces esto deberia ser un String/ long dependiendo si pido id?*/
    Persona getDestinatario();
    Persona getRemitente();
}
