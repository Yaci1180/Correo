package com.example.correo.model;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "paquetes")
@Getter @Setter @Builder @NoArgsConstructor
@DiscriminatorValue(value=EnvioType.Values.PAQUETE)
public class Paquete extends AbstractEnvio {

    public void setParams(double peso, double alto, double ancho, Persona remitente, Persona destinatario) {
        super.setPeso(peso);
        super.setAlto(alto);
        super.setAncho(ancho);
        super.setRemitente(remitente);
        super.setDestinatario(destinatario);
    }
}

