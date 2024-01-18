package com.pruebatecnica.rolly.service;

import com.pruebatecnica.rolly.model.Persona;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PersonaService {
 List<Persona> ordenarListaPersona();

 List<Persona>  ordenarPersonaPorAppPaterno();

}
