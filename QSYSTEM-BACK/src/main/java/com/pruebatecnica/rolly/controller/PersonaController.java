package com.pruebatecnica.rolly.controller;

import com.pruebatecnica.rolly.model.Persona;
import com.pruebatecnica.rolly.request.BusquedaRequest;
import com.pruebatecnica.rolly.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/persona")
public class  PersonaController {
    @Autowired
    PersonaService personaService;


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/ordenarListaPersona")
    ResponseEntity<List<Persona>> ordenarListaPersona() {
        return ResponseEntity
                .ok()
                .body( personaService.ordenarListaPersona());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/ordenarPersonaPorAppPaterno")
    ResponseEntity<List<Persona>> ordenarPersonaPorAppPaterno () {
        return ResponseEntity
                .ok()
                .body( personaService.ordenarPersonaPorAppPaterno());
    }



}


