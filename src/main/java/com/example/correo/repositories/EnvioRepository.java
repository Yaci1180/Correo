package com.example.correo.repositories;
import com.example.correo.model.AbstractEnvio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
/*Pq esta extiende abstract envio?*/
public interface EnvioRepository extends JpaRepository<AbstractEnvio, Long> {
}

